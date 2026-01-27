package io.github.jkendm.polyabstract;

public class MathOperations {
// Version 1: Two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }
    // Version 2: Three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }
    // Version 3: Two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }
    // Version 4: Array of integers
    public int add(int[] numbers) {
        System.out.println("Adding array of integers");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum; 
    }

    //Version 5: Using Varargs
    public int add(int a, int b, int...numbers){
         System.out.println("Adding array of numbers");
         int sum = a+b;
         for (int num:numbers){
            sum += num;
         }

         return sum;
    }
    
}
