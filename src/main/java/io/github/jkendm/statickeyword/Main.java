package io.github.jkendm.statickeyword;

public class Main {
    public static void main(String[] args) {

    System.out.println(Employee.COMPANY_NAME);
    System.out.println(Employee.getEmployeeCount()  );
    Employee joyKendi = new Employee ("Joy Kendi", 38);
    Employee wesMut = new Employee ("WesMut", 42);
    Employee paul = new Employee ("Paul", 90);

    System.out.println(joyKendi.getEmployeeCount());
    System.out.println(joyKendi.getId());//you can't make reference to a static keyword if the method isn't static

    System.out.println(Math.pow(10, 2)); //make use of static reference
    }

    
    
}
