package project1;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.io.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
       
        JLabel l1,l2,lbl_title,lbl_develop,lbl_author;
        JTextField t1,t2;
        JButton btnlogin,btnregister,btnexit;
        ResultSet rs;
        PreparedStatement ps;
        Statement st;
        Connection con;
String user="ayets";
        String pass="setonji04";
       
        
        Login(){
        	super("Login Form");
            setLayout(null);
        	
              
             
            
           lbl_title = new JLabel("Login Here",JLabel.CENTER);
            add(lbl_title);
            lbl_title.setBounds(70, 10, 200, 30);
            lbl_title.setFont(new Font("Algerian",Font.ITALIC,30));
            lbl_title.setForeground(Color.RED);
            
            l1 = new JLabel("Student ID :");
            add(l1);
            l1.setBounds(20, 50, 170, 30);
            l1.setFont(new Font("Arial Black",Font.ITALIC,14));
            l1.setForeground(Color.BLUE);
            
            t1 = new JTextField(3);
            t1.setToolTipText("Enter UserName");
            add(t1);
            t1.setBounds(120, 55, 200, 22);
            t1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
            t1.setBackground(Color.PINK);
            t1.setForeground(Color.BLUE);
            
            l2 = new JLabel("Password   :");
            add(l2);
            l2.setBounds(20, 85, 150, 20);
            l2.setFont(new Font("Arial Black",Font.ITALIC,14));
            l2.setForeground(Color.BLACK);
            
            t2 = new JPasswordField();
            t2.setToolTipText("Enter Password");
            t2.setColumns(4);
            add(t2);
            t2.setBounds(120, 85, 200, 22);
            t2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
            t2.setBackground(Color.PINK);
            t2.setForeground(Color.BLUE);
            
            btnlogin = new JButton("Login");
            add(btnlogin);
            btnlogin.setBounds(80, 130,100, 30);
            btnlogin.setFont(new Font("Comic Sans MS",Font.BOLD,15));
            btnlogin.setBackground(Color.ORANGE);
            btnlogin.setForeground(Color.RED);
            
            btnexit = new JButton("Cancel");
            add(btnexit);
            btnexit.setBounds(200, 130, 100, 30);
            btnexit.setFont(new Font("Comic Sans MS",Font.BOLD,15));
            btnexit.setBackground(Color.ORANGE);
            btnexit.setForeground(Color.RED);
            
            btnregister = new JButton("Create New Account");
            add(btnregister);
            btnregister.setBounds(90, 190, 200, 30);
            btnregister.setFont(new Font("Comic Sans MS",Font.BOLD,15));
            btnregister.setBackground(Color.ORANGE);
            btnregister.setForeground(Color.RED);
            
            lbl_develop = new JLabel("Developed By :");
            add(lbl_develop);
            lbl_develop.setBounds(30, 250, 400, 30);
            lbl_develop.setFont(new Font("Algerian",Font.ITALIC,20));
            lbl_develop.setForeground(Color.BLUE);
            
            lbl_author = new JLabel("Ayetolu Samuel");
            add(lbl_author);
            lbl_author.setBounds(180, 250, 400, 30);
            lbl_author.setFont(new Font("Algerian",Font.ITALIC,20));
            lbl_author.setForeground(Color.RED);
            
            btnlogin.addActionListener(this);
            btnregister.addActionListener(this);
            btnexit.addActionListener(this);
        
            try{
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           String url = "jdbc:odbc:Driver={Microsoft Access Driver " +
		            "(*.mdb, *.accdb)};"+"DBQ=C://database//Curriculumdatabase.mdb";
		 
            
         
            
            con=DriverManager.getConnection(url);
            		
           System.out.println("connected");
            st = con.createStatement();
          
            }
        
            
            catch(Exception ex){
            
           JOptionPane.showMessageDialog(null, "Failed Connection","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
         
        public void actionPerformed1(ActionEvent e){
               
            if(e.getSource()==btnlogin){
                String s1="",s2="";
                String user =t1.getText();
                String pass =t2.getText();
                
                
                if(user.length()==0 || pass.length()==0){
                    
                    JOptionPane.showMessageDialog(null, "Invalid user or pass,try again","error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                {
                 try{
                     st = con.createStatement();
                     rs = st.executeQuery("select * from reg where UserName='"+t1.getText()+"' AND Password='"+t2.getText()+"'");
                      
                   while(rs.next()){
                       
                       s1 = rs.getString("UserName");
                       s2 = rs.getString("Password");
                               
                   } 
                   if(!s1.equals(t1.getText()) || !s2.equals(t2.getText())){
                       
                       JOptionPane.showMessageDialog(null, "Invalid Field,try again","Error Message",JOptionPane.ERROR_MESSAGE);
                       t1.setText("");
                       t2.setText("");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "Login Successfullyy....","Message",JOptionPane.INFORMATION_MESSAGE);
                  /* Splash si = new Splash();       
                      si.setVisible(true);
                     // si.setSize(600, 600);
                       t1.setText("");
                       t2.setText("");
                      dispose();
                      */
                   }          
                    }catch(Exception ex){
                     
                      
                 }
                
        
                }}}}
        public void actionPerformed(ActionEvent e){
            
             if(e.getSource()==btnexit){
                 
                 int reply = JOptionPane.showConfirmDialog(null, "Are you Sure you want to exit ?","Message",JOptionPane.YES_NO_OPTION);
                    
                 if(reply==JOptionPane.YES_OPTION){
                    
                     System.exit(0);
                 }
                 
             }
             
             if(e.getSource()==btnregister){
                 
                Register rg = new Register();
                 rg.setVisible(true);
                 rg.setBounds(100, 100, 420, 600);
                 rg.setResizable(false);
                dispose();
                 
             }
            
        }
        
    public static void main(String[] args) {
       Login lg = new Login();
       lg.setVisible(true);
       lg.setResizable(false);
       lg.setSize(400, 350);
       lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
