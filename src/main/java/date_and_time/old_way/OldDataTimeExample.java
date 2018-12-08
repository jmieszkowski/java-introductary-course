package date_and_time.old_way;

import java.util.Calendar;
import java.util.Date;

public class OldDataTimeExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Now: " + now);

        Date date2 = new Date(123456789L);
        System.out.println(date2);

        Date date3 = new Date(now.getTime() + (24 * 60 * 60 * 1000));
        System.out.println(date3);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(calendar.getTime());

        calendar.setTime(new Date());

        calendar.add(Calendar.YEAR, -1);
        calendar.add(Calendar.MONTH, -1);

        System.out.println(calendar.getTime());


    }
}
