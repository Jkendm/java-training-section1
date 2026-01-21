package io.github.jkendm.methods;

public class Methods {
    public static void main(String[] args) {
       //Calling a method
        //myMethod("Liam" , 5);
        //myMethod("Joy" ,5);

        //If else statement
       // checkAge(20);

       //return a value, when it is not void
      
       //int z = returnValue(5, 3); //storing results in a variable
       //System.out.println(z);

       //recursion
       //int result = sum(10);
       //System.out.println(result);
       //printMessage("Hello Kendi", 5);

       //Returning multiple parameters
       printCarInfo("BMW", 2007, 1997.5, true);

       double total= calculateCost(250000.0, 2500.0, 3200.0);
       System.out.println( "The total cost: " +  total);
    


    }
    static void myMethod( String fname, int age){
        System.out.println("My name is " + fname + " and I am " + age + "years old");
    }

    static void checkAge(int age){
        if (age > 18){
            System.out.println("The above person is an adult");}
            else{
                System.out.println("The above person is a minor");
            }
        }

    static int returnValue(int x, int y){
        return x + y;
    }
        
    static int sum(int k){
        if (k > 0){
            return k + sum (k-1);
        } else{
            return 0;
        }
    }

public static void printMessage(String message, int times) {
  for (int i = 0; i < times; i++) {
         System.out.println(message);
              }
    }
     
    static void printCarInfo(String name, int year, double miles, boolean isGood){
        System.out.println("Name: "+ name);
         System.out.println("Year: "+ year);
          System.out.println("Miles traveled "+ miles);
           System.out.println("Good condition: "+ isGood);
    }

    static double calculateCost( double cost, double tax, double discount){
        return cost + tax - discount;
    }
}

