package project1;
import javax.swing.*;

import java.awt.event.*;
import java.awt.geom.*;
import java.awt.*;


public class txt extends JPanel implements ActionListener
			{   
				Timer th=new Timer(100,this);
				JTextArea tx;
				String stxt; int i=0;
				public txt()
					{   
					
					
						tx=new JTextArea();
						tx.setEditable(false);
						Color color=new Color(120,200,220);
						tx.setFont(new Font("",Font.BOLD,14));
						tx.setBackground(color);
						Box box=Box.createVerticalBox();
						Box box2=Box.createHorizontalBox();
						JLabel l1=new JLabel("SYSTEM  MESSAGE");l1.setForeground(Color.BLUE);
						l1.repaint();
						l1.setFont(new Font("",Font.BOLD,14));
						//box.add(new JLabel("              SYSTEM \n MESSAGE"));JLabel r=new JLabel();
						//r.setIcon(new ImageIcon("images\\r.gif"));
					//	box.add(r);
						box2.add(box);box2.add(tx);
						add(box2);
						
						 setBackground(Color.BLACK);    
							
							
						printme("WELCOME TO RAKEDO STAFF'S MANAGEMENT SYSTEM.");
						//setBackground(Color.BLACK);
					}
				
				public void printme(String s)
				{   tx.setText("");
					stxt=s;
					th.start();
					i=0;
				}		
				
				
				

			    ImageIcon i1=new ImageIcon("images\\rain.gif");
			    ImageIcon i2=new ImageIcon("images\\rain.gif");
			    ImageIcon i3=new ImageIcon("images\\rain.gif");
			
			    //////////////////////////////////
					  
			
			
				public void paintComponent(Graphics g)
					{
						super.paintComponents(g);
						Graphics2D g2d=(Graphics2D)g;
					  i1.paintIcon(this,g2d,0,-220);
					    i2.paintIcon(this,g2d,250,-150);
					    i3.paintIcon(this,g2d,500,-150);
					    	
						g2d.setFont(new Font("Algerian",Font.BOLD,19));
					
						
						g2d.setPaint(new GradientPaint(50,50,Color.BLUE,100,100,Color.YELLOW));
						
						g2d.drawString("Rakedo Staff's Management System ",20,50);
					}
			   public  Dimension getPreferredSize()
			    {
			    	return new Dimension(700,500);
			    }
				
				
				public void actionPerformed(ActionEvent e)
				{
				   if(i==stxt.length()-1)th.stop();
   			    	tx.append(stxt.charAt(i++)+"");
   			    	
				
				}	
			}