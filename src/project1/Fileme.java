package project1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileme {

	
	public static void main(String[] args) {
		java.io.File file=new java.io.File("samuel.txt");
		try{
			Scanner scan=new Scanner(file);
			while(scan.hasNext()){
				String sam=scan.nextLine();
			System.out.println(sam);
			}
			
			
		}
	catch(FileNotFoundException ex){
		System.err.format("File not found");
	}
	}
	
	
}
