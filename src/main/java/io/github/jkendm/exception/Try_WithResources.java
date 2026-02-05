package io.github.jkendm.exception;

import java.io.FileReader;
import java.io.IOException;

public class Try_WithResources {
    public static void main(String[] args) {
        //declaring try with resources
        //try (resources declaration)
        try(FileReader fr = new FileReader ("D:\\HelloWorld.txt")){
            char [] a = new char [100];
            fr.read(a); // reading the content to array
            for (char c:a){
                System.out.println(c);//print the character one by one
            } 
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of range: " + e.getMessage());
        }
        // Reader automatically closed here, even if exception occurs
    }
  
    
}
