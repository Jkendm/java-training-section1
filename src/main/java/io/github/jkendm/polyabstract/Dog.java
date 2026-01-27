package io.github.jkendm.polyabstract;

public class Dog extends Animal {

    //parent constructor- define a constructor
    public Dog(String name){
        super(name);
    }

   @Override //overriding for the base function
  public void makeSound(){
   System.out.println(super.name + " :says woof");
  }

    //when using the protected
   // public void makeSound(){
   //     System.out.println("A dog barks");
  //  }


  // @Override //overriding for the base function
   // public void makeSound(){
   //     System.out.println(super.name + "A dog barks");

   //this - refers to the current class, super- refers to the parent class
   //without the key word- the compiler first looks at the subclass then looks at the parent class

   //public void makeSound2(){
   // super.makeSound
  // }

   //public void makeSound2(){
   // this.makeSound
  // }

  
   //public void makeSound2(){
   // super.makeSound
  // }



   // @Override //overriding for the base function
  //  public void makeSound(){
  //      System.out.println("A dog barks");
 //   }
    
}
