package io.github.jkendm.assessment3_joykendi.problem3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    // Constructor with validation
    public Product(String productId, String name, double price, int stockQuantity) 
            throws InvalidProductException {
        if (productId == null || productId.isEmpty()) {
            throw new InvalidProductException("Product ID cannot be empty.");
        }
        if (name == null || name.isEmpty()) {
            throw new InvalidProductException("Product name cannot be empty.");
        }
        if (price <= 0) {
            throw new InvalidProductException("Price must be positive.");
        }
        if (stockQuantity < 0) {
            throw new InvalidProductException("Stock quantity cannot be negative.");
        }

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Abstract methods -declared with no body
    public abstract double calculateDiscount();
    public abstract String getProductType();

    // Concrete methods
    public double applyTax(double taxRate) {
        return price + (price * taxRate);
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stockQuantity);
        System.out.println("Type: " + getProductType());
    }

    // Reduce stock with exception handling
    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity > stockQuantity) {
            throw new OutOfStockException("Not enough stock available.");
        }
        stockQuantity -= quantity;
        System.out.println("Stock reduced. Remaining: " + stockQuantity);
    }
}
