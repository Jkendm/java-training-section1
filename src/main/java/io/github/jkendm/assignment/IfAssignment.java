package io.github.jkendm.assignment;

import java.util.Scanner;

public class IfAssignment {
    public static void main(String[] args) {
        //ageCategory();
        CalculatorOperations();
    }
    public static void CalculatorOperations() {
        Scanner scanner = new Scanner(System.in);
        // Enter first number
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        // Enter second number
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        // Enter operator
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        // Perform operation based on operator
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2; // Cast to double for decimal division
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }


    public static void ageCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 2){
            System.out.println("You are an infant. ");
        }
        else if( age > 2 && age <=12){
            System.out.println("You are a child. ");
        }
        else if( age > 12 && age <=19){
            System.out.println("You are a teenager. ");
        }
        else if( age > 19 && age <=64){
            System.out.println("You are an adult. ");
        }
        else{
            System.out.println("You are a senior citizen. ");
        }
        scanner.close();
    }
}
