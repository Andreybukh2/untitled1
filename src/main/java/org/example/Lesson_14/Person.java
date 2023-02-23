package org.example.Lesson_14;
// Урок 14.
// 1. Создали поля (переменные);
// 2. Создали объект и присвоили объекту значение переменным, вывели через sout эти значения;
// System.out.println("My name is " + P1.name + " and " + "i am " + P1.age + " year old");

// Урок 15.
// 3. Добавили метод sayHello() и introduce();
// 4. В объектах класса вызвали методы;

// Урок 16. Тип возвращаемого значения метода.
// Метод void ничего не возвращает и мы через sout выводим в консоль значения, но если нам ничего не надо
// выводить, но необходимо записать значение в память, то мы используем иной синтаксис и добавляем return;
// Создали еще одни метод, который считает сколько лет до пенсии. Условимся что пенсия в 65;

public class Person {
// Урок 14
   String name;
   int age;

//Урок 15
   void introduce() {
      for (int i = 0; i < 2; i++) {
         System.out.println("Метод introduce с циклом 2 - Я " + name + " и  " + "мне  " + age + " year old");
      }
   }
   void sayHello () {
      System.out.println("Метод sayHello - Привет я " + name);
   }
// Урок 16
   void calkYearsToRetirementVoid(){
      int years = 65 - age;
      System.out.println("Количество лет до пенсии " + years);
   }
   int calkYearsToRetirementReturnInt(){
      int years = 65 - age;
      return years;
   }
// Урок 17: Параметры метода.
// У каждого метода есть параметры, но если в скобках метода нет параметров, то мы вызываем не подставля доп значения
}