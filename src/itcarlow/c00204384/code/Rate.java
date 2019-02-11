package itcarlow.c00204384.code;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Rate {
    public Rate(CarParkKind kind, BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods) {

    }
    public BigDecimal calculate(Period periodStay) {
        BigDecimal rate = BigDecimal.valueOf(periodStay.startHour * periodStay.endHour);

        return rate;
    }
}
