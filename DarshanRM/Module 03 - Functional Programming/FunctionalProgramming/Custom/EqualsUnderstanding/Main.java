package org.darshan.FunctionalProgramming.Custom.EqualsUnderstanding;

public class Main {
    public static void main(String[] args) {
        String name1 = new String("Darshan");
        String name2 = new String("Darshan");
        System.out.println("Equal to operator : " + (name1 == name2));
        System.out.println("Equals method : " + name1.equals(name2));
        System.out.println();

        // Object pool concept
        // Because both the string refer to the same object which is present in the object pool
        String name3 = "Harsh";
        String name4 = "Harsh";
        System.out.println("Equal to operator : " + (name3 == name4));
        System.out.println("Equals method : " + name3.equals(name4));
        System.out.println();

        name4 += " bye";
        System.out.println("Equal to operator : " + (name3 == name4));
        System.out.println("Equals method : " + name3.equals(name4));
    }
}
