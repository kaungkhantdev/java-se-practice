package com.astronity.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate after = now.plus(1, ChronoUnit.WEEKS);

        System.out.println("Now "+now);
        System.out.println("After "+after);

        System.out.println("Day " + now.getDayOfMonth());
        System.out.println("DayofWeek " + now.getDayOfWeek());
        System.out.println("Month " + now.getMonth());
        System.out.println("MonthValue " + now.getMonthValue());
        System.out.println("Year " + now.getYear());

        LocalDateTime time = LocalDateTime.now();
        System.out.println("Time "+time);

        System.out.println("Before "+now.isBefore(after));
    }
}
