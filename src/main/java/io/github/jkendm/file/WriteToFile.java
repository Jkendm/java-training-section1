package io.github.jkendm.file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("D:\\file.txt");
            myWriter.write("Java is fun to read and code if you really practice");
            myWriter.close(); //close the resources
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    
}
