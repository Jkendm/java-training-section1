package io.github.jkendm.assessment3_joykendi.problem4;

public class EmployeeManagement{
// Making the company name public breaks the encapsulation- hence anyone can access it
    private static String companyName = "Buuri Agro-Chemicals";

//the instance fields 
    private String employeeName;
    private double salary;

    //defining the constructor
    //All the variables have to be declared 
    public EmployeeManagement(String employeeName,double salary) {
     this.employeeName=employeeName;
     setSalary(salary); //setters for validation
    }
    //Introducing the setters and getters
    //companyName
    public static String getCompanyName(){
      return companyName;
    }

    public static void setCompanyName(String companyName){
      EmployeeManagement.companyName=companyName;
    }

    //Employee Name
    public String getEmployeeName(){
      return employeeName;
    }

    //salary
    public double getSalary(){
      return salary;
    }

    public void setSalary(double salary){
      //the assigned value was invalid so a throw statement is better applicable
        if (salary < 0) {
        throw new IllegalArgumentException("Salary cannot be negative");
      }

      this.salary = salary; // the statement has no effect since salary was assigned to itself
    }

    //Bonus calculation - declared Void but had a return value
     public double calculateBonus() {
      return salary * 0.1;
    }

    //print details
    public void displayDetails() { 
      System.out.println("Company: " + companyName + ", Employee: " + employeeName + ", Salary: " + salary);
     }
  }
