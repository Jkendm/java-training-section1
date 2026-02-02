package io.github.jkendm.practice_exercise.javase011;
import java.util.Date;

public class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, Date paymentDate, String email) {
        super(amount, paymentDate);
        this.email = email;
    }

    @Override
    public void processPayment() {
        if (validateAmount()) {
            System.out.println("Processing PayPal payment of $" + amount + " for " + email);
        } else {
            System.out.println("Invalid amount for PayPal payment.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "PayPalPayment [Amount=" + amount + ", Date=" + paymentDate +
               ", Email=" + email + "]";
    }
}
