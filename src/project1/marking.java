package project1;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.sql.*;
import java.util.*;

public   class marking extends JInternalFrame implements ActionListener {
	private JDesktopPane desktop = new JDesktopPane ();
	protected static final File Sound = null;
	private JPanel pBook = new JPanel ();
	private JLabel label,label1,label2,label3,label4,label5;
	private JButton btndeveloper;

	//Constructor of Class.

	public marking () {

		//super (Title, Resizable, Closable, Maximizable, Iconifiable)
		super ("About the Programmer", false, true, false, true);
		setSize (900,600);
		setLocation(0,0);
		
//.setVisible(true);
		


		label1 = new JLabel ("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=5 color=red><B><i>Name:</i>Ayetolu Samuel Setonji</B></FONT></td></html>");
		label1.setBounds (0,10,300,70);

		label=new JLabel("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=5 color=cyan><B><i>Email:</i>Ayetolusetonji@gmail.com<br>Ayetolusamuel@gmail.com</br></B></FONT></td></html>");
		label.setBounds(15,70,500,70);

		label2 = new JLabel ("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=5 color=green><B><i>Contact:</i>+2348167137007</B></FONT></td></html>");
		label2.setBounds (10,120,500,70);
		
		label3 = new JLabel ("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=4 color=yellow><B><i>organisation:</i>SamSet Computer Institute(SCI)</B></FONT></td></html>");
			label3.setBounds (0,170,650,70);
		
			label4 = new JLabel ("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=3 color=ORANGE><b><i>School:</i><i>Ogun State Institute Of Technology,Igbesa,<br>Ogun State.</B></FONT></td></i></html>");
			label4.setBounds (10,230,350,70);


JLabel lblpic = new JLabel(new ImageIcon("images//developer4.jpg"));

lblpic.setBounds(390,0,500,820);
		
		//Setting the Form's Buttons.

		btndeveloper=new JButton("<html><b><i><h1>Developer Speech</h1></i></b></html>  \t");
		btndeveloper.setBounds(0,500,380,50);
		
		

		//Adding All the Controls in Panel.

		pBook.setLayout (null);
		pBook.add (label);
		pBook.add (label1);
		pBook.add (label2);
		pBook.add (label3);
		pBook.add (label4);
		pBook.add (lblpic);
	
		
		pBook.add (btndeveloper);
		

		//Adding Panel to Form.

		getContentPane().add (pBook, BorderLayout.CENTER);
		
	
	
	//Action Performed By the Form's Button.
	
	
	
	btndeveloper.addActionListener (new ActionListener(){
	
		@Override
		public void actionPerformed(ActionEvent ae) {
			// TODO Auto-generated method stub
			Object obj = ae.getSource();
			
			if(obj==btndeveloper);
			tuitor sam = new tuitor();
		}

		}
	);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		

	
}	