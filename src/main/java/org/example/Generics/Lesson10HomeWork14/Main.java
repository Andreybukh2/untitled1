package org.example.Generics.Lesson10HomeWork14;

import java.util.Arrays;

// 1. public static <T extends Number> MaxMin<T> fMaxMin(T[] mas) - статический метод (не имеет доступ и не нуждается в полях),
//    с параметром Т-типа наследуемого от Number по имени функции fMaxMin,
//    которая содержит в аргумента массив Т-типа по имени mas;
// 2. Публичные методы sort для сортировки массивов всех примитивных типов данных; sort
// 3. Методы Arrays API вызывают эти методы и пробрасывают в них ссылку на массив; (mas);
// 4. Если требуется отсортировать определенный диапазон массива,
//    то передаются еще и индексы начала и конца диапазона. Приватным полям T min = mas [0]; T max = mas[mas.length -1];
//    присвоили значение начала и конца массива.
// 5. MaxMin <T> maxMin = new MaxMin<>(max, min); - Создали объект MaxMin с параметрами из кронструктора
// 6. System.out.println("Максимальное - " + max + "\n" + "Минимальное - " + min); - консольный вывод
// 7. Возвращаемый не Void метод, поэтому return maxMin;
// 8. Integer [] mas = {5,6,2,3,8}; - производльный массив и вызов функции fMaxMin с параметрами в виде нашего массива (mas);

public class Main {
    public static <T extends Number> MaxMin<T> fMaxMin(T[] mas) {
        Arrays.sort(mas);
        T min = mas [0];
        T max = mas[mas.length -1];
        MaxMin <T> maxMin = new MaxMin<>(max, min);
        System.out.println("Максимальное - " + max + "\n" + "Минимальное - " + min);
        return maxMin;
    }
    public static void main(String[] args) {
//        List<Integer> mas = new ArrayList<>();
//        mas.add(1);
//        mas.add(56);
//        mas.add(76);
//        mas.add(99);

        Integer [] mas = {5,6,2,3,8};
        fMaxMin(mas);
    }
}