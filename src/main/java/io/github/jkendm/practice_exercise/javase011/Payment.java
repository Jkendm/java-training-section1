package io.github.jkendm.practice_exercise.javase011;
//importing date
import java.util.Date;

public abstract class Payment {
    //defining the fields
    protected double amount;
    protected Date  paymentDate;

    //defining the constructors
    public Payment(double amount, Date paymentDate){
        this.amount=amount;
        this.paymentDate=paymentDate;
    }

    //defining the abstract method- are to be implemented by subclasses
    public abstract void processPayment();
    public abstract String getPaymentDetails();

    //defining the concrete method- reusable across all payment types
    public boolean validateAmount(){
        return amount > 0;
    }

    
}
