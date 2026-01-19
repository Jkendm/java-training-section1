package io.github.jkendm.variables;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // region: First set of variables
        // Syntax dataType variableName;
        int score;
        String message;
        double price;
        // Declaration + Assignment
        score = 100;
        message = "Hello";
        price = 19.99;
        // Print variables

        System.out.println("Score: " + score);
        System.out.println("Message: " + message);
        System.out.println("Price: " + price);
        // endregion

        // region: Second set of variables
        int number = 100;
        double decimal = 15.75;
        String text = "Welcome to Java Programming!";
        final int CONSTANT_VALUE = 50; // constant variable
       // int CONSTANT_VALUE = 60; // This will cause a compilation error
       boolean isJavaFun=false;

       float area=10.5f;



        Date date = new Date();

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        System.out.println("String: " + text);
        System.out.println("Date: " + date);
        System.out.println("Constant Value: " + CONSTANT_VALUE);
        System.out.println("The area of the figure is :" +area);
        System.out.println(isJavaFun);

        // endregion
    }
}
