package io.github.jkendm.assessment3_joykendi.problem2;

public class InvalidTransactionException extends RuntimeException{
       // Unchecked Exception: Caught during runtime
    //  Thrown when transaction input is invalid (e.g., negative deposit/withdrawal)
        public InvalidTransactionException(String message) { 
            super(message); 
        } 
    } 
    