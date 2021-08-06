package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDayTimeIntro {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println("------------------------------------");
        LocalDate date = LocalDate.of(2021,7,22);
        LocalTime time = LocalTime.of(17,45);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        System.out.println(dateTime);
    }
}
