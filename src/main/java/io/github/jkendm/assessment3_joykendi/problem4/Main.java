package io.github.jkendm.assessment3_joykendi.problem4;
//correct usage of the code

public class Main {
    public static void main(String[] args) {

        //creating the employee
    EmployeeManagement emp = new EmployeeManagement("Joy Kendi", 100000);

    //displaying details and bonus
    emp.displayDetails();
    System.out.println("Bonus: " + emp.calculateBonus());

    //trying invalid salary
    try {
         emp.setSalary(-1000);
         } catch (IllegalArgumentException e) { 
            System.out.println("Error: " + e.getMessage()); 
        }

    
    } 
}
