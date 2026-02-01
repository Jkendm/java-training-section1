package io.github.jkendm.assessment3_joykendi.problem1;

public class DVD extends LibraryItem {
     private String duration; //in minutes
    private String rating;

    //defining the constructors
    public DVD(String itemId, String title, String author, boolean isAvailable, String duration, String rating){
        super(itemId,title,author,isAvailable);
        this.duration=duration;
        this.rating=rating;
    }

    @Override
    public void displayDetails(){
        System.out.println("DVD[ID: " + itemId + ", Title: " + title + ",Author: "+ author + ",Duration " + duration + ",Rating: " + rating + ",Available: " + isAvailable + "]");
     }
    
}
