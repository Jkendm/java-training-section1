package io.github.jkendm.inheritance;

public class Dog extends Animal {

    //parent constructor- define a constructor

    public Dog (String name){
        super(name);//check the parent constructor and submit name
    }

    public void makeSound(){
        System.out.println("A dog barks");
    }
    
}
