package io.github.jkendm.assignment;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        multiplicationTable();
        
    }
    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
    
}
