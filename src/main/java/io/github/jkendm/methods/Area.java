package io.github.jkendm.methods;

//import java.math.MathContext;


public class Area {
    public static void main(String[] args) {
        
        //MathHelper.areaCalculate(10);// calling a method but it doesn't print the output 
       // MathHelper.areaCalculate(5);
        //System.out.println(MathHelper.areaCalculate(10));// printing the output
         System.out.println(areaCalculate(10));
        System.out.println(areaCalculate(5));

    }
  public static double areaCalculate( double radius){
        
        Math.pow(radius, 2); 
        double result = Math.PI*Math.pow(radius, 2);
        return result;

    }
   }

