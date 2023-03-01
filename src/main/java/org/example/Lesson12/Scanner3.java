package org.example.Lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// Теперь считаем данные из файла на локальном диске с помощью класса File.
// 1. 2 Создадим стандартный Сканнер;
// 2. 1 Создадим класс File;
// 3. 3 В праметры кладем имя файла и татк как он в проекте, то можно не прописывать путь
// 4. 4 Scanner(System.in) - передаем в поток переменную (file)
// 5. 5 Обработка ошибки если файл не будет найден; IO throws FileNotFoundException
// 6. 6 Считаем строку из нашего файла в переменную

public class Scanner3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("new1");
        Scanner scanner = new Scanner(file);
        String field = scanner.nextLine();
        System.out.println(field);
    }
}