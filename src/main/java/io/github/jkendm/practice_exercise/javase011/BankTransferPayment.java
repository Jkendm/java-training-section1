package io.github.jkendm.practice_exercise.javase011;
import java.util.Date;

public class BankTransferPayment extends Payment {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(double amount, Date paymentDate, String accountNumber, String bankName) {
        super(amount, paymentDate);
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void processPayment() {
        if (validateAmount()) {
            System.out.println("Processing bank transfer of $" + amount + " to " + bankName);
        } else {
            System.out.println("Invalid amount for bank transfer.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "BankTransferPayment [Amount=" + amount + ", Date=" + paymentDate +
               ", Account=" + accountNumber + ", Bank=" + bankName + "]";
    }
}
