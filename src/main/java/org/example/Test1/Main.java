package org.example.Test1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(-666);
        list.add(666);

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i: list) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
    }
}