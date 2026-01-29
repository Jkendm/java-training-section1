package io.github.jkendm.practice_exercise.javase011;

public class Manager extends Employee {
    //defining the fields
    private String department;

    //defining the constructors
    public Manager(String name, String id, double salary, String department){
        super(name, id, salary);
        this.department=department;

    }

    //the subclass are used to implement the subclass abstract method
    @Override
    public double calculateBonus(){
        return getSalary() * 0.15; //formula to calculate the salary
    }

    //implementing the displayInfo
    @Override
    public void displayInfo(){
         System.out.println("The account details for a manager ");
         System.out.println("Name: " + getName() );
         System.out.println("ID: " + getId() );
         System.out.println("Salary: " + getSalary());
         System.out.println("Department: " + this.department);
          System.out.println("15% bonus salary:" + calculateBonus());
          System.out.println();
    }

    
}
