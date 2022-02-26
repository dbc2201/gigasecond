import java.time.LocalDate;
import java.time.LocalDateTime;

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
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    private long calculateOneGigaSecond() {
        return Double.valueOf(Math.pow(10.0, 9.0)).longValue();
    }
}
