package itcarlow.c00204384.test;

import itcarlow.c00204384.code.CarParkKind;
import itcarlow.c00204384.code.Period;
import itcarlow.c00204384.code.Rate;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.IllformedLocaleException;

import static org.junit.Assert.*;

public class CollThomasTestTask1 {

    /* ---------- NORMAL RATE INPUT TESTING ---------- */

    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateANormalNumberMinInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(Integer.MIN_VALUE);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(Integer.MIN_VALUE);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateANormalNumberMinusOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(-1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(-1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateANormalNumberMinusPointOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(-0.1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(-1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    @Test
    public void isNormalRateANormalNumberZero() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(0);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        //Assert that the inputted vale is 0 or above
        assertTrue(rate.normalRate.compareTo(BigDecimal.valueOf(0)) == 0);
    }
    @Test
    public void isNormalRateANormalNumberPlusPointOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(0.1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        //Assert that the inputted vale is 0 or above
        assertTrue(rate.normalRate.compareTo(BigDecimal.valueOf(0)) >= 0);
    }
    @Test
    public void isNormalRateANormalNumberPlusOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        //Assert that the inputted vale is 0 or above
        assertTrue(rate.normalRate.compareTo(BigDecimal.valueOf(0)) >= 0);
    }
    @Test
    public void isNormalRateANormalNumberMaxInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(Integer.MAX_VALUE);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        assertTrue(rate.normalRate.compareTo(BigDecimal.valueOf(0)) >= 0);
    }

    /* ---------- REDUCED RATE INPUT TESTING ---------- */

    @Test (expected = IllegalArgumentException.class)
    public void isReducedRateANormalNumberMinInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(3);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(Integer.MIN_VALUE);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isReducedRateANormalNumberMinusOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(3);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(-1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isReducedRateANormalNumberMinusPointOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(-0.1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    @Test
    public void isReducedRateANormalNumberZero() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(0);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        //Assert that the inputted vale is 0 or above
        assertTrue(rate.reducedRate.compareTo(BigDecimal.valueOf(0)) == 0);
    }
    @Test
    public void isReducedRateANormalNumberPlusPointOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(6);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0.1);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        //Assert that the inputted vale is 0 or above
        assertTrue(rate.reducedRate.compareTo(BigDecimal.valueOf(0)) >= 0);
    }
    @Test
    public void isReducedRateANormalNumberPlusOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(6);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        //Assert that the inputted vale is 0 or above
        assertTrue(rate.reducedRate.compareTo(BigDecimal.valueOf(0)) >= 0);
    }
    @Test
    public void isReducedRateANormalNumberMaxInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(Integer.MAX_VALUE);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(Integer.MAX_VALUE);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        assertTrue(rate.reducedRate.compareTo(BigDecimal.valueOf(0)) >= 0);
    }

    /* ---------- NORMAL RATE >= REDUCED RATE TESTING ---------- */

    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateGreaterThanReducedRateMinIntVsMaxInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(Integer.MIN_VALUE);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(Integer.MAX_VALUE);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateGreaterThanReducedRateReducedLarger() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(20);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    @Test
    public void isNormalRateGreaterThanReducedRateBothZero() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(0);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        assertTrue(rate.normalRate.compareTo(rate.reducedRate) == 0);
    }
    @Test
    public void isNormalRateGreaterThanReducedRateNormalIsLarger() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(20);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(10);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        assertTrue(rate.normalRate.compareTo(rate.reducedRate) >= 0);
    }
    @Test
    public void isNormalRateGreaterThanReducedRateMaxIntVsMinInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(13, 14));
        normalPeriods.add(new Period(15, 16));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(20, 21));
        reducedPeriods.add(new Period(22, 23));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(Integer.MAX_VALUE);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(Integer.MIN_VALUE);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);

        assertTrue(rate.normalRate.compareTo(rate.reducedRate) >= 0);
    }

    /* ---------- CALCULATION TESTING ---------- */

    @Test
    public void calculationBasedOnChrisExample() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(2, 5));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(6, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(5);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(2);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);


        assertEquals(rate.calculate(new Period(1,6)), BigDecimal.valueOf(17));
    }
    @Test
    public void calculationUsingLargeNumbers() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 11));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(1000000);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(300000);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);


        assertEquals(rate.calculate(new Period(7,16)), BigDecimal.valueOf(5500000));
    }
    @Test
    public void calculationUsingSmallNumbers() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 11));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(0.1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0.01);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);


        assertEquals(rate.calculate(new Period(7,16)), BigDecimal.valueOf(0.54));
    }
    @Test
    public void calculationNotUsingReduced() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 11));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);


        assertEquals(rate.calculate(new Period(0,10)), BigDecimal.valueOf(10));
    }
    @Test
    public void calculationNotUsingNormal() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 11));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);


        assertEquals(rate.calculate(new Period(12,22)), BigDecimal.valueOf(10));
    }
    @Test
    public void calculationNotUsingNormalOrReduced() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 4));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);


        assertEquals(rate.calculate(new Period(6,7)), BigDecimal.valueOf(0));
    }
}