package io.github.jkendm.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
        File myObj = new File ("D:\\file.txt");
        Scanner myReader = new Scanner (myObj);
        while (myReader.hasNextLine()){
            boolean data = myReader.hasNextLine();
            System.out.println(data);
            break;
     } myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    
}
