package org.example.Lesson11HW15Task3;

public class SplitWords {
    public static void main(String args[]) {
        String str = "Привет";
        char[] strToArray = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        // Вывод массива на экран
        for(int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i] + " "); // Для наглядности вставим пробел между индексами
        }
    }
}