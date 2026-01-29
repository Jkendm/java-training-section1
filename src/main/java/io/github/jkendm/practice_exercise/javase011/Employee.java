package io.github.jkendm.practice_exercise.javase011;

//an abstract method can only be defined inside an abstract class- there is an abstract method hence the class contain abstract

public abstract class Employee {
    //creating the fields
    private String name;
    private String id;
    private double salary;

    //defining a constructor
    public Employee(String name, String id, double salary){
        setName(name);
        setId(id);
        setSalary(salary);

    }

    //defining the getters and setters
    //Setter are used to set the name and getters are for fetching the name

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    
    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    
    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    //defining the abstract method- declared without a body
    public abstract double calculateBonus();

    //Concrete method- has an implementation body
    public void displayInfo(){
        System.out.println("The account details are as follows ");
         System.out.println("Name: " + getName() );
         System.out.println("ID: " + getId() );
         System.out.println("Salary: " + getSalary() );
         System.out.println();

    }

}
