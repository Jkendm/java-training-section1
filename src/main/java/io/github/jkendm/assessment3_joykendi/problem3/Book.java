package io.github.jkendm.assessment3_joykendi.problem3;

public class Book extends Product {
    private String author;
     private String publisher; 
     private String isbn;

    public Book(String productId, String name, double price, int stockQuantity, String author, String publisher, String isbn) throws InvalidProductException { 
        super(productId, name, price, stockQuantity); 
        this.author = author; 
        this.publisher = publisher;
         this.isbn = isbn;
         }
    
    @Override
     public double calculateDiscount() { 
        return price * 0.05; // 5% discount 
        } 

        @Override
         public String getProductType() { 
            return "Books"; 
        }
    
}
