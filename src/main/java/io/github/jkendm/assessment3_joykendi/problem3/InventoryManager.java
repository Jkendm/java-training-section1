package io.github.jkendm.assessment3_joykendi.problem3;
import java.util.*;

public class InventoryManager { 
    private Map<String, Product> inventory = new HashMap<>();

     public void addProduct(Product product) {
         inventory.put(product.productId, product);
          System.out.println(product.getProductType() + " added to inventory."); 
        } 

    public void removeProduct(String productId) {
         if (inventory.containsKey(productId)) { 
            inventory.remove(productId); 
            System.out.println("Product " + productId + " removed.");
         } else { 
            System.out.println("Product not found.");
         }
         }
        public Product getProduct(String productId) { 
            return inventory.get(productId);
         } 
        public void displayInventory() { 
            System.out.println("\n--- Inventory ---"); 
            for (Product p : inventory.values()) {
                 p.displayProductInfo(); System.out.println("-----------------"); 
                } 
            } 
        }