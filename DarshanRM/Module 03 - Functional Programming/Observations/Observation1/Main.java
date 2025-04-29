package org.darshan.Observations.Observation1;

public class Main {
    public static void main(String[] args) {
        Demo A1 = new Demo();
        Demo A2 = A1;
        System.out.println(A1 == A2);
        System.out.println(A1.equals(A2));
        System.out.println();

        Demo A3 = new Demo();
        Demo A4 = new Demo();
        System.out.println(A3 == A4);
        System.out.println(A3.equals(A4));
    }
}
