package io.github.jkendm.assessment_joykendi;

public class Manager extends Employee {
    private String department;

    public Manager(String name, String id, double salary, String department){
        super(name,id,salary);
        this.department=department;

    }

    //override the calculate bonus
    @Override
     public void displayInfo(){
        System.out.println("Employee Name: " + getName() +" Id: "+ getId()+" $: "+getSalary()+ " - " +" Department: "+department);
    }
    public void calculateBonus( double bonus){
        if (bonus>0){
            double bonusAmount = getSalary() *bonus/100;
            System.out.println("15% of the salary is:" + bonusAmount);
        }
    }


    
}
