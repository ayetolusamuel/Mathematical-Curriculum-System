package project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class AddBook extends JInternalFrame implements ActionListener, FocusListener {

	private JPanel pBook = new JPanel ();
	private JLabel lbBookId, lbBookName, lbBookAuthor, lbBookPrice, lbBookCategory;
	private JTextField txtBookId, txtBookName, txtBookAuthor, txtBookPrice;
	private JComboBox cboBookCategory;
	private String category[] = {"History", "Computers", "Science", "Arts"};	//ComboBox Items.
	private JButton btnOk, btnCancel;

	private Statement st;			//Statement for Getting the Required Table.
	private long id = 0;			//To Hold the BookId.

	//Constructor of Class.

	public AddBook (Connection con) {

		//super (Title, Resizable, Closable, Maximizable, Iconifiable)
		super ("Add New Book", false, true, false, true);
		setSize (325, 250);

		//Setting the Form's Labels.

		lbBookId = new JLabel ("Book Id:");
		lbBookId.setForeground (Color.black);
		lbBookId.setBounds (15, 15, 100, 20);
		lbBookName = new JLabel ("Book Name:");
		lbBookName.setForeground (Color.black);
		lbBookName.setBounds (15, 45, 100, 20);
		lbBookAuthor = new JLabel ("Book Author:");
		lbBookAuthor.setForeground (Color.black);
		lbBookAuthor.setBounds (15, 75, 100, 20);
		lbBookPrice = new JLabel ("Book Price:");
		lbBookPrice.setForeground (Color.black);
		lbBookPrice.setBounds (15, 105, 100, 20);
		lbBookCategory = new JLabel ("Book Category:");
		lbBookCategory.setForeground (Color.black);
		lbBookCategory.setBounds (15, 135, 100, 20);

		//Setting the Form's TextFields.

		txtBookId = new JTextField ();
		txtBookId.setHorizontalAlignment (JTextField.RIGHT);
		txtBookId.addFocusListener (this);
		txtBookId.setBounds (120, 15, 175, 25);
		txtBookName = new JTextField ();
		txtBookName.setBounds (120, 45, 175, 25);
		txtBookAuthor = new JTextField ();
		txtBookAuthor.setBounds (120, 75, 175, 25);
		txtBookPrice = new JTextField ();
		txtBookPrice.setHorizontalAlignment (JTextField.RIGHT);
		txtBookPrice.setBounds (120, 105, 175, 25);

		//Setting the Form's ComboBox.

		cboBookCategory = new JComboBox (category);
		cboBookCategory.setBounds (120, 135, 175, 25);

		//Setting the Form's Buttons.

		btnOk = new JButton ("OK");
		btnOk.setBounds (50, 175, 100, 25);
		btnOk.addActionListener (this);
		btnCancel = new JButton ("Cancel");
		btnCancel.setBounds (170, 175, 100, 25);
		btnCancel.addActionListener (this);

		//Registering the KeyListener to Restrict user to type only Numeric in Numeric Boxes.

		txtBookId.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isDigit (c)) || (c == KeyEvent.VK_BACK_SPACE))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);

		txtBookPrice.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isDigit (c)) || (c == KeyEvent.VK_BACK_SPACE))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);

		//Adding All the Controls in Panel.

		pBook.setLayout (null);
		pBook.add (lbBookId);
		pBook.add (lbBookName);
		pBook.add (lbBookAuthor);
		pBook.add (lbBookPrice);
		pBook.add (lbBookCategory);
		pBook.add (txtBookId);
		pBook.add (txtBookName);
		pBook.add (txtBookAuthor);
		pBook.add (txtBookPrice);
		pBook.add (cboBookCategory);
		pBook.add (btnOk);
		pBook.add (btnCancel);

		//Adding Panel to Form.

		getContentPane().add (pBook, BorderLayout.CENTER);}
/*
		try {
			st = con.createStatement ();	//Creating Statement Object.
		}
		catch (SQLException sqlex) {			//If Problem then Show the User a Message.
 			JOptionPane.showMessageDialog (null, "A Problem Occurs While Loading Form.");
 			dispose ();				//Closing the Form.
	 	}

		setVisible (true);

	}*/

	//Action Performed By the Form's Button.

	public void actionPerformed (ActionEvent ae) {

		Object obj = ae.getSource();

		if (obj == btnOk) {		//If OK Button Pressed.

			//Validating to Check All Required Information Provided or Not.

			if (txtBookId.getText().equals ("")) {
				JOptionPane.showMessageDialog (this, "Book's Id not Provided.");
				txtBookId.requestFocus ();
			}
			else if (txtBookName.getText().equals ("")) {
				JOptionPane.showMessageDialog (this, "Book's Name not Provided.");
				txtBookName.requestFocus ();
			}
			else if (txtBookAuthor.getText().equals ("")) {
				JOptionPane.showMessageDialog (this, "Book's Author Name not Provided.");
				txtBookAuthor.requestFocus ();
			}
			else if (txtBookPrice.getText().equals ("")) {
				JOptionPane.showMessageDialog (this, "Book's Price not Provided.");
				txtBookPrice.requestFocus ();
			}
			else {	//If All Information Provided then.

				int price = Integer.parseInt (txtBookPrice.getText ());	//Converting String to Numeric.

				try {	//INSERT Query to Add Book Record in Table.
					String q = "INSERT INTO Books (BookId, BookName, BookAuthor, BookPrice, Category) " +
					"VALUES (" + id + ", '" + txtBookName.getText() + "', '" + txtBookAuthor.getText() + 
					"', " + price + ", '" + cboBookCategory.getSelectedItem() + "')";
					int result = st.executeUpdate (q);	//Running Query.
					if (result == 1) {			//If Query Successful.
						JOptionPane.showMessageDialog (this, "Record has been Saved.");
						txtClear ();			//Clearing the TextFields.
					}
					else {					//If Query Failed.
						JOptionPane.showMessageDialog (this, "Problem while Saving the Record.");
					}
				}
				catch (SQLException sqlex) { }
			}

		}

		if (obj == btnCancel) {		//If Cancel Button Pressed Unload the From.

			setVisible (false);
			dispose();

		}

	}

	//OverRidding the FocusListener Class Function.

	public void focusGained (FocusEvent fe) { }

	public void focusLost (FocusEvent fe) {

		if (txtBookId.getText().equals ("")) {	//If TextField is Empty.
		}
		else {
			id = Integer.parseInt (txtBookId.getText ());	//Converting String to Numeric.
			long bookNo;					//Use for Comparing the Book's Id.
			boolean found = false;				//To Confirm the Book's Id Existance.

			try {	//SELECT Query to Retrieved the Record.
				String q = "SELECT * FROM Books WHERE BookId = " + id + "";
				ResultSet rs = st.executeQuery (q);	//Executing the Query.
				rs.next ();				//Moving towards the Record.
				bookNo = rs.getLong ("BookId");		//Storing the Record.
				if (bookNo == id) {			//If Record Found then Display Message.
					found = true;
					txtClear ();			//Clearing the TextFields.
					JOptionPane.showMessageDialog (this, id + " is already assigned.");
				}
				else {
					found = false;
				}
			}
			catch (SQLException sqlex) { }
		}

	}

	//Function Use to Clear All the TextFields of Form.

	private void txtClear () {

		txtBookId.setText ("");
		txtBookName.setText ("");
		txtBookAuthor.setText ("");
		txtBookPrice.setText ("");
		txtBookId.requestFocus ();

	}

}	