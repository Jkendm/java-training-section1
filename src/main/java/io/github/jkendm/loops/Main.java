package io.github.jkendm.loops;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
           //forLoops();
           //whileLoops();
           //doWhileLoops();
           whileIf();
           /*  int countdown = 3;
           while (countdown > 0) {
               System.out.println("Countdown: " + countdown);
               countdown--;
           }
           System.out.println("Happy New Year!");

           int dice = 1;
           while (dice <= 6) {
            if (dice < 6) {
                 System.out.println("No Yatzy.");
                } else {
                     System.out.println("Yatzy!");
                    } dice = dice + 1;
                }
        int sum = 10;
        for (int i=0; i<5; i++){
            sum = sum + i; // sum+= i
        }
        System.out.println("Sum is: " + sum); 

    }*/
}
    public static void forLoops() {
        // ? for ( initial Expression;  Test Expression; Update Expression ) {
        for (int counter =1; counter <= 10; counter = counter +1) { // counter = counter +1 is to the expanded version so that we may skip some steps 
            System.out.println("I love  you mum and dad");
        }
        // you can also use assignment operators eg. counter +=2
        }
        
        static void  iLoveYouMumAndDad() {
            
        }
     // While loop - show something until a condition is met or time out   
    public static void whileLoops() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number to positive: ");
        int number = scanner.nextInt();

        while (number <=0) {
            System.out.println("Invalid input. Please enter a positive number: ");
            number = scanner.nextInt();
        }
    System.out.println("You entered a positive number: " + number);
}
 
// The while and If guessing game

public static void whileIf(){
    int guess = 0;
    int target = 42;
    Scanner scanner = new Scanner(System.in);

    while (guess!=target){
        System.out.println("Enter your guess: ");
        guess = scanner.nextInt();

        if (guess < target){
            System.out.println("Too low! Try again.");
        } else if (guess > target){
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Congratulations! You guessed the correct number.");
        }
    }
}


}

