package io.github.jkendm.practice_exercise.javase011;

import java.util.*;

public class PaymentTest {
    public static void main(String[] args) {
        Date today = new Date(); //LocalDate myObj = LocalDate.now();

        // Polymorphic array of payments - Array of abstract type, holding concrete object
        Payment[] payments = {
            new CreditCardPayment(1000, today, "1234-5678-9087-6754", "12/30"),
            new PayPalPayment(1000, today, "joymakena@gmail.com"),
            new BankTransferPayment(500.0, today, "12345678", "Standard Bank")
         };

        // Process all payments polymorphically
        for (Payment p : payments) {
            p.processPayment();
            System.out.println(p.getPaymentDetails());
            System.out.println("----------------------------");
        }
    }
}

