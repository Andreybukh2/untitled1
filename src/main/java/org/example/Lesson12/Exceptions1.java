package org.example.Lesson12;

import java.util.Arrays;
import java.util.Scanner;
// NumberFormatException ошибка которая показывавет что ввели не число
// Для обработки есть блок try, catch, finally
// Если ошибка происходит в try, то обработка будет в catch
// NumberFormatException обработает и наследников IllegalArgumentException или RuntimeException
// Мы можем получить пояснение про ошибку из getMessage;
// System.out.println(Arrays.toString(e.getStackTrace() - трассировка;
// finally - всегда отработает независимо от наличия ошибки. Необходим для закрытия файла, потока.
//
public class Exceptions1 {
    public static void main(String[] args) {
        int number; //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число!");
        try { // 2
            System.out.println("Отработал блок try и в нем происходит отлов ошибки");
            String s = scanner.next();
            number = Integer.valueOf(s);
            System.out.println("Вы ввели число " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("Отработал блок catch и вывел нам данные об ошибке например");
//            System.out.println(e.getMessage());
//            System.out.println(Arrays.toString(e.getStackTrace());
        } finally {
            System.out.println("Отработал блок finally");
        }
    }
}