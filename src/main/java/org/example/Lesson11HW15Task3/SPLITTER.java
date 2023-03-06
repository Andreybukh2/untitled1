package org.example.Lesson11HW15Task3;

import java.util.*;
class SPLITTER {
    public static void main(String[] args) {
        String userWord = "Превосходный день";
        char[] chars = userWord.toCharArray();
//            System.out.print(chars[i]);
        for (int i = 0; i < userWord.length(); i++) {
            HashMap<Integer, Character> hashMap = new HashMap<Integer, Character>();
            hashMap.put(i, chars[i]);
            System.out.println(hashMap);
        }
    }
}