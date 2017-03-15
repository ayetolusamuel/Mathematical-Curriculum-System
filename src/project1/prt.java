package project1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class prt extends JFrame implements ActionListener{

	JButton button;
	
	prt(){

        
		button = new JButton("Register");
        add(button);
        button.setBounds(50, 500, 100, 30);
        button.setBackground(Color.ORANGE);
        button.setForeground(Color.BLUE);
        button.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        button.addActionListener(this);
        
	}
	
	
	
	
	public static void main(String[] args) {
		prt sa=new prt();
		sa.setVisible(true);
	sa.setLocation(0,0);	
	sa.setSize(950,650);
	
	
	}




	@Override
	public void actionPerformed(ActionEvent evt) {
		/*// TODO Auto-generated method stub
		Object obj =evt.getSource();
	if (obj == button) {

			boolean b = openChildWindow ("Create New User");
			if (b == false) {
				NewUser mkUser = new NewUser (con);
				desktop.add (mkUser);
				mkUser.show ();
				*/
				
				 
                aboutmesam rg = new aboutmesam();
                 rg.setVisible(true);
                 rg.setBounds(100, 100, 420, 600);
                 rg.setResizable(false);
                dispose();
                 
			}
		
	}
