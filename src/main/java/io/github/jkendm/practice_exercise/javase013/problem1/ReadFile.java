package io.github.jkendm.practice_exercise.javase013.problem1;

/*
The problem breakdown is like
1. Declaring the resources
2. try block
3. catch block
4. finally block
5. continue execution
 */

//importing the file packages needed
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader br = null; //creates a variable to be used later safely

        try{
            //read the filename from the command line 
            String filename = args[0]; //first value typed when running a program

            //open the file
            FileReader fr = new FileReader(filename); //FIleReader is the object that opens the file, connects java to the computer
            br = new BufferedReader(fr); //Makes reading the files easier and faster

            //read and display the file content
            String line; //store one line from the file

            while ((line=br.readLine()) != null ){
                // br.readLine(), reads ONE line from the file, if none is left, it returns Null
                System.out.println(line); //prints the line contents

            }

        }  
        //catch statement to handle each exception clearly
        catch (ArrayIndexOutOfBoundsException e){
            //mapping the accessing args[0] 
            System.out.println("Please provide a filename");
        }
        catch(FileNotFoundException e){
             System.out.println("File not found.");
        }
        catch (IOException e){
            System.out.println("Error reading the file");
        }

        //finally block to close the resources
        finally{
            try{
                if (br !=null){
                    br.close();
                    System.out.println("File CLosed");
                }
            } catch (IOException e){
                System.out.println("Error closing the file.");
            }
        }
        //program continues
        System.out.println("Program continues execution ");
        
    }
    
}
