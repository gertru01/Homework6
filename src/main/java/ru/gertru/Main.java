package ru.gertru;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        LocalDate publishDate = LocalDate.now().minusDays(1);
        LocalTime publishTime = LocalTime.now().minusHours(5);
        //publishTime = LocalTime.now().minusMinutes(11);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        System.out.println((new CheckTimestamp()).getTimestamp(timestamp));
    }
}
