package io.github.jkendm.practice_exercise.javase013.problem2;

public class InvalidGradeException extends Exception {
    public InvalidGradeException(int grade){
        super("Invalid Grade: " + grade + " The grade must be between 0 and 100.");
}
    
}
