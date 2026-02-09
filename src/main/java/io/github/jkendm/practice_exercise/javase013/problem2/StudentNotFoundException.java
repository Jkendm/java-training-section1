package io.github.jkendm.practice_exercise.javase013.problem2;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String name){
        super("Student not found: " + name);
    }
    
}
