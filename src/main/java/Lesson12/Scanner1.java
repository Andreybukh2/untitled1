package Lesson12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Теперь считаем данные из файла на локальном диске с помощью класса File.
// 1. 4 Создадим стандартный Сканнер;
// 2. 3 Создадим класс File;
// 3. 1 Создали переменную Str separator, которая получает из статической константы данные разделителя для операционных систем;
// 4. 2 Создали переменную для пути к файлу;
// 5. 5 Пемещаем путь в параметры объекта класса File
// 6. 6 Scanner(System.in) - передаем в поток переменную (file)
// 7. 7 Обработка ошибки если файл не будет найден; IO throws FileNotFoundException
// 8. 8 Цикл while (scanner.hasNextLine() будет считывать строки. true - если есть строки которые не считали, иначе false;
// 9. 9 Метод close закрывает поток и экономит ресурсы
public class Scanner1 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "Andbu" + separator + "OneDrive" + separator +
                "Рабочий стол" + separator + "new1";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}