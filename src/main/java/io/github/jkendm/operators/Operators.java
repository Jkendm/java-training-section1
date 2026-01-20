package io.github.jkendm.operators;

public class Operators {
static int a =15 , b =4;
    public static void main(String[] args) {
        
        //arithmeticOperators();
        //relationalOperators();
        //logicalOperators();
        //assignmentOperators();
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
        System.out.println("Equal to: " + (a == b)); //false
        System.out.println("Not equal to: " + (a != b)); //true
        System.out.println("Greater than: " + (a > b)); //true
        System.out.println("Less than: " + (a < b)); //false
        System.out.println("Greater than or equal to: " + (a >= b)); //true
        System.out.println("Less than or equal to: " + (a <= b)); //false

        // for Strings comparison , For objects use .equals() method
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("String Equal to: " + str1.equals(str2)); //true
        System.out.println("String Not equal to: " + !str1.equals(str2)); //false
    }

    public static void logicalOperators() {
        // Logical Operators
         System.out.println("========== Logical Operators ==========");
        boolean isSunny = true;
        boolean isWeekend = false;
        int temperature = 25;

        System.out.println("Good weather: " + (isSunny && temperature > 20)); // true , Both are true
        System.out.println("Outdoor day: " + (isSunny || isWeekend)); // true, atleast one is true  
        System.out.println("Not Sunny: " + (!isSunny)); // false, The reverse

        //complex condition
        System.out.println("Perfect day for a walk: " + (isSunny && !isWeekend && temperature >= 20 && temperature <= 30)); // true

    }

    public static void assignmentOperators() {
        // Assignment Operators
         System.out.println("========== Assignment Operators ==========");
        int c = 20;
        System.out.println("Initial value: " + c);
        c += 5;
        System.out.println("After += 5: " + c); // x= x+5 =25
        c -= 3;
        System.out.println("After -= 3: " + c); // x= x-3 =22
        c *= 2;
        System.out.println("After *= 2: " + c); // x= x*2 =44
        c /= 4;
        System.out.println("After /= 4: " + c); // x= x/4 =11
        c %= 3;
        System.out.println("After %= 3: " + c); // x= x%3 =2
    }

    public static void incrementDecrementOperators() {
        System.out.println("========== Increment and Decrement Operators ==========");
        // Increment and Decrement Operators
        int d = 10;
        System.out.println("Initial value: " + d);
        System.out.println("Post-increment: " + (d++)); // Use the current value, then increment
        System.out.println("After Post-increment: " + d);// Value after increment
        System.out.println("Pre-increment: " + (++d));// Increment first, then use the value
        System.out.println("After Pre-increment: " + d);
        System.out.println("Post-decrement: " + (d--));// Use the current value, then decrement
        System.out.println("After Post-decrement: " + d);
        System.out.println("Pre-decrement: " + (--d));// Decrement first, then use the value
        System.out.println("After Pre-decrement: " + d);
    }    

}
