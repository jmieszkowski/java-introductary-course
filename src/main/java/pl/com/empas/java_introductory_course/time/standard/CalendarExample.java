package pl.com.empas.java_introductory_course.time.standard;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone().getDisplayName(Locale.CANADA_FRENCH));
        System.out.println(calendar.get(Calendar.YEAR));

        Locale koreanLocale = Locale.KOREAN;
        DateFormat format = SimpleDateFormat.getDateInstance(0, koreanLocale);
        System.out.println(format.format(new Date()));

        Locale englishLocale = Locale.ENGLISH;
        Locale frenchLocale = Locale.FRENCH;

        DateFormat e =  SimpleDateFormat.getDateInstance(0, englishLocale);
        DateFormat f =  SimpleDateFormat.getDateInstance(0, frenchLocale);

        System.out.println(e.format(new Date()));
        System.out.println(f.format(new Date()));


    }
}
