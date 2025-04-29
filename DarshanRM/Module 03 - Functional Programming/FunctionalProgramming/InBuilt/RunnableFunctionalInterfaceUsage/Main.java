package org.darshan.FunctionalProgramming.InBuilt.RunnableFunctionalInterfaceUsage;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // if we don't call "join" method then parent thread will not wait for child threads to complete their execution
        // Barrier Synchronization
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Execution finished!..");
    }
}
