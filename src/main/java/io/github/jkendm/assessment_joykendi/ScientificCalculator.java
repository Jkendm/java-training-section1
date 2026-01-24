package io.github.jkendm.assessment_joykendi;

public class ScientificCalculator extends Calculator{

    @Override
    public int add(int a, int b) {
    System.out.println("ScientificCalculator: Performing integer addition...");
     return super.add(a, b); // call parent method 

    }
     //New scientific methods
     
     public double power(double base, double exponent) { 
        return Math.pow(base, exponent); 
    }
         public double squareRoot(double num) {
             return Math.sqrt(num); 
            } 
        }


