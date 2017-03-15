package project1;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.sql.*;
import java.util.*;

public   class mathformular extends JInternalFrame implements ActionListener {
	private JDesktopPane desktop = new JDesktopPane ();
		private JPanel pBook = new JPanel ();
	private JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23,label24,label25,label26,label28;
	private JButton btndeveloper;

	//Constructor of Class.

	public mathformular () {

		//super (Title, Resizable, Closable, Maximizable, Iconifiable)
		super ("Mathematics Formulars", true, true, false, true);
		//setSize (1200,600);
		setSize (1200,519);
		
		setLocation(0,0);
		
		


		label1 = new JLabel( new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths700.jpg"));
		label1.setBounds (0,5,190,160);

		label=new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths710.jpg"));
		label.setBounds(180,5,190,160);

		label2 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths720.jpg"));
		label2.setBounds (350,5,190,160);
		
		label3 = new JLabel(new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/images//maths//maths730.jpg"));
		label3.setBounds (490,5,190,160);

		label4 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths740.jpg"));
		label4.setBounds (682,5,190,160);

		label5 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths750.jpg"));
		label5.setBounds (875,5,190,160);

		label6 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths760.jpg"));
		label6.setBounds (0,160,200,160);

		label7 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths770.jpg"));
		label7.setBounds (180,160,200,160);

		label8 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths780.jpg"));
		label8.setBounds (380,160,200,160);

		label9 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths790.jpg"));
		label9.setBounds (581,160,200,160);

		label10 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths800.jpg"));
		label10.setBounds (782,160,200,160);

		label11 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths810.jpg"));
		label11.setBounds (940,160,200,160);

		label12 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths820.jpg"));
		label12.setBounds (0,320,200,160);

		label13 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths830.jpg"));
		label13.setBounds (205,320,200,160);

		label14 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths880.jpg"));
		label14.setBounds (819,295,320,200);

		label15 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths841.jpg"));
		label15.setBounds (613,320,200,160);
		
		label16 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths530.png"));
		label16.setBounds (420,340,196,120);

		label17 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths412.jpg"));
		label17.setBounds(640,250,196,120);

		label18 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths413.jpg"));
		label18.setBounds(810,250,196,120);

		label19 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths414.jpg"));
		label19.setBounds(945,250,196,120);

		label20 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths415.jpg"));
		label20.setBounds(0,370,196,120);
		
		label21 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths50.jpg"));
		label21.setBounds(990,249,196,120);

		label22 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths530.png"));
		label22.setBounds(159,370,196,120);

			label23 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths550.png"));
			label23.setBounds(300,370,196,120);

			label24 = new JLabel(new ImageIcon("images//maths//maths560.png"));
				label24.setBounds(500,370,196,120);
					label25 = new JLabel(new ImageIcon("images//maths//maths560.jpg"));
				label25.setBounds(700,370,196,120);
				label26 = new JLabel(new ImageIcon("images//maths//maths580.jpg"));
				label26.setBounds(900,370,196,140);
				label28 = new JLabel(new ImageIcon("images//maths//maths580.jpg"));
				label28.setBounds(900,600,196,140);
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		//Setting the Form's Buttons.
/*
		btndeveloper=new JButton("<html><b><i><h1>Developer Speech</h1></i></b></html>  \t");
		btndeveloper.setBounds(0,500,380,50);
		*/
		

		//Adding All the Controls in Panel.

		pBook.setLayout (null);
		pBook.add (label);
		pBook.add (label1);
		pBook.add (label2);
		pBook.add (label3);
		pBook.add (label4);
		pBook.add (label5);
		pBook.add (label6);
		pBook.add (label7);
		pBook.add (label8);
		pBook.add (label9);
		pBook.add (label10);
		pBook.add (label11);
		pBook.add (label12);
		pBook.add (label13);
		pBook.add (label14);
		pBook.add (label15);
		pBook.add (label16);
		/*pBook.add (label17);
		pBook.add (label18);
		pBook.add (label19);
		pBook.add (label20);
		pBook.add (label21);
		pBook.add (label22);
		pBook.add (label23);
		pBook.add (label24);
		pBook.add (label25);
		pBook.add (label26);
		*/
		
		
		
		//pBook.add (btndeveloper);
		

		//Adding Panel to Form.

		getContentPane().add (pBook, BorderLayout.CENTER);
		
	
	}
	//Action Performed By the Form's Button.
	
	/*
	
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
	}*/


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
		
}	