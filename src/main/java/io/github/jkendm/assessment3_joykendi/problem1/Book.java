package io.github.jkendm.assessment3_joykendi.problem1;

public class Book extends LibraryItem {
    private String isbn;
    private String genre;

    //defining the constructors
    public Book(String itemId, String title, String author, boolean isAvailable, String isbn, String genre){
        super(itemId,title,author,isAvailable);
        this.isbn=isbn;
        this.genre=genre;
    }

    @Override
    public void displayDetails(){
        System.out.println("Book[ID: " + itemId + ", Title: " + title + ",Author: "+ author + ",ISBN: " + isbn + ",Genre: " + genre + ",Available: " + isAvailable + "]");
    }


    
}
