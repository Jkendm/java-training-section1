package io.github.jkendm.assessment3_joykendi.problem2;

public class AccountNotFoundException extends Exception {
    // Checked Exception: Thrown when attempting to transfer to a non-existent account
     public AccountNotFoundException(String message) {
             super(message);
             }    
}
