public class Main {
    
    public static void main(String[] args) {
        int x = 10; // Local variable in main method
        System.out.println("Value of x in main: " + x);
        display();
    }

    public static void display() {
        // System.out.println("Value of x in display: " + x); // This will cause a compilation error
        int y = 20; // Local variable in display method
        System.out.println("Value of y in display: " + y);
    }
}
