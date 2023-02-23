package org.example.Lesson_14;
// У класса могут быть данные (поля) и действия (методы)
public class Objects {
    // Урок 14.
// 1. Создали поля (переменные);
// 2. Создали объект и присвоили объекту значение переменным, вывели через sout эти значения;
// System.out.println("My name is " + P1.name + " and " + "i am " + P1.age + " year old");
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roma";
        person1.age = 54;
        System.out.println("My name is " + person1.name + " and " + "im " + person1.age + " year old");

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 43;
        System.out.println("My name is " + person2.name + " and " + "im " + person2.age + " year old");

// Урок 15.
// 3. Добавили метод sayHello() и introduce();
// 4. В объектах класса вызвали методы;
        person1.sayHello();
        person2.sayHello();
        person1.introduce();
        person2.introduce();
// Урок 16. Возвращаемые типы данных
        person1.calkYearsToRetirementVoid();
        person2.calkYearsToRetirementVoid();
        int year1 = person1.calkYearsToRetirementReturnInt();// Переменные созданы в экземпляре класса;
        int year2 = person2.calkYearsToRetirementReturnInt();// Переменные созданы в экземпляре класса;
        System.out.println("Вызвали переменную, которая берет значение из return метода - Первому до пенсии " + year1);
        System.out.println("Вызвали переменную, которая берет значение из return метода - Второму до пенсии " + year2);
    }
}