package io.github.jkendm.assessment3_joykendi.problem3;

public class InvalidProductException extends Exception {
    //InvalidProductException is thrown when product is invalid, e.g., negative price,empty name
    public InvalidProductException(String message){
        super(message);
    }
}
