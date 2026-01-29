package io.github.jkendm.exceptions_java;

// making an custom exception
public class StudentAlreadyExistException extends Exception {
    //Go to the hierarchy and  check if you want to create an IOor runtime exception
    public StudentAlreadyExistException(String message){
     super(message); // default constructor- the parent constructor

    }
    
}
