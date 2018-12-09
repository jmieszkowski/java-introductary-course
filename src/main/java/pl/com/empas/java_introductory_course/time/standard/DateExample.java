package pl.com.empas.java_introductory_course.time.standard;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateExample {

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        Date now = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

        calendar.add(Calendar.DAY_OF_YEAR, 1);

        Date future = calendar.getTime();
        System.out.println(now);
        System.out.println(future);
        System.out.println(now.compareTo(future));


        TimeZone zoneCurrent = calendar.getTimeZone();

        System.out.println("Current timezone: " + zoneCurrent.getDisplayName());
        System.out.println("Current Zone Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current Zone Minute: " + calendar.get(Calendar.MINUTE));
        TimeZone zoneLA = TimeZone.getTimeZone("America/Los_Angeles");
        System.out.println("LA timezone offset: " + zoneLA.getOffset(calendar.getTimeInMillis()));
        calendar.setTimeZone(zoneLA);
        System.out.println("LA zone Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("LA zone Minute: " + calendar.get(Calendar.MINUTE));




    }
}
