package DateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;


///  mainly used dor the date and the time
/// we can specify using the whether date it the time
/// this is the data and the time
/// import java.time.LocalDateTime
/// of we inly use date
/// import java.time,LocalDate
public class launch1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int dd1 = date.getDayOfMonth();
        int month1 = date.getMonthValue();
        int year1 = date.getYear();
        int aa1 = date.getDayOfYear();
        System.out.println(aa1);
        System.out.printf("%d-%d-%d-> %d days",dd1,month1,year1,aa1);

        /// local date and time
        LocalDateTime d = LocalDateTime.now();
        System.out.println(d);

        int dd = d.getDayOfMonth();
        int month = d.getMonthValue();
        int year = d.getYear();
        int aa = d.getDayOfYear();
        System.out.println(aa);
        System.out.printf("%d-%d-%d-> %d days",dd,month,year,aa);
    }
}
