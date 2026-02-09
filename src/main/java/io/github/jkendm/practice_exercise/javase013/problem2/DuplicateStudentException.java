package io.github.jkendm.practice_exercise.javase013.problem2;

public class DuplicateStudentException extends Exception {
    public DuplicateStudentException (String name){
        super("DUplicate Student: " + name);
    }
    
}
