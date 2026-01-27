package io.github.jkendm.polyabstract;

public class Main {
    
    public static void main(String[] args) {
        //regular object references
      //  Dog dog = new Dog("Bosco");
       
       // Cat cat = new Cat("Kitty");
       
        //Animal animal = new Animal ("Some Random ANimal");

       // dog.makeSound();
       // cat.makeSound();
       // animal.makeSound();

       //polymorphic references
      // Animal dog = new Dog("Fluffy");
       //Animal cat = new Cat("Rex");

       //Main app = new Main();
      // app.printInfo(dog);
      // app.printInfo(cat);
   // }
  //  public void printInfo(Animal animal){
    //    animal.makeSound(); //runtime function invoking
   // }

    MathOperations math = new MathOperations();

    System.out.println(math.add(10,50));
    System.out.println(math.add(10,20,30));
    System.out.println(math.add(10.5,9.5));
    System.out.println(math.add(10, 5,7,8,9,4));
    System.out.println(math.add(new int[]{1,2,3,4,5,50,90,80}));
   
}
}