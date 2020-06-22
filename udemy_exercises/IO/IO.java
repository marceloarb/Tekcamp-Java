package IO;

import java.io.*;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class IO {
	
	public static void main(String[] args) throws IOException {
		Path p1 = FileSystems.getDefault().getPath("/Users/marcelobarbosa/Documents_copy/teksystems/Tekcamp-Java/udemy_exercises/MySimpleBank/Account.java");
		
		System.out.println(p1);
		write(200);
        InputStreamReader inp = null; 
        inp = new InputStreamReader(System.in); 
  
        System.out.println("Enter characters, "
                           + " and '0' to quit."); 
        char c; 
        do { 
            c = (char)inp.read(); 
            System.out.println(c); 
        } while (c != '0'); 
    } 
	public static void write (int c) throws IOException{
		String str = "File Handling in Java using "+ 
                " FileWriter and FileReader"; 
  
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("output.txt"); 
  
        // read character wise from string and write  
        // into FileWriter  
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        System.out.println("Writing successful"); 
        //close the file  
        fw.close(); 
	}

	
	
	
}
