package pl.com.empas.java_introductory_course.time.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateConversionExample {

    public static String formatDate(LocalDateTime dateTime) {
        return null;
    }

    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        LocalDateTime dateTime = LocalDateTime.of(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE));

        LocalDateTime dateTime2 = date.toInstant().atZone(ZoneId.of("Europe/Warsaw")).toLocalDateTime();

        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(dateTime2);

        Date d2 = Date.from(dateTime2.toInstant(ZoneId.systemDefault().getRules().getOffset(dateTime)));
        System.out.println(d2);



    }
}
