package io.github.jkendm.exception;
//making a custom exception

public class StudentAlreadyExistException extends Exception {
    //creating an exception, you have to decided if it is checked or unchecked
   public StudentAlreadyExistException(String message){
        super(message); //call to the parent class
    }
}
