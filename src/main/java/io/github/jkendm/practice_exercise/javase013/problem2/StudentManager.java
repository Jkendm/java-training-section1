package io.github.jkendm.practice_exercise.javase013.problem2;

import java.util.HashSet;
import java.util.Set;

public class StudentManager {
    //defining an array of message
    static Set<String> names = new HashSet<>(Set.of("John" , "Lucy", "Kendi","Steve","Lewis"));
    public static void main(String[] args) {
        addStudent("Kendi","0012","Engineering");
        findStudent();
        setGrade();

    }
    private static void addStudent(String name, String regNo, String course)throws DuplicateStudentException {
        if(names.contains(name)){
        throw new DuplicateStudentException(name);}
        names.put(name, null);
    }

   
    
}
