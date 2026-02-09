package io.github.jkendm.arrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
private static String s; // access modifiers public and private are only in class level methods, not inside a method

    public static void main(String[] args) {
        setS("Hello Joy");
        System.out.println(getS());

        //length() -returns the number of characters in  a string
        String string = "animals";
        System.out.println(string.length());

        //charAt() - you query the string to find out what character is at specific index
       // System.out.println(string.charAt(7)); //throws an exception
        System.out.println(string.charAt(0));

        //indexOf doesn't return an exception if it doesn't get the character
        System.out.println(string.indexOf('a')); //o
        System.out.println(string.indexOf("al")); //looks for  a more specific one
        System.out.println(string.indexOf('a',4)); //Java should look from index 4
        System.out.println(string.indexOf("al", 5)); //return an error

        //substring- returns a part of the string
        System.out.println(string.substring(3));  // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals

        //toLowerCase() - converts from the uppercase to lowercase
        //toUpperCase() -converts from lowercase to uppercase
        System.out.println(string.toUpperCase());
        System.out.println("KENDI".toLowerCase());

        //equals() and equalsIgnoreCase()
        System.out.println("abc".equals("ABC"));
        System.out.println("abc".equals("abc"));
        System.out.println("abc".equalsIgnoreCase("ABC")); // the method ignores the case

        //startsWith() and endsWith() - this checks if the value matches the part of string
        System.out.println("abc".startsWith("a"));
        System.out.println("abc".startsWith("A"));
        System.out.println("abc".endsWith("c"));

        //contains()- look for matches in the string
        System.out.println("abc".contains("b"));

        //replace()- search and replace
        System.out.println("abc".replace("a","A"));

        //trim- removes the whitespace
        System.out.println(" abc ".trim());
        System.out.println("\t a b c \n".trim());

        //method chaining
        String start ="AniMal  ";
        String trimmed = start.trim();
        String lowercase= trimmed.toLowerCase();
        String result= lowercase.replace('a','A');
        System.out.println(result);

        //the above code can be reduced to 
        String result1="AniMal  ".trim().toLowerCase().replace('a','A');
        System.out.println(result1);

        //StringBuilder
       /*  String alpha = "";
        for(char current = 'a';current <= 'z';current++){
            alpha += current;
            System.out.println(alpha);*/
        
        StringBuilder alpha = new StringBuilder();
        for (char current = 'a';current <= 'z';current++){
            alpha.append(current);
            System.out.println(alpha);
        }    
        
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(three);
         System.out.println(one);
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        //difference btn == and equals()
        String x ="Hello World";
        String z = " Hello World".trim();//stores it as a new object
        System.out.println(z);
        System.out.println(x==z);
        System.out.println(x.equals(z)); //compares the content

        //creating an array
         String [] bugs = { "cricket", "beetle", "ladybug" };
         String [] alias = bugs;
         System.out.println(bugs.equals(alias));     // true
         System.out.println(bugs.toString());

         //Arrays
          int[] numbers = new int[10];
          for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }
        System.out.println(LocalDateTime.now()); //contains date and time , used T to separate date and time
        System.out.println(LocalDate.now());//contains date
        System.out.println(LocalTime.now()); //contains time, Hours, minutes,seconds and nanoseconds
        
        String s="purr";
        s.toUpperCase();
        s.trim();
        s.substring(1,3);
        s += " two";
        System.out.println(s.length());

        String roar1="roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Main().roar(roar1,roar2);
        System.out.println(roar1 + " " + roar2);

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);


    }
    
        //cannot nest methods inside a method-declared in the class level
        public static void setS(String newS){
            s=newS;
        }

        public static String getS(){
            return s;
        }

        //Strings are mutable- they cannot change unless you use setters
       

        public void roar(String roar1, StringBuilder roar2){
            roar1.concat("!!!");
            roar2.append("!!!");
        }
}
