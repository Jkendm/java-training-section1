package io.github.jkendm.practice_exercise;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        // Testing the conversion, the user inputs the values

        
         Scanner scanner = new Scanner(System.in);

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitResult = celsiusToFahrenheit(celsius);
        System.out.println("Celsius to Fahrenheit: " + fahrenheitResult);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = fahrenheitToCelsius(fahrenheit);
        System.out.println("Fahrenheit to Celsius: " + celsiusResult);

        scanner.close();

    }
    //converting celsius to Fahrenheit and returning the value

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9.0/5.0) + 32 ; 

    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0/9.0;
    }

}
