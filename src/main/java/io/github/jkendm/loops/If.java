package io.github.jkendm.loops;

import java.util.Scanner;

public class If {
    
    public static void main(String[] args) {
           // idRegistration();
           // Grading System
            //gradingSystem();
            switchSystem();

    }

    // >=80 A
    // >= 70 B
    // >= 60 C
    // >= 50 D
    // < 50 f

    private static void switchSystem() {
        
        String orderStatus = "Shipped";
       // switch (orderStatus) {
          //  case "Placed":
             //   System.out.println("Your order has been placed.");
         //       break;
           // case "In Progress":
              //  System.out.println("Your order is being processed.");
              //  break;
           // case "Shipped":
             //   System.out.println("Your order has been shipped.");
         //       break;
         //   case "Delivered":
           //     System.out.println("Your order has been delivered."); 
          //      break;
         //   default:
           //     System.out.println("Unknown order status.");
         //       break;          
      //  }
        
        switch (orderStatus){
            case "Placed"-> System.out.println("Your order is being processed.");
            case "In Progress" -> System.out.println("Your order is being processed.");
            case "Shipped" -> System.out.println("Your order has been shipped.");
            case "Delivered" -> System.out.println("Your order has been delivered.");
            default -> System.out.println("Unknown order status.");
        }
        } 


    
    
    private static void gradingSystem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Score: ");
        int score = scanner.nextInt();

        if (score >= 80) {
            System.out.println("You got and A ");
        } else if (score >= 70) {
            System.out.println("You got a B");
        } else if (score >= 60) {
            System.out.println("You got a C");
        } else if (score >= 50) {
            System.out.println("You got a D");
        } else {
            System.out.println("You got an E");
        }

        scanner.close();
    }

    private static void idRegistration() {
        Scanner scanner = new Scanner(System.in);

        final int QUALIFICATION_AGE =18;
        //ID registration
        System.out.print("Input your age: ");
        int age= scanner.nextInt();

        if (age >= QUALIFICATION_AGE) {
           
            System.out.print("Enter your name: ");
            String name = scanner.next();
            
            scanner.nextLine(); // clear the buffer
             System.out.print("Enter your location: ");
            String location = scanner.next();

            // proceed with registration
            System.out.println("You are now registered: " + name + " at " + location);

        } else {
            System.out.println("You are underage");
        }

       System.out.println(" After Registration Check");
        scanner.close();
    }
}
