package org.technoelevate.assignment02;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {
	 public static void main(String args[])  {
	        try {
	 
	            // Following file does not exist
	            File file = new File("E://file.txt");
	 
	            FileReader fr = new FileReader(file);
	        } catch (FileNotFoundException e) {
	           System.out.println("File does not exist");
	        }
	    }
}

/*  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	No exception of type FileNotFoundException can be thrown; an exception type must be a subclass of Throwable

	at org.technoelevate.assignment02.FileNotFoundException.main(FileNotFoundException.java:14)
  */
