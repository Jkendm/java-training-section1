package io.github.jkendm.assignment;

import java.util.Scanner;

public class Assignment1_JoyKendi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("num1: " + num1);

        System.out.println("Enter second number: "); 
        int num2 = scanner.nextInt();
        System.out.println("num2: " + num2);
        
        arithmeticOperators(num1, num2, scanner);
    }
    
    public static void arithmeticOperators(int num1, int num2, Scanner scanner) {
        // Arithmetic Operators
        System.out.println("========== Arithmetic Operators ==========");   
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        double result = (double) num1 / num2;
        System.out.println("Decimal Division: " + result);

        //close the scanner
        scanner.close();
    }

}