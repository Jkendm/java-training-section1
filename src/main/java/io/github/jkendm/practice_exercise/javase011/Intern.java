package io.github.jkendm.practice_exercise.javase011;

public class Intern extends Employee {
       //defining the fields
    private String university;

    //defining the constructors
    public Intern (String name, String id, double salary, String university){
        super(name, id, salary);
        this.university=university;

    }

    //the subclass are used to implement the subclass abstract method
    @Override
    public double calculateBonus(){
        //declaring a constant value 
        final double  MAX_BONUS=500;
        return MAX_BONUS; //has a fixed bonus of 500
    }

    //implementing the displayInfo
    @Override
    public void displayInfo(){
         System.out.println("The account details for a intern ");
         System.out.println("Name: " + getName() );
         System.out.println("ID: " + getId() );
         System.out.println("Salary: " + getSalary());
         System.out.println("Department: " + this.university);
          System.out.println(calculateBonus()+ "$ bonus salary:" );
          System.out.println();
    }


    
}
