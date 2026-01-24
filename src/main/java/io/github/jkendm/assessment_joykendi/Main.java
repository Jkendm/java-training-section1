package io.github.jkendm.assessment_joykendi;

public class Main {
    public static void main(String[] args) {

        //Question 1
        System.out.println("====================Question 1===============");
        Book book = new Book ("Boundless","Joy Kendi", "1513151517892", 1000);
        book.setAvailable(true);
        book.printInfo();

        //Question 2
        System.out.println("====================Question 2===============");
        Employee employee = new Employee("Joy Kendi", "3657432",15000);
        employee.displayInfo();
        employee.calculateBonus(5);
        

        Manager manager = new Manager("Ann Njeri", "34567890",15000, "ICT");
        manager.displayInfo();
        manager.calculateBonus(15);

        Developer developer = new Developer("Kendi", "12345678", 200000,"Python");
        developer.displayInfo();
        developer.calculateBonus(10);

        //Question 3
        
        Calculator calculator = new Calculator();
        System.out.println("====================Question 3===============");
        System.out.println(calculator.add(10,5));
        System.out.println(calculator.add(10.5,5.3));
        System.out.println(calculator.add(10,5,3));
        System.out.println(calculator.add("Joy", " Kendi"));

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(scientificCalculator.add(30,40));
        System.out.println(scientificCalculator.power(10, 5));
         System.out.println(scientificCalculator.squareRoot(100));




        
    }
    
}
