package io.github.jkendm.assessment3_joykendi.problem1;

//defining the base class Library items
public abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    protected boolean isAvailable;

    //defining the constructors
    public LibraryItem(String itemId,String title, String author,boolean isAvailable){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
        this.isAvailable=false; //always be false by default
    }

   //defining an abstract method - different implementation for each subclass
   public abstract void displayDetails();

   //defining the concrete methods
   public void checkout(){
    if(isAvailable){
        isAvailable=false;
        System.out.println(title + " has been checked out");

    } else {
        System.out.println(title + "is not available");
    }
   }

   public void returnItem(){
    isAvailable=true;
    System.out.println(title + " has been returned.");
   }





    
}
