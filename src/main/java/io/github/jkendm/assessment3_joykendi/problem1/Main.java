package io.github.jkendm.assessment3_joykendi.problem1;

public class Main {
    //defining the objects
public static void main(String[] args) {
    LibraryItem book = new Book("001","Perfection","Joy Kendi",true," 978-0-306-40615-7","Motivational");
    LibraryItem dvd = new DVD("002","Rookie","Chuck Lorre",false,"120","PG 13");
    LibraryItem magazine = new Magazine("003","Parents","Daily Nation", true,"004","13-04-2025");


//polymorphic behavior

LibraryItem[] items = {book,dvd,magazine};

for (LibraryItem item :items){
   item.displayDetails();
   item.checkout();
   item.displayDetails();
   item.checkout();
   item.returnItem();
   System.out.println("-------------------------------");
}
}  
}
