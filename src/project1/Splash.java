package project1;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.*;
public class Splash extends JWindow {

	private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();	//Getting the User's Screen Dimensions.
	String openingSong = "C:/workspace/workspace/StudentCUrriculum/opening.wav";

	public Splash () {

		JLabel lbImage    = new JLabel (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/images//samuel.jpg"));	//Splash Screen Image.
		Color cl = new Color (0, 0, 0);					//Setting Splash Window Border Color.
		lbImage.setBorder (new LineBorder (cl, 1));			//Setting Splash Window Border.

		getContentPane().add (lbImage, BorderLayout.CENTER);		//Adding the Image Label to Window.
		pack();								//Packing the Splash Window.

		//setSize (getSize().width, getSize().height);			//Setting the Size.
setSize(900,700);
setLocation(0,0);
		
		
		//Setting the Splash Window Position on User's Screen.
		//setLocation (d.width / 2 - getWidth() / 2, d.height / 2 - getHeight() / 2);

		show();					//Displaying the Splash Screen.

		for (int i = 0; i <= 1000; i++) { 
			
		}	//Loop for Delay.

		new MainPage ();				//Showing the Logon Window of Program.
new tuitor();
		toFront();		//Making the Splash Window to Front of Main Window.
		setVisible (false);	//Setting the Splash Window InVisible.
		dispose ();		//Unloading the Window & Release the Memory Resources.

	}

	//Main Function of Program to Execute the Program.

	public static void main (String args[]) {
		
		new Splash ();

		
		try {
            javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
    	} catch (Exception e) {
    		System.out.println("Error Loading Theme:" + e.toString());
			
	}
		/*
		try {
			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
			} catch (Exception e) {
			e.printStackTrace();
			}

*/
	}	}