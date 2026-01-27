package io.github.jkendm.polyabstract;

public class Cat extends Animal {
    //define a constructor
    public Cat (String name){
        super(name);
    }
      @Override
    public void makeSound(){
        System.out.println(super.name + " :says meows");
   }
}
