package io.github.jkendm.assessment_joykendi;

public class Main {
    public static void main(String[] args) {
        Book book = new Book ("Boundless","Joy Kendi", "1513151517892", 1000);
        book.setAvailable(true);
        book.displayInfo();
    }
    
}
