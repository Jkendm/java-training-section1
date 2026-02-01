package io.github.jkendm.assessment3_joykendi.problem1;

public class Magazine extends LibraryItem {
    private String issueNumber;
    private String publicationDate;

    //defining the constructors
    public Magazine(String itemId, String title, String author, boolean isAvailable, String issueNumber, String publicationDate){
        super(itemId,title,author,isAvailable);
        this.issueNumber=issueNumber;
        this.publicationDate=publicationDate;
    }

    @Override
    public void displayDetails(){
        System.out.println("Magazine[ID: " + itemId + ", Title: " + title + ",Author: "+ author + ",IssueNumber: " + issueNumber + ",Publication Date: " + publicationDate + ",Available: " + isAvailable + "]");
        
    }

    
}
