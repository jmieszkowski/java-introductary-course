package pl.com.empas.java_introductory_course.time.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate future = LocalDate.now().plusDays(1).plusYears(2);
        LocalDateTime futureWithTime = future.atStartOfDay().with(LocalTime.of(17, 18));

        System.out.println(date);
        System.out.println(future);
        System.out.println(futureWithTime);

        System.out.println(date.compareTo(future));
        System.out.println(future.compareTo(futureWithTime.toLocalDate()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        System.out.println(formatter.format(futureWithTime));
        futureWithTime.format(formatter);

        for(int i = 0; i < 10; i++) {
            System.out.println(LocalDateTime.now().format(formatter));
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {

            }
        }

    }
}
