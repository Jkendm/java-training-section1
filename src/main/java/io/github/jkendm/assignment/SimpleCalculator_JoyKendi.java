package io.github.jkendm.assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Simple Console Calculator
 * Student Name: Joy Kendi
 * Date: 20th January 2026
 *
 * Features:
 * - Basic arithmetic operations
 * - Continuous operation
 * - Error handling for division by zero
 *
 * Bonus Features:
 * - Modulus, Power, Square Root
 * - Memory functionality
 * - History of last 5 calculations
 */
public class SimpleCalculator_JoyKendi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double memory = 0;
        double lastResult = 0;
        ArrayList<String> history = new ArrayList<>();
        final int MAX_HISTORY = 5; //setting a constant to only get 5 last history

        System.out.println("========== Welcome to Simple Calculator ==========");
 // while loop to help display the menu
        while (true) {

            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Store Result to Memory");
            System.out.println("9. Display Memory");
            System.out.println("10. View Last 5 Calculations");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            if (choice == 11) {
                System.out.println("Thanks for visiting our Simple Calculator!");
                break;
            }

            double num1 = 0, num2 = 0, result = 0;
// Square root only accepts one number hence the use of if statement
            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } else if (choice == 7) {
                System.out.print("Enter number: ");
                num1 = scanner.nextDouble();
            }
// Used switch to perform the operations
            switch (choice) {

                case 1:
                    result = num1 + num2;
                    history.add(num1 + " + " + num2 + " = " + result); 
                    break;

                case 2:
                    result = num1 - num2;
                    history.add(num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    history.add(num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    history.add(num1 + " / " + num2 + " = " + result);
                    break;

                case 5:
                    result = num1 % num2;
                    history.add(num1 + " % " + num2 + " = " + result);
                    break;

                case 6:
                    result = Math.pow(num1, num2);
                    history.add(num1 + " ^ " + num2 + " = " + result);
                    break;

                case 7:
                    if (num1 < 0) {
                        System.out.println("Error: Cannot compute square root of a negative number.");
                        continue;
                    }
                    result = Math.sqrt(num1);
                    history.add("√" + num1 + " = " + result);
                    break;

                case 8:
                    memory = lastResult;
                    System.out.println("Result stored in memory: " + memory);
                    continue;

                case 9:
                    System.out.println("Memory value: " + memory);
                    continue;

                case 10:
                    if (history.isEmpty()) {
                        System.out.println("No calculations yet.");
                    } else {
                        System.out.println("Last 5 Calculations:");
                        for (String h : history) {
                            System.out.println(h);
                        }
                    }
                    continue;

                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            lastResult = result;

            if (history.size() > MAX_HISTORY) {
                history.remove(0);
            }

            System.out.println("Result: " + result);

            //Ask user if they want to continue
            System.out.print("Do you want to continue? (y/n): ");
            char continueChoice = scanner.next().charAt(0);

            if (continueChoice == 'n' || continueChoice == 'N') {
                System.out.println("Thanks for visiting our Simple Calculator!");
                break;
            }
        }

        scanner.close();
    }
}
