package io.github.jkendm.assessment3_joykendi.problem3;

public class OutOfStockException extends Exception {
    //thrown when the stock reduction exceeds available quantity
    public OutOfStockException(String message){
        super(message);
    }
    
}
