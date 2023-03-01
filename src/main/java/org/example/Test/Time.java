package org.example.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println("Привет сейчас: " + dateFormat.format(cal.getTime()));
    }
}