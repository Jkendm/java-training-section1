package io.github.jkendm.operators;

public class Operators {
    static int a = 15;
    static int b = 4;

    public static void main(String[] args) {
        arithmeticOperators();
        relationalOperators();
        logicalOperators();
        assignmentOperators();
        incrementDecrementOperators();
    }

    public static void arithmeticOperators() {
        // Arithmetic Operators
        System.out.println("========== Arithmetic Operators ==========");   
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        double result= (double ) a / b;
        System.out.println("Decimal Division: " + result);
    }

    public static void relationalOperators() {
        // Relational Operators
         System.out.println("========== Relational Operators ==========");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));
    }

    public static void logicalOperators() {
        // Logical Operators
         System.out.println("========== Logical Operators ==========");
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));
    }

    public static void assignmentOperators() {
        // Assignment Operators
         System.out.println("========== Assignment Operators ==========");
        int c = 20;
        System.out.println("Initial value: " + c);
        c += 5;
        System.out.println("After += 5: " + c);
        c -= 3;
        System.out.println("After -= 3: " + c);
        c *= 2;
        System.out.println("After *= 2: " + c);
        c /= 4;
        System.out.println("After /= 4: " + c);
        c %= 3;
        System.out.println("After %= 3: " + c);
    }

    public static void incrementDecrementOperators() {
        System.out.println("========== Increment and Decrement Operators ==========");
        // Increment and Decrement Operators
        int d = 10;
        System.out.println("Initial value: " + d);
        System.out.println("Post-increment: " + (d++));
        System.out.println("After Post-increment: " + d);
        System.out.println("Pre-increment: " + (++d));
        System.out.println("After Pre-increment: " + d);
        System.out.println("Post-decrement: " + (d--));
        System.out.println("After Post-decrement: " + d);
        System.out.println("Pre-decrement: " + (--d));
        System.out.println("After Pre-decrement: " + d);
    }    

}
