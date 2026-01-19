package io.github.jkendm.variables;

public class StringExample {
    public static void main(String[] args) {
        String a= "Hello ";
        String b = "World ";
        String c = "Joy.";
        String result = a.concat(b).concat(c);

        System.out.println(result);

        String firstName ="Joy ";
        String lastName="Kendi";

        String fullName= firstName.concat(lastName);
        System.out.println(fullName);

        //Special characters
        String quote= "He said, \"Java is fun!\""; // Using escape sequences for double quotes
        String singleQuote= "It's a beautiful day!"; // Using single quote directly
        String newLineExample= "Hello\nWorld"; // New line
        String tabExample= "Hello\tWorld"; // Tab space

        System.out.println(quote);
        System.out.println(singleQuote);
        System.out.println(newLineExample);
        System.out.println(tabExample);  


    }
}
