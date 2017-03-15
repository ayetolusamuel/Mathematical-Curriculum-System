package project1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class aboutmesam extends JInternalFrame implements ActionListener, FocusListener {
	JLabel label1,label2,label3,label4,label5,label;
	JButton button;
	
	
	aboutmesam(){

		super ("About The Developer", false, true, false, true);
		setSize (500,450);
		
		JPanel pane=new JPanel();
		pane.setLayout(null);
		button=new JButton("<html><b><i><h1>Developer Speech</h1></i></b></html>  \t");
		button.setBounds(0,500,380,50);
		pane.add(button);
		
		
		label=new JLabel("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=5 color=red><B><i>Name:</i>Ayetolu Samuel Setonji</B></FONT></td></html>");
		label.setBounds(0,10,300,70);
		pane.add(label);

		



	label1=new JLabel("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=5 color=cyan><B><i>Email:</i>Ayetolusetonji@gmail.com<br>Ayetolusamuel@gmail.com</br></B></FONT></td></html>");
	label1.setBounds(25,65,400,70);
	pane.add(label1);

		
		
	 label2=new JLabel("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=5 color=green><B><i>Contact:</i>+2348167137007</B></FONT></td></html>");
	label2.setBounds(0,120,500,70);
	pane.add(label2);

	 label3=new JLabel("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=4 color=yellow><B><i>organisation:</i>SamSet Computer Institute(SCI)</B></FONT></td></html>");
	label3.setBounds(0,160,600,70);
	pane.add(label3);


	 label4=new JLabel("<html><CENTER><tr><td BGCOLOR=silver><font face=tahoma size=3 color=ORANGE><b><i>School:</i><i>Ogun State Institute Of Technology,Igbesa,<br>Ogun State.</B></FONT></td></i></html>");
	label4.setBounds(10,200,380,70);
	pane.add(label4);
	/*

	 label4=new JLabel("<html><b>Name: AYETOLU SAMUEL SETONJI</b></html>");
	label4.setBounds(10,110,200,10);
	pane.add(label4);


	 label5=new JLabel("<html><b>Name: AYETOLU SAMUEL SETONJI</b></html>");
	label5.setBounds(10,140,200,10);
	pane.add(label5);


	*/
/*
	JLabel lbl = new JLabel(new ImageIcon("images//developer4.jpg"));

	lbl.setBounds(390,0,300,800);
	pane.add(lbl);*/
	
	
	pane.setLayout(null);
	getContentPane().add(pane,BorderLayout.CENTER);
	//setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
	}


	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
	
	}}

