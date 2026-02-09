package io.github.jkendm.exception;

import java.util.HashSet;
import java.util.Set;

//checked exception- forced to handle the exception using the try-catch block
//unchecked exception- not forced to handle them

public class CustomException{
   static Set<String> names = new HashSet<>(Set.of("John" , "Lucy", "Kendi","Steve"));
    public static void main(String[] args) {
        //Create a student
        try{
        createStudent("John", "001","Engineering");
    } catch (StudentAlreadyExistException e){
            e.printStackTrace(); // Shows the location of the error
            System.out.println(e.getMessage());
          
         }
        //Finding a student by ID
        findStudentByName("Amara");
        //Update student
        //Delete student

    }

// throws is an informer to the compiler or dev on the kind of exception that a method can raise
    private static void createStudent(String name, String regNo, String course) throws StudentAlreadyExistException {
        //Check if the student already exist
        //if the student exists, throw an error
        if (names.contains(name)){
            //throw - create an instance and invoke an signature
            //throw is used to raise an alarm (create an exception)
            throw new StudentAlreadyExistException ("Student with name " + name + " already exists");
        } 
        names.add(name);
        System.out.println("Student with name: " + name + " created successfully!!");

    }

    //unchecked exception
    public static String findStudentByName(String name){
        if(names.contains(name)){
            return name;
        } throw new StudentNotFoundException("Student with name " + name + " not found" );
    }
}