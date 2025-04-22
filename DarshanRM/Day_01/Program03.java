package org.darshan;

public class Program03 {

    private static void printDays() {
        int day = (int)(Math.random() * 7 + 1);
        System.out.println("Random day : " + day);
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Other days");
        }
    }

    public static void main(String[] args) {
        System.out.println("Control Statements");

        int age = 89;

        // 1. Conditional Statements -> if, if-else, switch
        System.out.println("Conditional Statements");

        // if, if-else statements
        if (age < 18) {
            System.out.println("Minor");
        } else if (age <= 60) {
            System.out.println("Major");
        } else {
            System.out.println("Senior Citizen");
        }

        // switch statements
        printDays();

        // 2. Loops -> for, while, do-while, enhanced for
        // 3. Branching Statements -> break, continue, return
        System.out.println("Loops");

        // for loop + continue
        System.out.println("For Loop");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Skipping loop at i = " + i);
                continue;
            }
            System.out.println("i = " + i);

        }

        // while loop + break
        System.out.println("while Loop");
        int i = 0;
        while (i < 5){
            if (i == 3) {
                System.out.println("Breaking loop at i = " + i);
                break;
            }
            System.out.println("i = " + i);
            i++;
        }

        // do-while loop
        System.out.println("do while Loop");
        i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        // enhanced for loop
        System.out.println("Enhanced for Loop");
        int[] nums = {4, 5, 9, 6};
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
