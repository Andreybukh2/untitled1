package org.example.Lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Potoki {
    public static void main(String[] args) {
        Ticker ticker1 = new Ticker("Potok1");
        Ticker ticker2 = new Ticker("Potok2");
//        ticker1.run();
//        ticker2.run();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(ticker1);
        executorService.submit(ticker2);
    }
}