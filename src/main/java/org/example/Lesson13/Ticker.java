package org.example.Lesson13;

public class Ticker implements Runnable {
    private final String name;
    public Ticker(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "- " + i);
            try {
                Thread.sleep(600);  // Класс поток и фукция sleep
            } catch (InterruptedException e) { // Когда поток прерывается
                throw new RuntimeException(e);
            }
        }
    }
}