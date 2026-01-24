package io.github.jkendm.assessment_joykendi;

public class Employee {
    private String name;
    private String id;
    private double salary;

    //defining the constructors with the parameters
    public Employee (String name, String id, double salary){
        setName(name);
        setId(id);
        setSalary(salary);

    }

    //defining the getter and the setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }
    
    //controlled access to Salary
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    //method that returns 5% of salary

    public void calculateBonus( double bonus){
        if (bonus>0){
            double bonusAmount = salary * bonus/100;
            System.out.println(" 5% of the salary is:" + bonusAmount);
        }
    }

    //Method to print info
    public void displayInfo(){
        System.out.println("Employee Name: " + name +" Id: "+id+ "$: " +salary );
    }



}
