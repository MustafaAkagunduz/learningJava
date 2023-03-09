package calendarPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0); // Bugüne 0 ekliyor(bugün oluyor). bugüne 100 olsa 100 gün ekler
        System.out.println(cal.getTime());

        // format:
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);

    }

}
