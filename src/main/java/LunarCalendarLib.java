import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class LunarCalendarLib {
    public static Map<String, Integer> convertSolar2LunarDate(String yyyyMMdd) {
        return null;
    }

    public static void main(String[] args) {
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern();
        DateTimeFormatter iso = DateTimeFormatter.ISO_DATE_TIME;
        LocalDate a = LocalDate.parse("2020-08-31");
        System.out.println(a.getMonth());
    }
}
