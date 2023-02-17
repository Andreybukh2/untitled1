package Lesson12;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи любое число");

        try {
            number = scanner.nextInt();
            System.out.println("Вы ввели число " + number);

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число! сработал catch");
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
        } finally {
            System.out.println("Программа завершилась по finally " +
                    "закрывает ресурсы необходимые к закрытию вне зависимости от наличия ошибки");
        }
    }
}