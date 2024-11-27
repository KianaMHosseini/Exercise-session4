package ir.isc.exercise4.num2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
	  
	public static void main(String[] args) throws FileUtilsException {
	        String fileName = "example.txt"; 
	        readFile(fileName);
	    }

	public static void readFile(String fileName) throws FileUtilsException {
		BufferedReader reader = null;
		
        try {
            // Create a BufferedReader to read the file
            reader = new BufferedReader(new FileReader(fileName));
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line); 
            }
            
        } catch (FileNotFoundException e) {
            throw new FileUtilsException("Error: The file was not found. Please check the file path."); 
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
            e.printStackTrace(); 
        }  
	}
        
        public static void WriteFile(String data, String fileName) throws FileUtilsException {
            try (
            		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                bw.write(data);
                System.out.println("Data written to file: " + fileName);
            } catch (IOException e) {
            	throw new FileUtilsException("Error: Could not write to the file " + fileName);
                
            }
		
		
	}

}
