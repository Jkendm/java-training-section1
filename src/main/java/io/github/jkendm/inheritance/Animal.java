package io.github.jkendm.inheritance;

public class Animal {
    private String name;

      Animal (String name){ //defining a constructor
      this.name=name;
   }

   public String getName(){
      return this.name;
   }

    //protected access modifiers- can be used instead of  constructor, can be accessed via superclasses
   // protected String name;

    public void makeSound(){
        System.out.println("Animal make sound");
    }
    
}
