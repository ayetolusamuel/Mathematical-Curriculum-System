package project1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public  class sam implements ActionListener{



   JFrame f1;
   JButton browse;

 sam()
   {

      f1 = new JFrame("MyApp");
      browse = new JButton("Browse Google");

      browse.addActionListener(this);

      f1.add(browse);
      f1.setLayout(new FlowLayout(FlowLayout.LEFT));
      f1.setVisible(true);
      f1.setSize(200,200);
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


   public void actionPerformed(ActionEvent ae)
   {
     String s = ae.getActionCommand();

      if(s.equalsIgnoreCase("Browse Google"))
      {
        try{
        Desktop d =  Desktop.getDesktop();

        d.browse(new URI("www.google.com"));}
        catch(Exception e){}

      }

     else{
      System.out.println("No action performed");
     }
   }

  /*public static void main(String[] args)
  {
    sam app = new sam();
  }*/


private void sam() {
	// TODO Auto-generated method stub
	
}
	
}
