package io.github.jkendm.assessment_joykendi;

public class Book {
    //private- encapsulation
    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean available;

    //defining a constructor, doesn't have static
    public Book(String title, String author, String isbn, double price){
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
    }

    //Defining the getter and setter
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        if(title != null && !title.trim().isEmpty()){
             this.title=title;

        }else{
        throw new RuntimeException("Book title cannot be null or empty");
    }
    }
     public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        if(author != null && !author.trim().isEmpty()){
             this.author=author;
          }else{
        throw new IllegalArgumentException("Book author cannot be null or empty");}
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        if(isbn.matches("\\d{13}")){
            this.isbn=isbn;
        } else {
            System.out.println("Error: The isbn has to be 13 digits");
        }
    }
       public double getPrice(){
        return price;
       }

       public void setPrice( double price){
        if (price > 0){
            this.price=price;
        } else{
            System.out.println("The price cannot be negative");
        }
       }

       public void setAvailable(boolean available){
        this.available=available;
       }

       public boolean isAvailable(){
        return this.available;
       }

       public void printInfo(){
        System.out.println("The book is titled: " + title + " and written by: " + author + " at $-" + price + "-isbn-" + isbn + "available: " + available );
       }
    } 



    

