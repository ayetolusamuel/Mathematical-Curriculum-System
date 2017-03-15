package project1;


import javax.swing.*;

import java.awt.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.*;

import javax.swing.text.*;
import javax.swing.event.*;

//The Following Class Use to Display Help of Program. You Can Show Your Program's Help too. Just Provide the Help Form
//Title & HTML FileName With Full Path to the Constructor of this Class. If HTML File is in Same Folder then Just Provide
//the Name of the HTML File with its Extension.

@SuppressWarnings("serial")
public class CurriculumHelp extends JInternalFrame {

	//Constructor of Class.

	public CurriculumHelp (String title, String filename) {

		//super(Title, Resizable, Closable, Maximizable, Iconifiable)
		super (title, false, true, true, true);
		setSize (500, 500);

		HtmlPane html = new HtmlPane (filename);	//Providing the HTML File.
		setContentPane (html);				//Setting the ContentPane of Form to Show HTML File.

		setVisible (true);

	}

}
