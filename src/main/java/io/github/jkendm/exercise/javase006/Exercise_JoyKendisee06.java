package io.github.jkendm.exercise.javase006;

/* For this particular code I referenced the following link to deal with array
https://www.w3schools.com/java/java_howto_find_smallest_array_el.asp
https://www.w3schools.com/java/java_howto_largest_el_array.asp
 */

public class Exercise_JoyKendisee06 {
    public static void main(String[] args) {
        // Takes an array of grades and prints the average
        double[] grades = {80,99,55,40,30};

        //printed Formatted report 
        printGradeReport("Joy Kendi", grades);

        // Looking for the average
      double average = calculateAverage(grades);
       System.out.println("The average grade: " + average );

       // get grade score - pass the average through the methods and then sort to look for the grade
        char gradeScore = getGradeScore(average);
        System.out.println("The Score is  " + gradeScore);

        // Looking for the lowest grade
        double lowest = lowestGrade(grades);
        System.out.println("Lowest Grade " + lowest);

        // looking for the highest grade
         double highest = highestGrade(grades);
        System.out.println("Highest Grade " + highest);

    }

    public static void printGradeReport(String name, double[] grades){
        System.out.println("========Students Final Report Card=========");
        System.out.println("Student:" + name);
        System.out.println("Grades: "); 
         for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);

        // Print comma except after last grade
         if (i < grades.length - 1) {
            System.out.print(", ");
        }
    }
        System.out.println(); //prints an empty line to divide code
}

    public static double calculateAverage(double [] grades){
        double sum = 0;
        
        for (double g:grades){ // loops through the elements of array
            sum += g;
         }
         return sum/grades.length; //grades.length -> gets the length of the array , getting the average is calculating the sum/average

    }

    public static char getGradeScore(double score){
        // using the if else statement to map the average grade to the score
        if (score >= 80){
            return 'A'; 
        }else if (score >= 70){
            return 'B';
        }else if( score >= 60){
            return 'C';
        }else if(score >= 50){
            return 'D';
        } else {
            return 'E';
        }
    }

    public static double lowestGrade(double [] grades){
        double lowestScore = grades [0];
        for ( double g:grades){
            if (lowestScore > g){
                lowestScore=g;
            }
        }
        return lowestScore;

    }

    public static double highestGrade(double [] grades){
        double highestScore = grades [0];
        for ( double g:grades){
            if (g > highestScore){
                highestScore=g;
            }
        }
        return highestScore;

    }
}