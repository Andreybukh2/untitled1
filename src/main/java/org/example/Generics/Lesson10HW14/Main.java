package org.example.Generics.Lesson10HW14;

// Создадим список для объектов транспорта и разрешим помещать туда только объекты класса Train;
// Создадим метод который будет принимать на вход лист транспорта под названием list;
// Для возможности пройти по всем элементам, будем использовать цикл for each;
// В sout, будет вызываться метод toString из класса Object, котрый является родетелем класса Transport
// и вообще родителем для любого объекта класса в java по обределению.
// Технический шаг - это добавление в лист какого-нибудь транспорта через метод add
// Создадим конструктор для возможности добавить параметры для нашего транспорта что бы его различать
// Переопределили родительсткий метод String, теперь он будет возвращаемы (return) и возвращать он будет строку,
// но так как в аргументах у него значение  int, но мы должны указать на необходимость конвертации целого числа
// в строку. Реализуем это через метод valueOf из класса String
// Вызываем метод show который нам покажет весь транспорт;
// Так как мы создали свой конструктор в Transport, то дефолтный конструктор уже не действует и так как Air это
// наследник от Transport и там не назначен конструктор, то в родительском классе необходимо создать вручную
// дефолтный конструктор. Иначе будет ошибка.
// Теперь создадим лист объектов Воздушного транспорта, говоря языком JAVA, мы имеем объект List содержащий
// объекты Transport и бъект List содержащий объекты Air наследники от Transport;
// По аналогии добавим в него объекты воздушного транспорта
// Исходя из принципа полиморфизма, если метод в качестве аргументов принимает какой то класс, то все потомки этого
// класса тоже могут быть переданы. Получается что если в нашем методе showTransport (List<Transport> list)
// передан Transport, то туда можно передать и его наследника "Воздушный транспорт". (Он у нас extends Transport)?
// В таком случаем мы увидим ошибку и полиморфизм так не работает. Как раз тут можно наблюдать работу Дженериков.
// Если в даймонд оператор помещен объект <Transport>, то вызвать можно только тип Transport.
// Меняя в даймонд опереторе List <Transport> на <?> мы говорим что теперь можно принимать объект любого класса.
// однако теперь необходимо детально разобрать что происходит в цикле. (Transport transport : list).
// Теперь содержимое класса List - это не массив с объектами Транспорта, а массив любых потенциальных
// объектов и в текущем сочетании возможно только рассмотреть рожителя всех классов объектов (Object).
// Были на нижнем уровне в дочернем классе, могли работать с дочерним объектом, перешли на высший уровень абстракции,
// должны использовать его во всем. Доступны только методы класса Object.
// Определим еще один методв родительском классе Транспорт и назовем его общей абстракцией - движение. Потому как
// движение в дальнейшем будет у любого транспорта, это и есть суть транспорта. поэтому принцип абстракции соблюден.
// Соответственно этот метод "Транспорт перемещается в пространстве - " унаследован в классе Air (Воздушный транспорт)
// Применяем Wiildcads и заменяем (List<?> list) на (List<? extends Transport>list) показывая тем самым
// что теперь элементы этого листа. мы можем рассматривать как Транспорт либо наследники от Транспорт, тоемсть Air
// Теперь метод move вызвается на всех элементах. И теперь можем создать бесконечное множество наследником:
// железнодорожный транспорт, дорожный, водный итд. Метод будет работать.
// Затрону сразу операторы super и extends. В этом примере иерархия наследования следующая.
// Object -> Transort -> Air. Используя extends Transport мы говорим что хотим использовать элементы Transport и потомков
// этого класса, тоесть Air (идем вниз по иерархии), если используем super Transport, мы едем по иерархии вверх.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> transportList = new ArrayList<>();
        transportList.add(new Transport(1, "Воздушный"));
        transportList.add(new Transport(2, "Водный"));
        transportList.add(new Transport(3, "Железнодорожный"));

        List<Air> airList = new ArrayList<>();
        airList.add(new Air());
        airList.add(new Air());
        airList.add(new Air());
        airList.add(new Air());

        //showInfo(transportList);
        showInfoWildcards(transportList);
        showInfoWildcards(airList);
    }
    //        private static void showInfo(List<Transport> list) {
//        for (Transport transport : list) ;
//        {
//            System.out.println(list);
//        }
    private static void showInfoWildcards (List < ? extends Transport > list){
        for (Transport transport : list) {
            transport.move();
        }
    }
}