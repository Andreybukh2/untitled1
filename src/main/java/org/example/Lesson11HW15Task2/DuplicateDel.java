package org.example.Lesson11HW15Task2;

import java.util.*;

class DuplicateDel {
    public static void main(String[] args) {
        List<String> DuplicateDel = new ArrayList<>(Arrays.asList("Привет", "сегодня", "отличная",
                "погода", "сегодня", "отличная", "Привет", "погода"));
        Set<String> set = new LinkedHashSet<>(DuplicateDel);
        List<String> listWithoutDuplicates = new ArrayList<>(set);
        System.out.println(listWithoutDuplicates);
    }
}
