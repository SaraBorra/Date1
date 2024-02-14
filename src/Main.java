import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ITALY);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ITALY);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.ITALY);

        String fullDate = dateTime.format(fullFormatter);
        String mediumDate = dateTime.format(mediumFormatter);
        String shortDate = dateTime.format(shortFormatter);

        System.out.println("FULL: " + fullDate);
        System.out.println("MEDIUM: " + mediumDate);
        System.out.println("SHORT: " + shortDate);
    }
}
