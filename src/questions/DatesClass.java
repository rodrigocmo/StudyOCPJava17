package questions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DatesClass {

    public void period(){
        Period period = Period.of(1,1,1);

        var oi = LocalDateTime.now();

        Duration d = Duration.ofDays(2);
        Duration d1 = Duration.of(1,ChronoUnit.DAYS);



    }
}
