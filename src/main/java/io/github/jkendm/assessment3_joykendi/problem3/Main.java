package io.github.jkendm.assessment3_joykendi.problem3;
/**
* Assessment 3: Mid-Term Practical Test
* Student: Joy Kendi
* Date: 02-01-2026
* Problem: Problem 3
* 
* Key Features:
* - Encapsulation
*- Abstraction
* - Checked and unchecked exception: 
1.OutOfStockException
2.InvalidProductException
*/

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        try { 
            // Valid products 
            Product laptop = new Electronics("E001", "Laptop", 1200.00, 10, 24, 65);
            Product shirt = new Clothing("C001", "T-Shirt", 29.99, 5, "M", "Cotton", "Blue"); 
            Product book = new Book("B001", "Java Programming", 49.99, 3, "Joy Kendi", "TechPress", "ISBN12345");

             manager.addProduct(laptop);
             manager.addProduct(shirt); 
             manager.addProduct(book); 
             manager.displayInventory();

             // Discount and tax demo
              System.out.println("Laptop discount: $" + laptop.calculateDiscount()); 
              System.out.println("Shirt after tax: $" + shirt.applyTax(0.16));
              
             // Stock reduction demo 
             shirt.reduceStock(2); // valid 
             shirt.reduceStock(10); // triggers OutOfStockException

        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 

        try {
             // Invalid product (negative price) 
             Product badLaptop = new Electronics("E002", "Laptop", -999.99, 10, 12, 50); 
             manager.addProduct(badLaptop); 
            } 
        catch (InvalidProductException e) { 
            System.out.println("Exception caught: " + e.getMessage());
         } 
        }
    }
