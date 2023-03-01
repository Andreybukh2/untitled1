package org.example.Test;

public class AIRPLANE {
    String model;
    int seats;
    static int count = 0;
    public void Zona_01 (){
        System.out.println("Контроль - диспетчер Старт");
    }
    public void Zona_02 (){
        System.out.println("Контроль - диспетчер Подход");
    }
    public AIRPLANE(String selectmodel, int selectseats) {
        this.model = selectmodel;
        this.seats = selectseats;
    }
    public static void main(String[] args) {
        AIRPLANE BOEING = new AIRPLANE("737-MAX", 200);count++;
        AIRPLANE AIRBUS = new AIRPLANE("A-320", 180);count++;
        AIRBUS.Zona_01();
        BOEING.Zona_02();
        System.out.println("\n" + "Ожидаем прибытие: " + AIRBUS.model + "\n" + "Ожидает на ВПП: " + BOEING.model);
        System.out.println("\n" + "Всего самолетов под контролем диспетчеров: " + count);
    }
}