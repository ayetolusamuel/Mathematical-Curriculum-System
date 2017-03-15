package project1;
import java.util.*;
import java.io.*;

import javax.swing.JInternalFrame;

public class notepad extends JInternalFrame{
notepad(){
	
	
	Runtime run=Runtime.getRuntime();
	try{
		run.exec("notepad");
	}

catch(Exception ex){
	
System.out.println(ex.getMessage());
}
}
}
