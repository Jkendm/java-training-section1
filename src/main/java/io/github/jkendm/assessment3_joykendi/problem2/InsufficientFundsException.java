package io.github.jkendm.assessment3_joykendi.problem2;

public class InsufficientFundsException extends Exception{
    //Checked exception- caught during compilation
    //Thrown when withdraw or transfer exceeds available limit
        public InsufficientFundsException(String message) { 
            super(message); 
        } 
    } 
    
