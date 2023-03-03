package org.example.Generics.Lesson10HomeWork14;

// Переменные Т-типа унаследованные от Number, это означание что при дальнейшей инициализации в процессе выполнения задачи
// они могут приобретать любую типизицию по иерархии Number -> Абстрактный класс Number является суперклассом для классов
// Byte, Double, Float, Integer, Long и Short.
// Далее getters and setters - стандартная защита прямого доступа пользователя к полям;
// Конструктор, который в своих параметрах имеет тип данных Т и название переменной;
public class MaxMin <T extends Number> {
    private T max;
    private T min;

    public T getMax() {
        return max;
    }
    public void setMax(T max) {
        this.max = max;
    }
    public T getMin() {
        return min;
    }
    public void setMin(T min) {
        this.min = min;
    }
    public MaxMin(T max, T min) {
        this.max = max;
        this.min = min;
    }
}
