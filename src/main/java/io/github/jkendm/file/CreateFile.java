package io.github.jkendm.file;
//import the packages that help with creation of file
import java.io.File; //import the file class
import java.io.IOException; //the IO exception is to handle the errors

public class CreateFile {
    //the File class in java.io package helps us work with files
    //File myObj = new File("File.txt");
    public static void main(String[] args) {
        //use the try and catch block
        try{
            //The code
            File myObj = new File ("D:\\file.txt");
            if (myObj.createNewFile()){
                System.out.println("File Created: " + myObj.getName());

            }else {
                System.out.println("File already exist");
            }
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
