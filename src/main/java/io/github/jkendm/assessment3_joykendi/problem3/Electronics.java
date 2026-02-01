package io.github.jkendm.assessment3_joykendi.problem3;

public class Electronics extends Product { 
    private int warrantyPeriod; // in months 
    private int powerConsumption; // watts 

    //defining the constructors
    public Electronics(String productId, String name, double price, int stockQuantity, int warrantyPeriod, int powerConsumption) throws InvalidProductException { 
        super(productId, name, price, stockQuantity); 
        this.warrantyPeriod = warrantyPeriod;
         this.powerConsumption = powerConsumption;
         } 
         

         @Override 
         public double calculateDiscount() {
             return price * 0.10;} // 10% discount 

         @Override 
         public String getProductType() { 
            return "Electronics";
         }
        }