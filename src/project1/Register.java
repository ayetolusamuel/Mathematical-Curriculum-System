package project1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.io.*;
import java.sql.*;


public  class Register extends JFrame implements ActionListener{
	

	CheckboxGroup cbmf;
	Checkbox cbm,cbf;
	private JComboBox cmbclasscat,cmbexam;
String exam[]={"WAEC","NECO","JAMB",};
	private String cat[] = {"SS1", "SS2", "SS3","Jambite"};
     JLabel lblid,lblpassword,lblname,lblexam,lblphone,lblemail,lblsex,lbladdress,lblstate,lblcity,lblclass,lbl_title;
    JTextField txtid,txtpassword,txtname,txtphone,txtemail,txtaddress,txtstate,txtcity;
    JButton btnregister,btnclear,btnexit;
    ResultSet rs;
    PreparedStatement ps;
    Statement st;
    Connection con;
    Register(){
        super("Registration Form");
        setLayout(null);
   
         lbl_title = new JLabel("Register Here",JLabel.CENTER);
         add(lbl_title);
         lbl_title.setBounds(70, 10, 250, 30);
         lbl_title.setFont(new Font("Algerian",Font.ITALIC,30));
         lbl_title.setForeground(Color.BLUE);
            
        lblid = new JLabel("Student ID :");
        add(lblid);
        lblid.setBounds(30, 50, 100, 30);
        lblid.setFont(new Font("Arial Black",Font.ITALIC,14));
        lblid.setForeground(Color.RED);
        
        txtid = new JTextField();
        add(txtid);
        txtid.setBounds(130, 55, 200, 22);
        txtid.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        txtid.setForeground(Color.BLUE);
        txtid.setToolTipText("Enter UserName");
        txtid.setBackground(Color.PINK);
         
        
        
        lblpassword = new JLabel("Password :");
        add(lblpassword);
        lblpassword.setBounds(30, 80, 100, 30);
        lblpassword.setFont(new Font("Arial Black",Font.ITALIC,14));
        lblpassword.setForeground(Color.BLACK);
        
        txtpassword = new JPasswordField();
        add(txtpassword);
        txtpassword.setBounds(130, 85, 200, 22);
        txtpassword.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        txtpassword.setForeground(Color.BLUE);
        txtpassword.setToolTipText("Enter Password");
        txtpassword.setBackground(Color.PINK);
    
        txtpassword.getSize(); 
        
        
        

        lblname = new JLabel("Name :");
        add(lblname);
        lblname.setBounds(30, 110, 100, 30);
        lblname.setFont(new Font("Arial Black",Font.ITALIC,14));
        lblname.setForeground(Color.RED);
        
        txtname = new JTextField();
        add(txtname);
        txtname.setBounds(130, 115, 200, 22);
        txtname.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        txtname.setForeground(Color.BLUE);
        txtname.setToolTipText("Enter Your name here");
        txtname.setBackground(Color.PINK);
        
        
        

        
        lblclass = new JLabel ("Class:");
		lblclass.setForeground (Color.black);
		lblclass.setBounds (30, 330, 100, 30);
		lblclass.setFont(new Font("Comic Sans Ms",Font.BOLD,15));
add(lblclass);

		cmbclasscat = new JComboBox (cat);
		cmbclasscat.setBounds (130, 330, 175, 30);
		cmbclasscat.setBackground(Color.RED);
		cmbclasscat.setForeground(Color.CYAN);
		add(cmbclasscat);
        
        
        
        
        
        
        lblemail = new JLabel("Email :");
        add(lblemail);
        lblemail.setBounds(30, 140, 100, 30);
        lblemail.setFont(new Font("Arial Black",Font.ITALIC,14));
        lblemail.setForeground(Color.RED);
        
        txtemail = new JTextField();
        add( txtemail);
        txtemail.setBounds(130, 140, 200, 22);
        txtemail.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        txtemail.setForeground(Color.BLUE);
        txtemail.setToolTipText("Enter Email");
        txtemail.setBackground(Color.PINK);
        
        
        lblphone = new JLabel("Mobile No: ");
        add(lblphone);
        lblphone.setBounds(30, 170, 200, 30);
        lblphone.setFont(new Font("Arial Black",Font.ITALIC,14));
        lblphone.setForeground(Color.magenta);
        
        txtphone = new JTextField();
        add(txtphone);
        txtphone.setBounds(130, 170, 200, 22);
        txtphone.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        txtphone.setForeground(Color.BLUE);
        txtphone.setToolTipText("Enter Mobile No");
        txtphone.setBackground(Color.PINK);
         

        
        

		txtname.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isLetter(c)	
						|| (c == KeyEvent.VK_BACK_SPACE)))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);
        
        
        
		txtphone.addKeyListener (new KeyAdapter () {
			public void keyTyped (KeyEvent ke) {
				char c = ke.getKeyChar ();
				if (! ((Character.isDigit (c)) || (c == KeyEvent.VK_BACK_SPACE))) {
					getToolkit().beep ();
					ke.consume ();
				}
			}
		}
		);
        
        
        
        

        lbladdress = new JLabel("Address: ");
        add( lbladdress);
        lbladdress.setBounds(30, 210, 200, 30);
        lbladdress.setFont(new Font("Arial Black",Font.ITALIC,14));
        lbladdress.setForeground(Color.orange);
        
        txtaddress = new JTextField();
        add(txtaddress);
        txtaddress.setBounds(130, 210, 200, 22);
        txtaddress.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        txtaddress.setForeground(Color.BLUE);
        txtaddress.setToolTipText("Enter Address");
        txtaddress.setBackground(Color.PINK);
         
        
        
        
        
        

        lblstate = new JLabel("State:");
        add( lblstate);
        lblstate.setBounds(30, 250, 250, 30);
        lblstate.setFont(new Font("Arial Black",Font.ITALIC,14));
        lblstate.setForeground(Color.BLACK);
        
        txtstate = new JTextField();
        add(txtstate);
        txtstate.setBounds(130, 250, 200, 22);
        txtstate.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        txtstate.setForeground(Color.BLUE);
        txtstate.setToolTipText("Enter State");
        txtstate.setBackground(Color.PINK);
         
        
        
        
        
        

        lblcity = new JLabel("City: ");
        add( lblcity);
        lblcity.setBounds(30, 295, 250, 30);
        lblcity.setFont(new Font("Arial Black",Font.ITALIC,14));
        lblcity.setForeground(Color.green);
        
        txtcity = new JTextField();
        add(txtcity);
        txtcity.setBounds(130, 295, 200, 22);
        txtcity.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        txtcity.setForeground(Color.BLUE);
        txtcity.setToolTipText("Enter city");
        txtcity.setBackground(Color.PINK);
         
        
        
        

        
        lblexam = new JLabel ("Examination:");
        lblexam.setForeground (Color.blue);
        lblexam.setBounds (30, 380, 100, 30);
        lblexam.setFont(new Font("Comic Sans Ms",Font.BOLD,15));
add(lblexam);

		cmbexam = new JComboBox (exam);
		cmbexam.setBounds (130, 380, 175, 30);
		cmbexam.setBackground(Color.gray);
		
		add(cmbexam);
      
    	lblsex=new JLabel("Gender :");
    	 lblsex.setFont(new Font("Comic Sans MS",Font.BOLD,15));
    /*     
    	lblsex.setBounds(30,440,70,15);
   	add(lblsex);


    	
    	cbmf=new CheckboxGroup();
    	cbm=new Checkbox("Male",cbmf,true);
    	cbf=new Checkbox("Female",cbmf,false);
    	cbm.setBounds(120,440,50,15);
    	add(cbm);
    	cbf.setBounds(240,440,80,15);
    	add(cbf);
        */
        
        
        
        
        btnregister = new JButton("Register");
        add(btnregister);
        btnregister.setBounds(50, 500, 100, 30);
        btnregister.setBackground(Color.ORANGE);
        btnregister.setForeground(Color.BLUE);
        btnregister.setFont(new Font("Comic Sans MS",Font.BOLD,15));
         
        
        
        
        
        
        btnexit = new JButton("Exit");
        add(btnexit);
        btnexit.setBounds(300, 500, 100, 30);
        btnexit.setBackground(Color.ORANGE);
        btnexit.setForeground(Color.BLUE);
        btnexit.setFont(new Font("Comic Sans MS",Font.BOLD,15));
         

        btnclear = new JButton("Cancel");
        add(btnclear);
        btnclear.setBounds(170, 500, 100, 30);
        btnclear.setBackground(Color.ORANGE);
        btnclear.setForeground(Color.BLUE);
        btnclear.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        
       
        
        
        
        btnclear.addActionListener(this);
        btnregister.addActionListener(this);
  btnexit.addActionListener(this);
        
        
        
        
        try{
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             String url = "jdbc:odbc:Driver={Microsoft Access Driver " +
 		            "(*.mdb, *.accdb)};"+"DBQ=C://database//Curriculumdatabase.mdb";
    		 
             
 		   con=DriverManager.getConnection(url);
             
             System.out.println("connected");
             //con = DriverManager.getConnection("Jdbc:Odbc:STD_INFO");
        }catch(Exception ex){
            
            
        }
    }
    public void actionPerformed1(ActionEvent e){
        
       if(e.getSource()==btnregister){
           
           try{
       String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="";
       String user=txtid.getText();
       String str_pass=txtpassword.getText();
       String str_email=txtemail.getText();
       String str_mobile=txtphone.getText();
       String str_name=txtname.getText();
       String str_address=txtaddress.getText();
       String str_state=txtstate.getText();
       String str_city=txtcity.getText();
      String str_class=cmbclasscat.getSelectedItem().toString();
      String str_exam=cmbexam.getSelectedItem().toString();
 //String str_gender=cbmf.getText();
       
            
            if(user.length()==0 && str_pass.length()==0 && str_email.length()==0 && str_mobile.length()==0 && str_name.length()==0 && str_address.length()==0 &&str_state.length()==0 && str_city.length()==0 ){
                
                JOptionPane.showMessageDialog(null, "Please Required All Field ?", "Error",JOptionPane.ERROR_MESSAGE);
           
            }
           
           else if(!s1.equals("'") || !s2.equals("'") ||!s3.equals("'") ||!s4.equals("'") ||!s5.equals("'") ||!s6.equals("'") || !s7.equals("'")||!s8.equals("'")||!s9.equals("'")||!s10.equals("'")){
              
                  
               String query =("insert into reg values('"+user+"','"+str_pass+"','"+str_email+"','"+str_mobile+"','"+str_name+"','"+str_address+"','"+str_state+"','"+str_class+"','"+str_class+"')");
               st = con.createStatement();
               st.executeUpdate(query);
               
               JOptionPane.showMessageDialog(null, "Registration Successfully....", "Message",JOptionPane.INFORMATION_MESSAGE);
               
               Login l = new Login();
               l.setVisible(true);
               l.setSize(400, 350);
               dispose();
               
               txtid.setText("");
              txtpassword.setText("");
               txtemail.setText("");
               txtphone.setText("");
               st.close();
              
                
            }
          
            
           }catch(Exception ex){
               
               
           }
       }
       }/*
  public void actionPerformed1(ActionEvent e){
      
       if(e.getSource()==btnexit){
           
           int reply = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit ?","Message",JOptionPane.YES_NO_OPTION);
           
           if(reply==JOptionPane.YES_OPTION){
               
               System.exit(0);
           }*/
    
    

    public void actionPerformed(ActionEvent e){
        
         if(e.getSource()==btnexit){
             
             int reply = JOptionPane.showConfirmDialog(null, "Are you Sure you want to exit ?","Message",JOptionPane.YES_NO_OPTION);
                
             if(reply==JOptionPane.YES_OPTION){
                
                 System.exit(0);
             }
             
         }
       
}


    public static void main(String args []){
    	Register sa=new Register();
    	sa.setVisible(true);
    	sa.setLocation(100,100);
    sa.setSize(500,600);
    sa.setResizable(false);
    
    
    }
}