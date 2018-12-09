package pl.com.empas.java_introductory_course.time.standard;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat();
        Date now = new Date();
        String formattedDate = format.format(now);
        System.out.println(formattedDate);
        try {
            now = format.parse(formattedDate);
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(now);

        DateFormat customizedFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        formattedDate = customizedFormat.format(now);
        System.out.println(formattedDate);

    }
}
