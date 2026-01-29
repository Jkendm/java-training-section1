package io.github.jkendm.polyabstract;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
   
    }

    public int getAge(){
        return age;
    }

     @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }

public static void main(String[] args) {
    // When printing:
Student p = new Student("Joy Kendi", 23);
//without toString override - the output is not readable
// Output: Person@someHashCode- 
System.out.println(p); 



    
}

    
}
