package io.github.jkendm.statickeyword;

public class StaticBlockDemo {
// Static block in the demo class
static {
System.out.println("StaticBlockDemo class loaded");
}
public static void main(String[] args) {
System.out.println("Main method started");
DatabaseConfig.displayConfig();
}
}