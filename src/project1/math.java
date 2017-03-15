package project1;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.sql.*;
import java.util.*;

public   class math extends JInternalFrame implements ActionListener {
	private JDesktopPane desktop = new JDesktopPane ();
		private JPanel pBook = new JPanel ();
	private JLabel label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23,label24,label25,label26;
	private JButton btndeveloper;

	//Constructor of Class.

	public math () {

		//super (Title, Resizable, Closable, Maximizable, Iconifiable)
		super ("Mathematics Graphical Quotes", true, true, false, true);
		//setSize (1200,600);
		setSize (1200,519);
		
		setLocation(0,0);
		
		


		label1 = new JLabel( new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths321.jpg"));
		label1.setBounds (0,0,199,120);

		label=new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths331.jpg"));
		label.setBounds(180,5,190,120);

		label2 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths311.jpg"));
		label2.setBounds (330,0,170,120);
		
		label3 = new JLabel(new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/images//maths//maths341.jpg"));
		label3.setBounds (450,0,170,120);

		label4 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths351.jpg"));
		label4.setBounds (590,-5,200,129);

		label5 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths361.jpg"));
		label5.setBounds (739,0,200,120);

		label6 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths381.jpg"));
		label6.setBounds (939,0,200,120);

		label7 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths401.jpg"));
		label7.setBounds (-6,95,200,180);

		label8 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths400.jpg"));
		label8.setBounds (185,125,190,120);

		label9 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths402.jpg"));
		label9.setBounds (350,120,196,129);

		label10 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths403.jpg"));
		label10.setBounds (510,120,196,129);

		label11 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths404.jpg"));
		label11.setBounds (720,120,196,129);

		label12 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths405.jpg"));
		label12.setBounds (923,126,220,120);

		label13 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths406.jpg"));
		label13.setBounds (-40,250,196,120);

		label14 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths409.jpg"));
		label14.setBounds (135,250,196,120);

		label15 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths410.jpg"));
		label15.setBounds (290,250,196,120);
		
		label16 = new JLabel (new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths411.jpg"));
		label16.setBounds (470,250,196,120);

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

			label24 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths560.png"));
				label24.setBounds(500,370,196,120);
					label25 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths560.jpg"));
				label25.setBounds(700,370,196,120);
				label26 = new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images//maths//maths580.jpg"));
				label26.setBounds(900,370,196,140);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
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
		pBook.add (label17);
		pBook.add (label18);
		pBook.add (label19);
		pBook.add (label20);
		pBook.add (label21);
		pBook.add (label22);
		pBook.add (label23);
		pBook.add (label24);
		pBook.add (label25);
		pBook.add (label26);
		
		
		
		
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