package ru.gertru;

import java.time.Duration;
import java.time.LocalDateTime;

public class CheckTimestamp implements HumanReadableTimestamp {

    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {
        String x, y = "";
        String status = "Опубликовано ";
        LocalDateTime currentTime = LocalDateTime.now();
        Duration timePeriod = Duration.between(eventTimestamp, currentTime);

        if (timePeriod.toHours() < 1) {
            x = String.valueOf(timePeriod.toMinutes());
            if ((timePeriod.toMinutes() % 10 == 1) && (timePeriod.toMinutes() % 100 != 11)) {
                y = "минуту";
            } else if (((timePeriod.toMinutes() % 10 == 4) || (timePeriod.toMinutes() % 10 == 3) || (timePeriod.toMinutes() % 10 == 2)) && ((timePeriod.toMinutes() % 100) / 10 != 1)) {
                y = "минуты";
            } else {
                y = "минут";
            }

        } else if (timePeriod.toHours() < 24) {
            x = String.valueOf(timePeriod.toHours());
            if ((timePeriod.toHours() % 10 == 1) && (timePeriod.toHours() % 100 != 11)) {
                y = "час";
            } else if (((timePeriod.toHours() % 10 == 4) || (timePeriod.toHours() % 10 == 3) || (timePeriod.toHours() % 10 == 2)) && ((timePeriod.toHours() % 100) / 10 != 1)) {
                y = "часа";
            } else {
                y = "часов";
            }

        } else if (timePeriod.toHours() < 48) {
            return ("Опубликовано вчера");

        } else {
            x = String.valueOf(timePeriod.toDays());
            if ((timePeriod.toDays() % 10 == 1) && (timePeriod.toDays() % 100 != 11)) {
                y = "день";
            } else if (((timePeriod.toDays() % 10 == 4) || (timePeriod.toDays() % 10 == 3) || (timePeriod.toDays() % 10 == 2)) && ((timePeriod.toDays() % 100) / 10 != 1)) {
                y = "дня";
            } else {
                y = "дней";
            }

        }

        status += x + " " + y + " назад";
        return status;
    }
}
