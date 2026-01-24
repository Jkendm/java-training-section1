package io.github.jkendm.assessment_joykendi;

public class Developer extends Employee{
   
    private String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;

    }

    //override the calculate bonus
    @Override
     public void displayInfo(){
        System.out.println("Employee Name: " + getName() +" Id: "+ getId()+" $: "+getSalary()+ " - " +" programmingLanguage: "+programmingLanguage);
    }
    public void calculateBonus( double bonus){
        if (bonus>0){
            double bonusAmount = getSalary() *bonus/100;
            System.out.println("10% of the salary is:" + bonusAmount);
        }
    }


    
}

    

