package org.example.Lesson13;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// 1. Календарь для фиксации записей в файле с форматом из паттрена. Каждая новая запись - новая дата;
// 2. Создадим объект с помощью специального класса FileWriter который покажет кудазаписать и запишет данные;
// 3. Поместим это в блок try в конструктор FileWriter writer = new FileWriter (true\false - дополнять или перезаписать);
//    что-бы не мудрить с параметризацией пути до файла, работаю в приложении, поэтому можно не указывать путь;
// 4. Создали строковую переменную String text = "Сюда передаем свой текст для фала\n";
// 5. Поместили в метод writer.write(text) нашу строку с будующим потоком текста, символов из String text;
// 6. writer.flush(); - явная команда к записи, потому что иначе будет ожидание дальнейшей записи;
// 7. В блок catch поместим (IOException e) - потому что любой поток у нас отбрасыввает IOException;
// 8. В FileReader reader по аналогии передаем данные из файла и выводим в консоль.
// 9. По аналогии, но добавляем дополнительную обработку ошибки, потому что может быть не найден файл.
//    1. catch (FileNotFoundException e), 2. catch (FileNotFoundException e);
// 9. int c; - переменная;
//10. while ((c = reader.read()) != -1){ - бесконечно считываем символы и когда они кончатся, то завершим; Метод read
//    возвращает -1 когда кончаются символы;
//11. System.out.print((char) c); - вывод в консоль.

public class InputData {
    private static String updatedLine;

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//1
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE dd-MM-yyyy HH:mm:ss z Z ");
        try (FileWriter writer = new FileWriter("input" + ".txt", true)) {//2,3
            String text = " - Правка от user №04\n";//4
            //writer.write(text); // Заменил на строку ниже, потому что в документе нужно время изменения
            writer.write(updatedLine + "\n" + formatter.format(calendar.getTime()) + text);//5
            writer.flush(); //6

        } catch (IOException e) {//7
            throw new RuntimeException(e);
        }
        try (FileReader reader = new FileReader("input" + ".txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {//8
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}