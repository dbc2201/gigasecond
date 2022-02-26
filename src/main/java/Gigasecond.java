import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {

    private LocalDateTime moment;
    private final long ONE_GIGA_SECOND = calculateOneGigaSecond();

    public Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return moment.plus(ONE_GIGA_SECOND, ChronoUnit.SECONDS);
    }

    private long calculateOneGigaSecond() {
        return Double.valueOf(Math.pow(10.0, 9.0)).longValue();
    }
}
