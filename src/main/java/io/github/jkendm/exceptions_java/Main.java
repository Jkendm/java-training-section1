package io.github.jkendm.exceptions_java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try{
              createStudent("John","001","CS");
        }
        catch (StudentAlreadyExistException exception){
            
            System.out.println(exception.getMessage());
        }
      
        
    }
    // throw - is an informer
    public static void createStudent(String name, String regNo, String course) throws StudentAlreadyExistException {
        //
        Set<String> names= new HashSet<>();
        names.addAll(Set.of("John", "Mhusika","Joy","Wesmut"));
        if (!names.contains(names)){
            //throw is is used to throw an alarm/ create exception
            //throw then create an instance of exception
            //throw is an informer to the compiler or dev on the kind of exception that a method can raise
            throw new StudentAlreadyExistException ("Student with name" + name + "already exist");
        }
    }

    //public static void userInput(){
       // Scanner scanner = new Scanner(System.in);
       // try{
            //happy path execution
            //  System.out.println("Enter your age");
        //int age = scanner.nextInt();

       // } catch (InputMismatchException exceptions_java){
     //       System.out.println("Exception happened");
      //  }
      

 //   }  
 
 
}
