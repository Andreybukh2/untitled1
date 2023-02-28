package org.example.HW14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxValue {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(45);
        list.add(55);
        list.add(37);
        list.add(18);
        
        System.out.println(getValue(list));
        System.out.println(getValue(Integer.MAX_VALUE));
        System.out.println(getValue(Integer.MIN_VALUE));
        // Понимаю что это выводит минимум и максимум не массива, а самого Integer.
    }
    public static <T> T getValue (T value) {
        // Тут нужно какое то условие на проверку вводимого типа данных и если NUMBER и наследники,
        // то какой то цикл который пройдет по всему list и найдет максимальное, а потом минимальное или отсортирует от
        // от меньшего к большему, и возьмет крайние значения, так даже менее затратно, потому что не бегать по всему массиву.
        // Но как это реализовать. я так и не понял. Сдул чужие методы с сортировкой, но интегрировать не получается.
        return value;
    }
    public static Integer Max (List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }
    public static Integer Min (List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(sortedlist.size() - 1);
    }
}
