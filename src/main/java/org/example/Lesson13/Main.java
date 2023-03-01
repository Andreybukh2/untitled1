package org.example.Lesson13;

import java.io.IOException;

// Рассмотрим основыные методы
// Прочитаем байты с клавиатуры. Мы берем какой-то стрим input в нашем случае, который беорет данные из нашей консоли,
// блокируется консоль
// System.in. - принимае входящий поток и имеет различные методы   ;
public class Main {
    public static void main(String[] args) throws IOException {
        byte[] info = new byte[12]; // массив из 12 символов
        System.out.print("Enter some text");
        System.in.read(info);
        char[] result = new char[12];
        for (int i = 0; i < info.length; i++){
            result[i] = (char)info[i];
            System.out.print(info[i]);
        }
        String res = new String(result);
        System.out.println(" You are enter " + res);
    }
}