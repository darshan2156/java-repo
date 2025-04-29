package org.darshan.FunctionalProgramming.InBuilt.RunnableFunctionalInterfaceUsage;

class Demo implements Runnable {
    @Override
    public void run() {
        // scope of below "name" variable is only for this method
        String name = "Darshan";
        System.out.println(name);
    }
}

public class ImportantObservation3 {
    public static void main(String[] args) {
        String name = "Abhi"; // scope of this variable is only for this class
        System.out.println(name);

        Demo d = new Demo();
        d.run();
        // even after run() method has a variable called "name" it will not give the error
        // because that variable life scope is related to that "Demo" class and not to this calling class
    }
}
