package io.github.jkendm.practice_exercise.javase011;
import java.util.Date;

public class CreditCardPayment extends Payment {
    //declaring the fields for the class
    private String cardNumber;
    private String expiryDate;

    //defining the constructors
    public CreditCardPayment(double amount, Date paymentDate, String cardNumber, String expiryDate){
        super(amount, paymentDate);
        this.cardNumber=cardNumber;
        this.expiryDate=expiryDate;
    }

    //implementing the inherited classes
    @Override

    public void processPayment(){
        if (validateAmount()){
            System.out.println("Processing credit card payment of $: " + amount);
        } else{
            System.out.println("Invalid amount for credit card payment");
        }
    }

    //getPaymentDetails- Use the toString method to read date
    @Override
    public String getPaymentDetails(){
        return "CreditCardPayment[Amount = " + amount+ ", Date= " + paymentDate + ", CardNumber= " + cardNumber + ", Expiry= " + expiryDate + "]";

    }
    
}
