package org.darshan.Observations.Observation2;

public class Main {
    static String name = "Darshan";
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(name);
            name = "vinay";
            System.out.println(name);
        };
        runnable.run();
    }
}
