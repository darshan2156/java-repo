package org.darshan.FunctionalProgramming.InBuilt.RunnableFunctionalInterfaceUsage;

public class ImportantObservation2 {
    public static void main(String[] args) {
        String name = "Darshan";
        Runnable runnable = () -> {
            // name = "Hello";
            // we can't have same variable name and also in lambda functions
            // because life cycle of "name" variable of this class is binded to this class and
            // it also has a scope inside the runnable interface
            System.out.println(name);
        };
        runnable.run();
    }
}
