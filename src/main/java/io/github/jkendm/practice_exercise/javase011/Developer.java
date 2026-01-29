package io.github.jkendm.practice_exercise.javase011;

public class Developer extends Employee {
  
    //defining the fields
    private String programmingLanguage;

    //defining the constructors
    public Developer(String name, String id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;

    }

    //the subclass are used to implement the subclass abstract method
    @Override
    public double calculateBonus(){
        return getSalary() * 0.10; //formula to calculate the salary
    }

    //implementing the displayInfo
    @Override
    public void displayInfo(){
         System.out.println("The account details for the developer:");
         System.out.println("Name: " + getName() );
         System.out.println("ID: " + getId() );
         System.out.println("Salary: " + getSalary());
         System.out.println("Programming Language: " + this.programmingLanguage);
          System.out.println("10% bonus salary: " + calculateBonus());
          System.out.println();
    }

    
}

