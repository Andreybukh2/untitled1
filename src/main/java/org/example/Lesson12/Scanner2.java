package org.example.Lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// Теперь считаем данные из файла на локальном диске с помощью класса File.
// 1. 4 Создадим стандартный Сканнер;
// 2. 3 Создадим класс File;
// 3. 1 Создали переменную Str separator, которая получает из статической константы данные разделителя для операционных систем;
// 4. 2 Создали переменную для пути к файлу;
// 5. 5 Пемещаем путь в параметры объекта класса File
// 6. 6 Scanner(System.in) - передаем в поток переменную (file)
// 7. 7 Обработка ошибки если файл не будет найден; IO throws FileNotFoundException
// 8. 8 Считаем строку из нашего файла в переменную
// 9. 9 Создадим массив данных из этой строки по разделителю
//10.10 Вызываем у строки метод line.split() для работы по разделителю;
//11.11 Выводим результат через Arrays.toString(num) потому что напрямую массив нельзя вызвать
// В результате мы вывели наши данные которые были разделены 0, в массив и в консоль.

public class Scanner2 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "Andbu"
                + separator + "OneDrive" + separator + "Рабочий стол" + separator + "new2";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine(); // 8
        String [] num = line.split("0");
        System.out.println(Arrays.toString(num));
    }
}