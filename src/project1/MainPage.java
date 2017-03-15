package project1;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Event;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.annotation.Generated;
import javax.swing.plaf.metal.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalBorders.ToolBarBorder;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.plaf.synth.ColorType;

//import Project1.CurriculumHelp;






public  class MainPage extends JFrame implements ActionListener, ItemListener {
	
	private static final Object btnwaeccheckviainternet = null;

	private Calendar c;

	private JLabel lbStatus;	//For Program's Status.
	private JLabel lbWelcome;	//For Welcome Message.
private JLabel sam;
	
	//Main Place on Form where All Child Forms will Shown.

	private JDesktopPane desktop = new JDesktopPane ();
	//For Program's MenuBar.

	private JMenuBar bar;
	
private JPanel pane;
	//All the Main Menu of the Program.

	private JMenu  mnutopics,mnutips, mnuView, mnuOpt, mnuWin, mnuabout,mnufile,mnuquotes,mnucheck,mnuwaeccheck,mnunecocheck,mnujambcheck;

	//All the MenuItem Options of Program.
private JMenuItem vitaetopic,miquit,examsuccess,advice,waectopics;  //file Menu Options
	private JMenuItem mnuwaec,mnuneco,mnujamb;	//Topics Menu Options.
	private JMenuItem eduaction,maths,success,inspiration,mathsgra;
	private	JMenuItem waec,neco,jamb;				//Exam Menu Options.
	private	JMenuItem change, style, theme;							//Option Menu Options.
	private JMenuItem marking, mathformular, close, closeAll;				//Window Menu Options.
	private	JMenuItem help,notepad,calculator, about;						//Help Menu Options.
private JMenuItem waecviasms,waecviainternet,necoviasms,necoviainternet,jambviasms,jambviainternet,textbooks;
	//PopupMenu of Program.

	private JPopupMenu popMenu = new JPopupMenu ();

	//MenuItems for PopupMenu of the Program.

	private JLabel label,date;

	//For Program's ToolBar.
	JPanel statusbar =new JPanel();

	private	JToolBar toolBar;

	//For ToolBar's Button.

	private	JButton btnwaec, btnneco, btnjamb, btnwaectips, btnnecotips,btnmarking,btnmathformular,btneducation, btnwaeccheck,btnnecocheck,btnjambcheck,
				btnjambtips, btncalc, btnnotepad,btnTextbooks ,btnmath, btnHelp, btnKey,btnabout,btnwaeccheckviasms,btnwaeccheckviaintenet,btnnecocheckviasms,btnnecocheckviainternet,btnjambcheckviasms,btnjambcheckviainternet;

	//Panel For Main Form StatusBar where Program's Name & Welcome Message Display.


//Getting the Current System Date.

private java.util.Date currDate = new java.util.Date ();					//Creating Object.
private SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMM yyyy", Locale.getDefault());	//Changing Format.
private String d = sdf.format (currDate);							//Storing Date.

//Setting the Look & Feel Menu.

private String strings[] = {"1. Metal", "2. Motif", "3. Windows"};
private UIManager.LookAndFeelInfo looks[] = UIManager.getInstalledLookAndFeels ();
private ButtonGroup group = new ButtonGroup ();
private JRadioButtonMenuItem radio[] = new JRadioButtonMenuItem[strings.length];

private String userName;	//For Getting the Current User's Name.

/*
public void paint(Graphics g)
{
	super.paint(g);
	ImageIcon i=new ImageIcon("images\\bak2.png");
	i.paintIcon(this,g,0,0);	
}

public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2d=(Graphics2D)g;
		//label.paintIcon(this,g2d,0,-220);
	    
	   // i2.paintIcon(this,g2d,250,-150);
	  //  i3.paintIcon(this,g2d,500,-150);
	    	
		g2d.setFont(new Font("Algerian",Font.BOLD,50));
	
		
		g2d.setPaint(new GradientPaint(50,50,Color.BLUE,100,100,Color.YELLOW));
		
		g2d.drawString("RAKEDO HOTEL",20,60);
	}

*/



public MainPage () {
	//Setting Program's Title.
	super ("Student's Curriculum by Ayetolu Samuel");

	

	//Setting the Main Window of Program.


	
	
	
	
	
	
	
	
	
	setIconImage (getToolkit().getImage ("C:/workspace/workspace/StudentCUrriculum/Images//real.jpg."));
	
	//Setting Main Window Size.

	//Setting the Location of Program on User's Computer Screen By Getting the Screen's Height & Width.

	setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getWidth()) / 2,
		(Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) / 2);
	 
	
	//sam.setIcon(new javax.swing.ImageIcon("images/real.jpg")); // NOI18N

	
	//Closing Code of Main Window.

	addWindowListener (new WindowAdapter () {		//Attaching the WindowListener to Program.
		public void windowClosing (WindowEvent we) {	//Overriding the windowClosing Function.
	quitApp ();				//Call the Function to Perform the Closing Action.
		}
	}
	);
	
	
	
	JLabel lbl=new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images/maths/background.jpg"));
	lbl.setBounds(680,0,700,700);
	desktop.add(lbl);
	

	//For Making the Dragging Speed of Internal Frames Faster.

	desktop.putClientProperty ("JDesktopPane.dragMode", "outline");

	//Creating the MenuBar For Displaying All the Menus of Program.

	bar = new JMenuBar ();		//Creating the MenuBar Object.
	setJMenuBar (bar);		//Setting Main Window MenuBar.

	
	
	//Creating the Menus of Program & Assigning the Key too to Open them.

	
//Creating the Menus of Program & Assigning the Key too to Open them.

mnufile = new JMenu ("File");
mnufile.setMnemonic ((int)'F');


mnutopics=new JMenu("EXAMS");
mnutopics.setMnemonic((int)'E');


mnutips = new JMenu ("Exams Tips");
mnutips.setMnemonic ((int)'E');

mnuOpt = new JMenu ("Options");
mnuOpt.setMnemonic ((int)'O');

mnuWin = new JMenu ("Window");
mnuWin.setMnemonic ((int)'W');
mnucheck=new JMenu("Check Your Result");
mnucheck.setMnemonic((int)'C');

mnuabout = new JMenu ("About");
mnuabout.setMnemonic ((int)'A');

mnuquotes = new JMenu ("QUOTES");
mnuquotes.setMnemonic ((int)'P');



//MenuItems for FileMenu.


waectopics = new JMenuItem ("<html><i>WAEC MATHS TOPICS FOR QUICK REVISION</i></html> ", new ImageIcon ("Images/Open.gif"));
waectopics.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_W, Event.CTRL_MASK));
waectopics.setMnemonic ((int)'W');
waectopics.addActionListener (this);

vitaetopic = new JMenuItem ("<html><i>Vitae Topics & EXplanation</i></html> ", new ImageIcon ("Images/Open.gif"));
vitaetopic.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK));
vitaetopic.setMnemonic ((int)'V');
vitaetopic.addActionListener (this);
textbooks = new JMenuItem ("<html><i>Recommended TextBooks</i></html> ", new ImageIcon ("Images/Open.gif"));
textbooks.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_R, Event.CTRL_MASK));
textbooks.setMnemonic ((int)'R');
textbooks.addActionListener (this);
examsuccess = new JMenuItem ("<html><i>A1 in English</i></html> ", new ImageIcon ("Images/Open.gif"));
examsuccess.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK));
examsuccess.setMnemonic ((int)'E');
examsuccess.addActionListener (this);
advice = new JMenuItem ("<html><i>Advice for Candidate</i></html> ", new ImageIcon ("Images/Open.gif"));
advice.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
advice.setMnemonic ((int)'A');
advice.addActionListener (this);
miquit = new JMenuItem ("<html><i>Quit Apps </i></html>", new ImageIcon ("Images/Open.gif"));
miquit.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK));
miquit.setMnemonic ((int)'Q');
miquit.addActionListener (this);



//MenuItems for
mnuwaec = new JMenuItem ("<html><i>WAEC Syllabus</i></html>", new ImageIcon ("Images/general.jpg"));
mnuwaec.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_W, Event.CTRL_MASK));
mnuwaec.setMnemonic ((int)'W');
mnuwaec.addActionListener (this);
mnuneco = new JMenuItem ("<html><i>NECO Marking Schemes </i></html>", new ImageIcon ("Images/important.jpg"));
mnuneco.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
mnuneco.setMnemonic ((int)'N');
mnuneco.addActionListener (this);
mnujamb = new JMenuItem ("<html><i>JAMB Syllabus </i></html>", new ImageIcon ("Images/most.jpg"));
mnujamb.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
mnujamb.setMnemonic ((int)'J');
mnujamb.addActionListener (this);

//MenuItem for Examination
waec = new JMenuItem ("<html><i>WAEC TIPS</i></html>", new ImageIcon ("Images/waec.jpg"));
waec.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_W, Event.CTRL_MASK));
waec.setMnemonic ((int)'W');
waec.addActionListener (this);
neco = new JMenuItem ("<html><i>NECO TIPS</i></html>", new ImageIcon ("Images/neco.jpg"));
neco.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
neco.setMnemonic ((int)'T');
neco.addActionListener (this);
jamb = new JMenuItem ("<html><i>JAMB TIPS </i></html>", new ImageIcon ("Images/jamb.jpg"));
jamb.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
jamb.setMnemonic ((int)'J');
jamb.addActionListener (this);


//MenuItems for WindowMenu.

marking = new JMenuItem ("<html><i>Marking scheme</i></html>");
marking.setMnemonic ((int)'P');
marking.addActionListener (this);
mathformular = new JMenuItem ("<html><i>mathematics formulars</i></html>");
mathformular.setMnemonic ((int)'N');
mathformular.addActionListener (this);
close = new JMenuItem ("Close Active Window");
close.setMnemonic ((int)'C');
close.addActionListener (this);
closeAll = new JMenuItem ("Close All Windows...");
closeAll.setMnemonic ((int)'A');
closeAll.addActionListener (this);







mnuwaeccheck= new JMenu ("<html><i>Check Waec Result</i></html>");



mnunecocheck= new JMenu ("<html><i>Check Neco Result</i></html>");


mnujambcheck= new JMenu ("<html><i>Check Jamb Result</i></html>");




waecviasms = new JMenuItem ("<html><i>Check Result Via SMS</i></html>");
waecviasms.setMnemonic ((int)'S');
waecviasms.addActionListener (this);

waecviainternet = new JMenuItem ("<html><i>Check Result Via INTERNET</i></html>");
waecviainternet.setMnemonic ((int)'I');
waecviainternet.addActionListener (this);



necoviasms = new JMenuItem ("<html><i>Check Result Via SMS</i></html>");
necoviasms.setMnemonic ((int)'S');
necoviasms.addActionListener (this);

necoviainternet = new JMenuItem ("<html><i>Check Result Via INTERNET</i></html>");
necoviainternet.setMnemonic ((int)'I');
necoviainternet.addActionListener (this);




jambviasms = new JMenuItem ("<html><i>Check Result Via SMS</i></html>");
jambviasms.setMnemonic ((int)'S');
jambviasms.addActionListener (this);

jambviainternet = new JMenuItem ("<html><i>Check Result Via INTERNET</i></html>");
jambviainternet.setMnemonic ((int)'I');
jambviainternet.addActionListener (this);




//Millionaire menu items
success = new JMenuItem ("Success Quotes", new ImageIcon ("Images/copy.gif"));
success.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_W, Event.CTRL_MASK));
success.setMnemonic ((int)'S');
success.addActionListener (this);
inspiration = new JMenuItem ("Inspirational Quotes", new ImageIcon ("Images/copy.gif"));
inspiration.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
inspiration.setMnemonic ((int)'I');
inspiration.addActionListener (this);
eduaction = new JMenuItem ("Educational Quotes", new ImageIcon ("Images/copy.gif"));
eduaction.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
eduaction.setMnemonic ((int)'E');
eduaction.addActionListener (this);
maths = new JMenuItem ("Maths Quotes", new ImageIcon ("Images/copy.gif"));
maths.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
maths.setMnemonic ((int)'M');
maths.addActionListener (this);

mathsgra = new JMenuItem ("Maths Garphical Quotes", new ImageIcon ("Images/copy.gif"));
mathsgra.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
mathsgra.setMnemonic ((int)'G');
mathsgra.addActionListener (this);







//MenuItem for Option
change = new JMenuItem ("Change Backgroud Color", new ImageIcon ("Images/copy.gif"));
change.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_W, Event.CTRL_MASK));
change.setMnemonic ((int)'C');
change.addActionListener (this);
style = new JMenuItem ("Change Layout Style", new ImageIcon ("Images/copy.gif"));
style.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
style.setMnemonic ((int)'O');
style.addActionListener (this);
theme = new JMenuItem ("Apply Themes", new ImageIcon ("Images/copy.gif"));
theme.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
theme.setMnemonic ((int)'J');
theme.addActionListener (this);


//Window Menu Items.
mnuWin.add (marking);
mnuWin.add (mathformular);
mnuWin.addSeparator ();
mnuWin.add (close);
mnuWin.add (closeAll);


//MenuItem for About

help = new JMenuItem ("<html><b><h3>Help/Shorcut</h3></b></html>", new ImageIcon ("Images/help.jpg"));
help.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
help.setMnemonic ((int)'H');
help.addActionListener (this);

calculator = new JMenuItem ("<html><b><h3>Calculator</h></b></html>", new ImageIcon ("Images/calculator.jpg"));
calculator.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
calculator.setMnemonic ((int)'C');
calculator.addActionListener (this);

notepad = new JMenuItem ("<html><b><h2>Notepad</b></h2></html>", new ImageIcon ("Images/notepad.jpg"));
notepad.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
notepad.setMnemonic ((int)'N');
notepad.addActionListener (this);

about = new JMenuItem ("<html><i><h4>About the developer<h4></i></html>", new ImageIcon ("Images/about.jpg"));
about.setAccelerator (KeyStroke.getKeyStroke(KeyEvent.VK_J, Event.CTRL_MASK));
about.setMnemonic ((int)'A');
about.addActionListener (this);






//StyleMenu For Changing the Program's Layout.

style = new JMenu ("Change Layout Style");
style.setMnemonic ((int)'S');
for( int i = 0; i < radio.length ; i++ ) {			//Creating the subMenus of Style Menu.
	radio[i] = new JRadioButtonMenuItem (strings[i]);	//Build an Array of Layouts to Apply.
	radio[i].setSelected (true);
	radio[i].addItemListener (this);			//Setting their Actions.
	group.add (radio[i]);					//Making them Grouped.
	style.add (radio[i]);					//Adding to Style MenuOption.
}



//SubMenu of ThemeMenu For Applying different Themes to Program By Building an Array of Themes to Apply.

//Attaching the PropertyChangeListener to Program For Applying the Themes.

UIManager.addPropertyChangeListener (new UISwitchListeners ((JComponent)getRootPane()));

MetalTheme[] themes = { new DefaultMetalTheme (), new BlueTheme (), new BrownTheme (), new GreenTheme (), 
		new ChocTheme (), new OrangeTheme (), new PinkTheme (), new RedTheme (), 
		new WaterTheme (), new YellowTheme () };	//Buliding the Array of Themes Objects.
theme = new MetalThemeMenu ("Apply Theme", themes);		//Putting the Themes in ThemeMenu.
theme.setMnemonic ((int)'T');










//Adding All MenuItems to their Menu.

		//File Menu Items.
		mnufile.add (waectopics);
		mnufile.addSeparator ();
		mnufile.add (vitaetopic);
		mnufile.addSeparator ();
		mnufile.add (textbooks);
		mnufile.addSeparator ();
		mnufile.add (examsuccess);
		mnufile.add (advice);
		mnufile.addSeparator ();
		mnufile.add (miquit);
		
		//File Menu Question.
		mnutopics.add (mnuwaec);
		mnutopics.addSeparator ();
		mnutopics.add (mnuneco);
		mnutopics.addSeparator ();
		mnutopics.add (mnujamb);
		
		
		//File Menu Question.
		mnutips.add (waec);
		mnutips.addSeparator ();
		mnutips.add (neco);
		mnutips.addSeparator ();
		mnutips.add (jamb);
		


		mnuquotes.add(maths);
		mnuquotes.addSeparator ();
		mnuquotes.add(eduaction);
		mnuquotes.addSeparator ();
		mnuquotes.add(success);
		mnuquotes.addSeparator ();
		mnuquotes.add(inspiration);
		mnuquotes.addSeparator ();
		mnuquotes.add(mathsgra);
		
		
		
		//Window Menu Items.
		mnuWin.add (marking);
		mnuWin.addSeparator ();
		mnuWin.add (mathformular);
		mnuWin.addSeparator ();
		mnuWin.add (close);
		mnuWin.addSeparator ();
		mnuWin.add (closeAll);
		
		//File Menu Option
		mnuOpt.add(style);
		mnuOpt.addSeparator ();
		mnuOpt.add(change);
		mnuOpt.addSeparator ();
		mnuOpt.add(theme);
		
		//file Menu help
		mnuabout.add(help);
		mnuabout.addSeparator ();
		mnuabout.add(calculator);
		mnuabout.addSeparator ();
		mnuabout.add(notepad);
		mnuabout.add(about);
		
		
		mnuwaeccheck.add(waecviasms);
		mnuwaeccheck.add(waecviainternet);
		
		mnunecocheck.add(necoviainternet);
		mnunecocheck.add(necoviasms);
		
		mnujambcheck.add(jambviasms);
		mnujambcheck.add(jambviainternet);
		
		
		

		
		mnucheck.add(mnuwaeccheck);
		mnucheck.addSeparator();
		mnucheck.add(mnunecocheck);
		mnucheck.addSeparator();
		mnucheck.add(mnujambcheck);
		
	
		
		
		
		
		//Adding All Menus to MenuBar.

		bar.add (mnufile);
		bar.add (mnutopics);
		bar.add (mnutips);
		bar.add (mnuOpt);
		bar.add (mnuWin);
		bar.add(mnucheck);
		bar.add (mnuabout);
		bar.add(mnuquotes);
		//Function For Closing the Program.


		//Creating the ToolBar's Buttons of Program.
		btnwaec= new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/images/general.jpg"));
		btnwaec.setToolTipText ("WAEC SYLLABUS");
		btnwaec.addActionListener (this);
		
		btnneco = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/images/important.jpg"));
		btnneco.setToolTipText ("NECO MARKING SCHEME");
		btnneco.addActionListener (this);
		
		btnjamb= new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/images/most.jpg"));
		btnjamb.setToolTipText ("JAMB SYLLABUS");
		btnjamb.addActionListener (this);
		
		
		
		btnwaectips = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/waec.jpg"));
		btnwaectips.setToolTipText ("WAEC TIPS");
		btnwaectips.addActionListener (this);
		
		btnnecotips = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/neco.jpg"));
		btnnecotips.setToolTipText ("NECO TIPS");
		btnnecotips.addActionListener (this);
		
		
		btnjambtips = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/jamb.jpg"));
		btnjambtips.setToolTipText ("JAMB TIPS");
		btnjambtips.addActionListener (this);
		
		
		btncalc = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/calculator.jpg"));
		btncalc.setToolTipText ("Calculator");
		btncalc.addActionListener (this);
		
		
		btnnotepad = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/notepad.jpg"));
		btnnotepad.setToolTipText ("Notepad");
		btnnotepad.addActionListener (this);
		
		
		
		btnmath = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/maths1.jpg"));
		btnmath.setToolTipText ("Graphical Maths Quotes");
		btnmath.addActionListener (this);
		
		
		
		btnHelp = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/Help.jpg"));
		btnHelp.setToolTipText ("Help on Curriculum Apps");
		btnHelp.addActionListener (this);
		
		
		btnKey = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/key.jpg"));
		btnKey.setToolTipText ("Shortcut Keys of Curriculum apps");
		btnKey.addActionListener (this);
		

		btnabout = new JButton (new ImageIcon ("C:/workspace/workspace/StudentCUrriculum/Images/about.jpg"));
		btnabout.setToolTipText ("About the Programmer");
		btnabout.addActionListener (this);
		//////////////////////////////////////////
	
		label=new JLabel(new ImageIcon("C:/workspace/workspace/StudentCUrriculum/images/student.png"));
		label.setToolTipText("Student's Curriculum");
		
        
		
		//Creating the ToolBar of Program.

		toolBar = new JToolBar ();
		toolBar.add (btnwaec);
		toolBar.addSeparator ();
		toolBar.add (btnneco);
		toolBar.addSeparator ();
		toolBar.add (btnjamb);
		toolBar.addSeparator ();
		toolBar.addSeparator ();
		toolBar.add (btnwaectips);
		toolBar.addSeparator ();
		toolBar.add (btnnecotips);
		toolBar.addSeparator ();
		toolBar.add (btnjambtips);
		toolBar.add (btnnotepad);
		toolBar.addSeparator ();
		toolBar.addSeparator ();
		toolBar.add (btnmath);
		toolBar.addSeparator ();
		toolBar.add (btnHelp);
		toolBar.addSeparator ();
		toolBar.add (btnKey);
		toolBar.addSeparator ();
		toolBar.add (btncalc);
		toolBar.addSeparator ();
		toolBar.add(btnabout);
		toolBar.addSeparator ();
		toolBar.addSeparator ();
		toolBar.add(label);
		
		

		
		
		
		
		//con.add( b,BorderLayout.WEST);
	    //con.add(tab,BorderLayout.CENTER);
	 //   con.add(txt1,BorderLayout.SOUTH);
		
		//Getting the Current User.

				//userName = user;
				userName="ayets";

				setVisible(true);
				//If Current User not Administrator of Program.

				if (!(userName.equals ("ayets"))) {
					btnwaec.setEnabled (false);
					btnneco.setEnabled (false);
					btnjamb.setEnabled (false);
					btnwaectips.setEnabled (false);
					btnnecotips.setEnabled (false);
					btnjambtips.setEnabled (false);
					btnnotepad.setEnabled (false);
					btncalc.setEnabled (false);
				    btnHelp.setEnabled (false);
				   btnmath.setEnabled (false);
				}
		
		

				//Creating the StatusBar of Program.

				lbStatus = new JLabel (" " + " Student's Curriculum System.", Label.LEFT);
				lbStatus.setForeground (Color.black);
				lbStatus.setToolTipText ("Program's Title");
				lbWelcome = new JLabel ("Welcome " + userName + " Today is " + d + " ", JLabel.RIGHT);
				lbWelcome.setForeground (Color.black);
				lbWelcome.setToolTipText ("Welcome User : System Current Date");
				statusbar.setLayout (new BorderLayout());
				statusbar.add (lbStatus, BorderLayout.WEST);
				statusbar.add (lbWelcome, BorderLayout.EAST);

				
				
				//Setting the Contents of Programs.

				getContentPane().add (toolBar, BorderLayout.NORTH);
				getContentPane().add (desktop, BorderLayout.CENTER);
				getContentPane().add (statusbar, BorderLayout.SOUTH);

				//Getting the Database.

				//con = conn;

				//Showing The Main Form of Application.

				setVisible (true);
setLocation(0,0);
setResizable(false);
setSize(1328,710);
			}









//Function For Performing different Actions By Menus of Program.




@Override
public void actionPerformed (ActionEvent ae) {
	Object obj = ae.getSource();
	
	
	if (obj == close) {

		JInternalFrame Frames[] = desktop.getAllFrames (); 	//Getting all Open Frames.

		for (int getFrameLoop = 0; getFrameLoop < Frames.length; getFrameLoop++) {
			try {
 				Frames[getFrameLoop].setClosed (true); 	//Close the Active Frame.
				break;					//Exit From Loop.
			} 
			catch (Exception CloseExc) { }			//if Error then Do Nothing.
		}
	}
	

	

	else if ( obj == calculator) {
		calc sa=new calc();
			desktop.add(sa);
		sa.show();
	
	}
	


	
	
	

	else if ( obj == mathsgra || obj==btnmath) {
		math sa=new math();
			desktop.add(sa);
		sa.show();
	
	}

	else if (obj == mathformular || obj == btnmathformular) {
		mathformular sa=new mathformular();
				desktop.add (sa);
			sa.show ();
	
	}
	


	else if (obj == calculator || obj == btncalc) {
		calc sa=new calc();
				desktop.add (sa);
			sa.show ();
	
	}
	
	
	else if (obj == label) {
		txt sa=new txt();
				desktop.add (sa);
			sa.show ();
	
	}


	else if (obj == vitaetopic ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Vitae Topics & Explanation", "C:/workspace/workspace/StudentCUrriculum/Helps/vitaetopic.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		}
	
	
	
	


	else if (obj == advice ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("ADVICE FOR CANDIDATES", "C:/workspace/workspace/StudentCUrriculum/Helps/advice.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		}
	



	else if (obj == waectopics ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("WAEC MATHS TOPICS FOR QUICK REVISION", "C:/workspace/workspace/StudentCUrriculum/Helps/waectopics.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		}
	



	else if (obj == mnuwaec || obj == btnwaec) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("WAEC SYLLABUS", "C:/workspace/workspace/StudentCUrriculum/Helps/waec.htm");
			desktop.add (hlpKey);
			hlpKey.show ();
		}
	


	else if (obj == mnujamb || obj == btnjamb) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("JAMB SYLLABUS", "C:/workspace/workspace/StudentCUrriculum/Helps/mathjamb.htm");
			desktop.add (hlpKey);
			hlpKey.show ();
		}
	
		else if (obj == notepad || obj == btnnotepad) {

			//Showing the Shortcut Keys of Program to Guide User.
			boolean b = openChildWindow ("General Topics for waec and neco");
			if (b == false) {
			notepad sa=new notepad();
					desktop.add (sa);
				sa.show ();
			}
		
		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("LibrarySystem Keys");
		
	}
	
	

		else if (obj == miquit) {

			quitApp ();	
		}//Calling the Function to Quit the Program.

		
	

		else if (obj == textbooks || obj == btnTextbooks) {

			//Showing the Shortcut Keys of Program to Guide User.
		//	boolean b = openChildWindow ("General Topics for waec and neco");
			//if (b == false) {
			CurriculumHelp sa=new CurriculumHelp("RECOMMENDED TEXTBOOKS", "C:/workspace/workspace/StudentCUrriculum/Helps/textbooks.html");
					desktop.add (sa);
				sa.show ();
			}
	
	

		else if (obj == waec || obj == btnwaectips) {

			//Showing the Shortcut Keys of Program to Guide User.
			//boolean b = openChildWindow ("General Topics for waec and neco");
			//if (b == false) {
			CurriculumHelp hlpKey = new CurriculumHelp("WAEC TIPS", "C:/workspace/workspace/StudentCUrriculum/Helps/guide15.html");
				desktop.add (hlpKey);
				hlpKey.show ();
			}
	
	
	
	
	
	/*
		else if (b == false) {
			tuitor hlpKey = new tuitor();
			desktop.add (hlpKey);
			hlpKey.show ();
		}*/
	else if (obj == about||obj==btnabout) {
		
				abtme dlMember = new abtme();
				desktop.add (dlMember);
				dlMember.show ();
			
		
			
	
		
	}
	else if (obj == closeAll) {

		JInternalFrame Frames[] = desktop.getAllFrames (); 	//Getting all Open Frames.

		for (int getFrameLoop = 0; getFrameLoop < Frames.length; getFrameLoop++) {
			try {
 				Frames[getFrameLoop].setClosed (true); 	//Close the Active Frame One By One.
			} 
			catch (Exception CloseExc) { }			//if Error then Do Nothing.
		}

	}

	
	else if (obj == help || obj == btnKey) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Help Centre", "C:/workspace/workspace/StudentCUrriculum/Helps/helpcentre.htm");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}
	

	
	else if (obj == necoviainternet || obj == btnnecocheckviainternet) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp("Check Neco Via Internet", "C:/workspace/workspace/StudentCUrriculum/Helps/necoresultinternet.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}
	
	

	else if (obj == waecviainternet || obj == btnwaeccheckviainternet) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Check Waec Result Online", "C:/workspace/workspace/StudentCUrriculum/Helps/waecresultinternet.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}
	

	
	else if (obj == necoviasms ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Check Neco Result both Online & Offline", "Helps/necoresultsms1.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}
	

	
	else if (obj == jambviainternet ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp("Check jamb Result  Online", "C:/workspace/workspace/StudentCUrriculum/Helps/jambresultonline.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}
	
	

	
	else if (obj == waecviasms || obj == btnwaeccheckviasms) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Check Waec Result Offline(via SMS)", "C:/workspace/workspace/StudentCUrriculum/Helps/waecresultsms.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}
	

	else if (obj == inspiration ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Inspirational Quotes", "C:/workspace/workspace/StudentCUrriculum/Helps/inspiration.htm");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}
	
	
	else if (obj == eduaction ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
			//generalhelp hlpKey = new generalhelp ("Educational Quotes", "Helps/education.htm");
		CurriculumHelp hlpKey = new CurriculumHelp ("Educational Quotes", "C:/workspace/workspace/StudentCUrriculum/Helps/education.htm");
			

			
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}



	else if (obj == maths ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Maths Quotes", "C:/workspace/workspace/StudentCUrriculum/Helps//math.htm");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}

	
	
	
	

	
	
	
	else if (obj == examsuccess ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("A1 In English", "C:/workspace/workspace/StudentCUrriculum/Helps/examsuccess.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}

	
	
	
	
	
	
	
	
	else if (obj == success ) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Success Quotes", "C:/workspace/workspace/StudentCUrriculum/Helps/success.htm");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}

	

	
	else if (obj == mnuneco || obj == btnneco) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp("Neco Marking Scheme", "C:/workspace/workspace/StudentCUrriculum/Helps/necomarking.htm");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}
	

	
	else if (obj == neco|| obj == btnnecotips) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("NECO TIPS", "C:/workspace/workspace/StudentCUrriculum/Helps/necotips.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		}
	
	
	


	
	else if (obj == jamb|| obj == btnjambtips) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp("JAMB TIPS", "C:/workspace/workspace/StudentCUrriculum/Helps/guide16.html");
			desktop.add (hlpKey);
			hlpKey.show ();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	else if (obj == marking || obj==btnmarking) {

		//Showing the Shortcut Keys of Program to Guide User.
		//boolean b = openChildWindow ("General Topics for waec and neco");
		//if (b == false) {
		CurriculumHelp hlpKey = new CurriculumHelp ("Marking Scheme", "C:/workspace/workspace/StudentCUrriculum/Helps/necomarking.htm");
			desktop.add (hlpKey);
			hlpKey.show ();
		//}

	}

	
	
	


	
	

	else if (obj == change) {

		Color cl = desktop.getBackground ();	//Getting the Current Background Color.
		//Showing the Color Dialog Box to Change Background Color.
		cl = JColorChooser.showDialog (this, "Choose Background Color", cl);
		if (cl == null) { }			//If No Color is Selected.
		else {
			desktop.setBackground (cl);	//Aplying Selected Color for Background Color.
			desktop.repaint ();		//Repaint the DesktopPane.
		}}}


//Function Perform By LookAndFeel MenuItem (Style MenuItem).
/*
public void itemStateChanged (ItemEvent e) {

	for( int i = 0; i < radio.length; i++ )
		if(radio[i].isSelected()) {		//Getting Selected Look & Feel Option.
			changeLookAndFeel (i);		//Change the Program's Look & Feel.
		}

}	*/

//Function for Changing the Program's Look & Feel.

private void runComponents(String string) {
	// TODO Auto-generated method stub
	
}









public void changeLookAndFeel (int val) {

	
try{
	javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
	JFrame.setDefaultLookAndFeelDecorated(true);
} catch (Exception e) {
	System.out.println("error in loading theme "+e.getMessage());
	
	try {
		UIManager.setLookAndFeel (looks[val].getClassName());	//Getting the Look & Feel Name.
		SwingUtilities.updateComponentTreeUI (this);		//Changing Look & Feel of Program.
	}
	catch (Exception ex) { 
	System.out.println("error "+ex.getMessage());
	}
	}

}

//Loop Through All the Opened JInternalFrame to Perform the Task.

private boolean openChildWindow (String title) {

	JInternalFrame[] childs = desktop.getAllFrames ();		//Get All Open Child Windows.
	for (int i = 0; i < childs.length; i++) {
		if (childs[i].getTitle().equalsIgnoreCase (title)) {	//Getting the Title of Child Window.
			childs[i].show ();				//Setting Focus on the Child Window.
			return true;
		}
	}
	return false;

}









private void quitApp () {

	try {
		//Show a Confirmation Dialog.
	    	int reply = JOptionPane.showConfirmDialog (this, 
			"Are you really want to exit From\nAyetolu Samuel's Student's Curriculum?",
			"Student's Curriculum- Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
		//Check the User Selection.
		if (reply == JOptionPane.YES_OPTION) {				//If User's Choice Yes then.
			setVisible (false);					//Hide the Frame.
			System.out.println ("\n\nThanks For Using Ayetolu " + 	//Displaying Message on Screen.
					"Samuel's Student's Curriculum System.\nAuthor : " + 
					"Ayetolu Samuel Setonji \n");
			dispose();            					//Free the System Resources.
			System.exit (0);        				//Close the Application.
		}
		else if (reply == JOptionPane.NO_OPTION) {			//If User's Choice No then.
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);	//Do Nothing Return to Program.
		}
	} 

	catch (Exception e) {}

}












		
@Override
public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	
}
		
}
