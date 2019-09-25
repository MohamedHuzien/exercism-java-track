import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime localDateTime;

    Gigasecond(LocalDate moment) {

        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {

        this.localDateTime = moment.plusSeconds(1000000000);
    }

    LocalDateTime getDateTime() {

       return localDateTime;
    }

}
