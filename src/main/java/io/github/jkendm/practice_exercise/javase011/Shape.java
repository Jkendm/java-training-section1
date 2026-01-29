package io.github.jkendm.practice_exercise.javase011;

//abstract class has the keyword abstract
public abstract class Shape {
    //create the variables 
    protected String color; 
    protected boolean filled; 
    
    //defining a constructor 
    public Shape(String color, boolean filled){ this.color=color; this.filled=filled; } 
    
    //defining an abstract class- meaning it can be overridden and they are not meant to be implemented 
    //They have no body
    public abstract double getArea(); 
    public abstract double getPerimeter(); 

    //concrete method - the subclass can either inherit or override, provides no body of implementation
    @Override public String toString(){ 
        return "Shape[color=" + color + ", filled=" + filled + "]";
     }
    
}
