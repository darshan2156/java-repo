package org.darshan;

public class Program02 {
    public static void main(String[] args) {
        int num1 = 8, num2 = 5;

        // 1. Unary Operator -> ++, --, !, ~
        System.out.println("Unary Operator");
        System.out.println(num1 + " " + num2);
        num1++;
        num2--;
        System.out.println(num1 + " " + num2);
        System.out.println(num1 + " != " + num2 + " -> " + !(num1 == num2));
        System.out.println("~" + num2 + " = " + (~num2) + "\n");


        // 2. Arithmetic Operator -> +, -, *, /, %
        System.out.println("Arithmetic Operator");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2) + "\n");


        // 3. Assignment Operator -> +=, -=, *=, /=, >>=, <<=
        System.out.println("Assignment Operator");
        num1 += 2;
        System.out.println("num1 " + num1);
        num1 -= 2;
        System.out.println("num1 " + num1);
        num1 *= 2;
        System.out.println("num1 " + num1);
        num1 /= 2;
        System.out.println("num1 " + num1);
        num1 %= 2;
        System.out.println("num1 " + num1 + "\n");


        // 4. Logical Operator -> &&, ||
        System.out.println("Logical Operator");
        Boolean isComingClg = true, isAttendingClass = true;
        if(isComingClg && isAttendingClass) {
            System.out.println("Good Student");
        }
        if (isAttendingClass || isComingClg) {
            System.out.println("He is outside the home" + "\n");
        }


        // 5. Bitwise Operator -> &, |, ^, >>, <<
        System.out.println("Bitwise Operator");
        System.out.println(num1 + " & " + num2 + " = " + (num1&num2));
        System.out.println(num1 + " | " + num2 + " = " + (num1|num2));
        System.out.println(num1 + " ^ " + num2 + " = " + (num1^num2));
        System.out.println(num1 + " << 2 = " + (num1<<2));
        System.out.println(num2 + " >> 2 = " + (num2>>2) + "\n");


        // 6. Relational Operator -> ==, !=, >=, >, <=, <
        System.out.println("Relational Operator");
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 > num2 : " + (num1 > num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));
        System.out.println("num1 < num2 : " + (num1 < num2) + "\n");

        // 7. Ternary Operator -> ?:
        System.out.println("Ternary Operator");
        System.out.println((num1 > num2)?"num1 greater than num2":"num1 lesser than num2");
    }
}
