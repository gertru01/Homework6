package ru.gertru;

import java.time.LocalDateTime;

public interface HumanReadableTimestamp {
    String getTimestamp(LocalDateTime eventTimestamp);

}
