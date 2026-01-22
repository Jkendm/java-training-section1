package io.github.jkendm.variablescope;

public class Car {
    //instance variables- we are not using static -> variables outside the method
    // For access- you have to create an object of the class
    //access with method inside the class
    //there is no actual data stored in the class
    //class- represent two different object

    // define the properties and behaviors
    //accessModifier(public, private- only within the instance) datType variableName
    public int regNo;
    public String model;
    public String color;

    //defining the constructors
    public Car( int regNo, String model ,String color){
        // this refers to the instance variable
        this.regNo=regNo;
        this.model=model;
        this.color=color;

    }
    

    public void displayInfo(){
        System.out.println(regNo + "-"+ model + "-" + color );
    }

    // method- they have no static
    public void startEngine(){
        System.out.println("Start the car" );
    }

    public void stopEngine(){
        System.out.println("stop the car");
    }

    }
