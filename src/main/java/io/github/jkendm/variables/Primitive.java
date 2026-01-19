package io.github.jkendm.variables;

public class Primitive {
    public static void main(String[] args) {
        // Integer types
        int age = 25;
        long bigNumber = 123456789L;
        // Decimal types
        float price = 19.99f;
        double precise = 3.1415926535;
        // Character and boolean
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        //Type casting example -> Widening conversion from smaller to larger data type
        int intNumber =100;
        double doubleNumber = intNumber; // Implicit casting

        System.out.println("Integer Number: " + intNumber);
        System.out.println("Double Number (after implicit casting): " + doubleNumber);

        //Narrow casting from larger to smaller data type
        double myDouble =45.50;
        int myInt= (int) myDouble; // Explicit casting (the brackets is because we are forcing the conversion)
        System.out.println("Double Value: " + myDouble);
        System.out.println("Integer Value (after explicit casting): " + myInt);


    }

}
