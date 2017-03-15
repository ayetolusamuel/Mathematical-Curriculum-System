package project1;
import java.util.*;
import java.io.*;

import javax.swing.JInternalFrame;

public class calc extends JInternalFrame{
calc(){
	
	
	Runtime run=Runtime.getRuntime();
	try{
		run.exec("calc");
	}

catch(Exception ex){
	
System.out.println(ex.getMessage());
}
}
}
