package org.example.Lesson12;
import java.util.InputMismatchException;
import java.util.Scanner;
// В агоритм заложена следующая логика:
// Через класс Scanner с параметром входящий поток (System.in) получаем данные из консоли от двух переменных;
// Блок-связка try-catch будет обрабатывать ошибку нечислового ввода из консоли
// throw будет обрабатывать неопределенный логикой арифметический символ. При попытке ввести отличный от логики символ,
// будет срабатывать ошибка.
// Про символ который реализован через метод charAt() поясню отдельно, поскольку с сдул эту схему из чужого кода и
// просто хочу показать что разобрал это тему. charAt() работает с массивом, и как любой массив начинается с 0, поэтому в аргумент
// я ставлю 0 и это означает что в консоли нужно будет ввести ввести 1-символ, но если поставить charAt(1),
// то массив станет равен 2 символам и если предположить что эта глупость нужна, то можно так оставить и просто ввести
// в консоли два символа подряд (++, --, **, //), арифметика сработает.
// Соотетственно итд можно ставить любой индекс; У сканера нетвозможности сразу выбрать scanner.nextchar(). поэтому ставим
// костыль scanner.next().charAt(Индекс массива - ну и сам индекс int-овый)
// charAt фильтрует нежелательные типы данных и ограничивает ввод только типом данных char.
// Поскольку charAt возвращает выходные данные только в виде значения char, он преобразует любой тип данных в тип char
// Так же применил блок finally;
public class Calc {
    public static void main(String[] args) {
        double num1, num2, result;
        char arithmeticOperator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите аргументы через пробел");
        try {
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.print("Арифметическое действие (+, -, *, /): ");
            arithmeticOperator = scanner.next().charAt(0);

            switch (arithmeticOperator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
//            default:  System.out.printf("Error! Enter correct operator");
//                return;
                default:
                    throw new IllegalStateException("Введенный оператор " + arithmeticOperator + "не зарезервирован");
            }
            System.out.println("Результат :");
            System.out.println(num1 + " " + arithmeticOperator + " " + num2 + " = " + result + "\n");

        } catch (InputMismatchException e) {
            System.out.println("Отработал блок catch и перехватил ошибку InputMismatchException");
        } finally {
            System.out.println("Отработал блок finally");
        }
    }
}