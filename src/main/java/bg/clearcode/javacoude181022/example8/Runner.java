package bg.clearcode.javacoude181022.example8;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static void main(final String[] args) {

        final LocalDate localDate = LocalDate.parse(
                "Tue, 3 Jun 2008 11:05:30 GMT",
                DateTimeFormatter.RFC_1123_DATE_TIME);


        final List<Temporal> temporalList = new ArrayList<>();
        temporalList.add(localDate);
        temporalList.add(Year.now());

        /*temporalList
                .stream()
                .filter(temporal -> temporal.isSupported(ChronoUnit.YEARS))
                .forEach(System.out::println);*/

        //final ValueRange valueRange = Year.now().range(ChronoField.DAY_OF_MONTH);

        //System.out.println(LocalDate.now().get(ChronoField.DAY_OF_YEAR));

        // 2018-10-24
        // 2018-12-24
        //System.out.println(LocalDate.now().with(ChronoField.MONTH_OF_YEAR, 12));
        /*System.out.println(
                LocalDate
                        .of(2018, 1, 31)
                        .with(ChronoField.MONTH_OF_YEAR, 2)
        );*/

        /*System.out.println(
                LocalDate
                        .of(2016, 1, 31)
                        .plus(1, ChronoUnit.MONTHS)
        );*/



        /*System.out.println(
                Year.of(2048).adjustInto(LocalDate.now())
        );
        System.out.println(
                LocalDate.now().with(Year.of(2048))
        );*/

        //System.out.println(YearMonth.now().until(YearMonth.of(3018, 1), ChronoUnit.YEARS));

        //final Period period = LocalDate.now().until(LocalDate.of(2018, 1, 1));

        /*System.out.println(LocalTime.now());

        System.out.println(LocalTime.now().until(LocalTime.MIDNIGHT, ChronoUnit.SECONDS));

        final Duration duration = Duration.between(LocalTime.now(), LocalTime.now().plus(1, ChronoUnit.HOURS));

        final LocalDateTime localDateTime = LocalDateTime.now();*/

        // bridge between legacy & Java Data-Time API
        /*final Date date = new Date();

        final LocalDateTime localDateTime =
                LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        System.out.println(new Date(localDateTime.toInstant(ZonedDateTime.now().getOffset()).toEpochMilli()));*/

        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Paris")));

        //ZoneId.ofOffset()
        //ZoneId.getAvailableZoneIds().stream().findFirst().get()

        System.out.println();
    }
}
