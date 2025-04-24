package org.darshan.CollectionsPractise.CollectionFramework.PractiseProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class MarksOfSubject {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> subjectMarks = new HashMap<>();

        subjectMarks.put("Maths", new ArrayList<>());
        subjectMarks.get("Maths").add(89);
        subjectMarks.get("Maths").add(95);
        subjectMarks.get("Maths").add(56);

        subjectMarks.put("Science", new ArrayList<>());
        subjectMarks.get("Science").add(46);
        subjectMarks.get("Science").add(75);
        subjectMarks.get("Science").add(78);

        System.out.println(subjectMarks);

        subjectMarks.get("Maths").add(28);
        subjectMarks.get("Maths").remove(1);
        subjectMarks.get("Science").set(2, 97);

        System.out.println(subjectMarks);
    }
}
