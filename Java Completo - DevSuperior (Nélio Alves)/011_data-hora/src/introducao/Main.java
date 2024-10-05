package introducao;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalDateTime dt1 = LocalDateTime.now();
        LocalTime t1 = LocalTime.now();
        Instant i1 = Instant.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d2 = LocalDate.parse("01/04/2004", dtf1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dt2 = LocalDateTime.parse("01/04/2004 00:00", dtf2);

        System.out.println(d1);
        System.out.println(dt1);
        System.out.println(t1);
        System.out.println(i1);
        System.out.println(d2);
        System.out.println(dt2);

        System.out.println(dtf1.format(d1));

    }
}
