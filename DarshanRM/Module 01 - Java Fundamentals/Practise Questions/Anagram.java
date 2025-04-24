package org.darshan.Day2;

import java.util.Scanner;

public class Anagram {

    private static String anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "Not anagram";
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            count[c1 - 'a']++;
            count[c2 - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return "Not anagram";
            }
        }
        return "Anagram";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the string 2 : ");
        String str2 = sc.nextLine();

        System.out.println(str1 + " and " + str2 + " are " + anagram(str1, str2));
    }
}
