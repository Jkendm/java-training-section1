package io.github.jkendm.assignment;

import java.util.Scanner;

public class Assessment1_JoyKendi {
    public static void main(String[] args) {
        
    variableOperators();
    gradeCalculator();
    numberSequence();
    inputValidation();
    patternPrinting();

    }

    //Question 1_ Variable Operators
    public static void variableOperators() {
        int a = 15 , b = 4 , c = 7;
        System.out.println("========== Variable Operators ==========");
        System.out.println("The sum of the three numbers is: " + (a+b+c));
        System.out.println("The product of a and b is: " + (a*b));
        System.out.println("The result of (a+b) * c is; " + ((a+b)*c));
        System.out.println("The remainder when a is divided by b is: " + (a%b));
    }

    //Question2- Takes the score of the student and determines the grade
    public static void gradeCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
            System.out.println("Grade: " + grade);
        } else if (score >= 80 && score < 90) {
            grade = 'B';
            System.out.println("Grade: " + grade);
        } else if (score >= 70 && score < 80) {
            grade = 'C';
            System.out.println("Grade: " + grade);
        } else if (score >= 60 && score < 70) {
            grade = 'D';
            System.out.println("Grade: " + grade);
        } else if ( score < 60 && score >= 0) {
            grade= 'E';
            System.out.println("Grade: " + grade);
        } else{
            System.out.println("Invalid Score!");


        }
        scanner.close();
            
        }
    
    //Question 3 - Number Sequence from 1 to 20 with conditions
    public static void numberSequence(){
        for ( int i = 1; i<=20; i++){
            if (i % 5 == 0){
                if (i % 2 == 0){
                    System.out.println(i + " -> Divisible by 5, Even Number");
                } else {
                    System.out.println(i + " -> Divisible by 5, Odd Number");
                }
            } else if (i % 2 == 0){
                System.out.println(i + " -> Even Number");
            } else {
                System.out.println(i + " -> Odd Number");
            }
        

        } 
    }
   
    //Question 4- input validation
    public static void inputValidation(){
        Scanner system = new Scanner (System.in);
        System.out.println("Enter a positive number: ");
        int number = system.nextInt();

        while (number <=0){
            System.out.println("Invalid input. Please enter a positive number: ");
            number = system.nextInt();
        }

    int factorial = 1;
    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }
    System.out.println(" The factorial of : " + number + " is: " + factorial);

         system.close(); // Close the scanner
    }
   
    //Question 5 -pattern printing
    public static void patternPrinting(){
        int rows = 5;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}
