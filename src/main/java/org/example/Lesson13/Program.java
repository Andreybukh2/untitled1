package org.example.Lesson13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileName = scanner.nextLine();
        System.out.println("Введите данные в файл: ");
        String content = scanner.nextLine();
        save(fileName, content);
    }
    private static void save(String fileName, String content) throws IOException {
        Files.write(Paths.get(fileName), content.getBytes());
    }
}