package io.github.jkendm.practice_exercise;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        // Testing the conversion, the user inputs the values

        
         Scanner scanner = new Scanner(System.in);

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble(); // waiting for the user to input
        double fahrenheitResult = celsiusToFahrenheit(celsius); // takes the celsius value and converts it inside the method
        System.out.println("Celsius to Fahrenheit: " + fahrenheitResult);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = fahrenheitToCelsius(fahrenheit);
        System.out.println("Fahrenheit to Celsius: " + celsiusResult);

        scanner.close();

        printTemperatureTable();

    }
    //converting celsius to Fahrenheit and returning the value

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9.0/5.0) + 32 ; 

    }
//Fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0/9.0;
    }
    
    public static double celsiusToFahrenheit(int celsius){
        return (celsius * 9/5) + 32 ; 

    }

    public static void printTemperatureTable(){
        System.out.println("\nTemperature Conversion Table"); // prints in a new line
        System.out.println("°C\t°F"); //\t - creates a tab
        // using the for loop to print with the steps of 10
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            double fahrenheit = celsiusToFahrenheit(celsius); //takes the conversion from the method
            System.out.printf("%d\t%.1f%n", celsius, fahrenheit);
        }
    }
}
