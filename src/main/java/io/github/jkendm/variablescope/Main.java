package io.github.jkendm.variablescope;

//import java.lang.System.Logger;
// Variable Scope- defining the methods in a scope

public class Main {

    public static String config = "home/user/bin";
    //private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        //System.out.println("config = " + config);
       // logger.info("config = " + config);
        printVariable();
    }

    public static void printVariable(){
        System.out.println("config = " + config);
        int a = 20;
        System.out.println(" a = " + a);
    }

    public void carInfo(){
        Car car = new Car(); // creating an object
        //create an object before accessing using the dot notation
        car.id=11;
        car.model="Benz";
        car.color="Gold";

    }
    
}
