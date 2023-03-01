package org.example.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(73);
        list.add(56);
        list.add(76);
        list.add(99);

        int max = list.get(0);

        System.out.println("Минимальный элемент " + Collections.min(list));
        System.out.println("Максимальный элемент " + Collections.max(list));
    }
}