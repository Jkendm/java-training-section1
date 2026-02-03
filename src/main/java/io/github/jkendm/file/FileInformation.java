package io.github.jkendm.file;
 import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File myObj = new File ("D:\\HelloWorld.txt");
        if (myObj.exists()){
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute Path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File in size bytes: " + myObj.length());
        } else{
            System.out.println("File doesn't exist");
        }
    } 
    
}
