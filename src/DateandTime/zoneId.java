package DateandTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zoneId {
    public static void main(String[] args) {
        ZoneId id = ZoneId.systemDefault();
        System.out.println(id);
        ZoneId zone =ZoneId.of("America/Los_Angeles");

        ZonedDateTime time = ZonedDateTime.now(zone);
        System.out.println(time);
        System.out.printf("this is the %d can "  ,time.getDayOfWeek());
    }
}
