package io.github.jkendm.exception;

public class BasicTryCatch {
public static void main(String[] args) {
    try {
        // Potentially dangerous code
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Exception handler
            System.out.println("Array index is out of bounds!");
            System.out.println("Exception: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
