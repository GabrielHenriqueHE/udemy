package desafio1.domain.entities;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Contract {
    private final Date date;
    private final Double valuePerHour;
    private final Integer hours;

    public Contract (Date date, Double valuePerHour, Integer hours) {
        this.date = date;

        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue() {
        return this.valuePerHour * this.hours;
    }

    public LocalDateTime getContractDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM d HH:mm:ss zzz yyyy").withLocale(Locale.ENGLISH);
        return LocalDateTime.parse(this.date.toString(), formatter);
    }
}
