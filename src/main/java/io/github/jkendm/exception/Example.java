package io.github.jkendm.exception;

public class Example {
    public static void main(String[] args) {
      //try and catch method
      try{
        //protected code
        int[] numbers= {1,2,3};
        System.out.println(numbers[5]);
      }

      catch(ArrayIndexOutOfBoundsException e){
        //exception handler
        System.out.println("Array index out of bounds!");
        System.out.println("Exception: " + e.getClass().getSimpleName());
        System.out.println("Message: " + e.getMessage());

      }

      System.out.println("Program continues.....");

    }
}
