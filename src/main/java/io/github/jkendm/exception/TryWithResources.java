package io.github.jkendm.exception;
//import classes for file input/output streams and for reading input
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class TryWithResources {
    public static void main(String[] args) {
        //the old way of try with resources 
        //oldWay();
        //newWay();
       // multipleTryWithResources("C:\\Users\\ADMIN\\OneDrive\\Desktop\\jkendm\\java-training\\src\\main\\java\\io\\github\\jkendm\\exception\\source.txt" , "C:\\src\\main\\java\\io\\github\\jkendm\\exception\\destination.txt");
       multipleTryWithResources("C:\\Users\\ADMIN\\OneDrive\\Desktop\\jkendm\\java-training\\src\\main\\java\\io\\github\\jkendm\\exception\\source.txt","C:\\Users\\ADMIN\\OneDrive\\Desktop\\jkendm\\java-training\\src\\main\\java\\io\\github\\jkendm\\exception\\destination.txt");

    }
    private static void multipleTryWithResources(String sourcePath, String destPath){
        //multiple resources in try with resources 
        //FileInputStream input - reads bytes from the source file
        //FileOutputStream- Writes bytes to the destination file
        //Scanner scanner - Reads from Standard input
        //All these are automatically closed 

        try (FileInputStream input = new FileInputStream(sourcePath);
                FileOutputStream output = new FileOutputStream(destPath);
                Scanner scanner = new Scanner(System.in)) {
            byte [] buffer = new byte[1024]; // creates a buffer of 1024
            int bytesRead; //read chunks of data from the source file into the buffer
            while ((bytesRead = input.read(buffer)) != -1){
                output.write(buffer,0,bytesRead); //Writes those chunks into the destination file
            } 
            System.out.println("Files copied successfully"); 
        } catch (FileNotFoundException e){
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e){
            System.out.println("Error: IO operation failed - " + e.getMessage());
        } 
        //all resources automatically closed

    }
    private static void newWay(){
        // try( resource declaration)
        try(BufferedReader reader = new BufferedReader(new FileReader("D:\\HelloWorld.txt"))){
            String line;
            while((line=reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        //reader automatically closed here, even if exception occurs
    }

    private static void oldWay() {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("D:\\HelloWorld.txt"));
            String line;
            while((line=reader.readLine()) != null){
                System.out.println(line);
            }

        } catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());

        } finally{
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e){
                    System.out.println("Error Closing file: " + e.getMessage());
                }
            }
        }
    }
}
