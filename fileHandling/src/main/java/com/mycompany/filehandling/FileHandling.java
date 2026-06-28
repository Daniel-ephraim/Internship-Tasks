/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filehandling;

/**
 *
 * @author USER
 */
import java.io.*;

public class FileHandling {

    public static void main(String[] args) {
        String inputFile = "/D://DANIEL'S WORK//CodVeda Intern//inputFile.txt/";
        String outputFile = "/D://DANIEL'S WORK//CodVeda Intern//outputFile.txt/";
        
        int wordCount = 0;
        int lineCount = 0;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            
            while((line = reader.readLine()) !=null){
                lineCount++;
                
                String[] wordList = line.trim().split("\\s+");
                
                if(!line.trim().isEmpty()){
                    wordCount += wordList.length;                    
                }
            }
            reader.close();
            
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("==FILE RESULTS==");
            writer.newLine();
            writer.write("Total Lines: " + lineCount);
            writer.newLine();
            writer.write("Total words: " + wordCount);
            
            writer.close();
            
            System.out.println("Successful Reading and Writing.");
            System.out.println("Results saved to " + outputFile);
        } 
        catch(FileNotFoundException e){
            System.out.println("Error: file not found!!!");
        }
        catch(IOException e){
            System.out.println("Error reading or writing the file!!");
        }
    }
}
