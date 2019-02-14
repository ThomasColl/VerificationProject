package itcarlow.c00204384.code;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Rate {
    public CarParkKind kind;
    public BigDecimal normalRate;
    public BigDecimal reducedRate;
    public ArrayList<Period> reducedPeriods;
    public ArrayList<Period> normalPeriods;

    public Rate(CarParkKind kind, BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods, ArrayList<Period> normalPeriods) {
        this.kind = kind;
        this.normalRate = normalRate;
        this.reducedRate = reducedRate;
        this.reducedPeriods = reducedPeriods;
        this.normalPeriods = normalPeriods;
    }

    public BigDecimal calculate(Period periodStay) {
        return BigDecimal.valueOf(0);
    }
}
