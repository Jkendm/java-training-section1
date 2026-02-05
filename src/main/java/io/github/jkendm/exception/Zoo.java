package io.github.jkendm.exception;

public class Zoo {
    public static void main(String[] args) {
        try{
        System.out.println(args[0]);
        System.out.println(args[1]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of index" + e.getMessage());
        }
    } 
}
