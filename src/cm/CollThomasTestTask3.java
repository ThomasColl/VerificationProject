package cm;


import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;

//TODO HANLE PERIOD OVERLAP

public class CollThomasTestTask3 {

    /* ---------- NORMAL RATE INPUT TESTING ---------- */

    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateANormalNumberMinInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(Integer.MIN_VALUE);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateANormalNumberMinusOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(-1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateANormalNumberMinusPointOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(-0.1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
//    @Test
//    public void isNormalRateANormalNumberZero() {
//        //CarParkKind
//        CarParkKind kind = CarParkKind.STUDENT;
//        //Normal Periods
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(new Period(10, 12));
//        //Reduced Periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(new Period(17, 19));
//        //Normal Rate
//        BigDecimal normalRate = BigDecimal.valueOf(0);
//        //Reduced Rate
//        BigDecimal reducedRate = BigDecimal.valueOf(0);
//        // Rate Class to be tested - Success
//        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
//
//    }
    @Test
    public void isNormalRateANormalNumberPlusPointOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(0.1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test
    public void isNormalRateANormalNumberPlusOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0.5);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test
    public void isNormalRateANormalNumberMaxInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(Integer.MAX_VALUE);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    /* ---------- REDUCED RATE INPUT TESTING ---------- */

    @Test (expected = IllegalArgumentException.class)
    public void isReducedRateANormalNumberMinInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(3);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(Integer.MIN_VALUE);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isReducedRateANormalNumberMinusOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(3);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(-1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isReducedRateANormalNumberMinusPointOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(1);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(-0.1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
//    @Test
//    public void isReducedRateANormalNumberZero() {
//        //CarParkKind
//        CarParkKind kind = CarParkKind.STUDENT;
//        //Normal Periods
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(new Period(10, 12));
//        //Reduced Periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(new Period(17, 19));
//        //Normal Rate
//        BigDecimal normalRate = BigDecimal.valueOf(0);
//        //Reduced Rate
//        BigDecimal reducedRate = BigDecimal.valueOf(0);
//        // Rate Class to be tested - Success
//        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
//    }
    @Test
    public void isReducedRateANormalNumberPlusPointOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(6);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0.1);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test
    public void isReducedRateANormalNumberPlusOne() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(6);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Success
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
//    @Test
//    public void isReducedRateANormalNumberMaxInt() {
//        //CarParkKind
//        CarParkKind kind = CarParkKind.STUDENT;
//        //Normal Periods
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(new Period(10, 12));
//        //Reduced Periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(new Period(17, 19));
//        //Normal Rate
//        BigDecimal normalRate = BigDecimal.valueOf(Integer.MAX_VALUE);
//        //Reduced Rate
//        BigDecimal reducedRate = BigDecimal.valueOf(Integer.MAX_VALUE);
//        // Rate Class to be tested - Line of Failure
//        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
//    }

    /* ---------- NORMAL RATE >= REDUCED RATE TESTING ---------- */

    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateGreaterThanReducedRateReducedMaxInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(0);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(Integer.MAX_VALUE);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test (expected = IllegalArgumentException.class)
    public void isNormalRateGreaterThanReducedRateReducedLarger() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(20);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
//    @Test
//    public void isNormalRateGreaterThanReducedRateBothZero() {
//        //CarParkKind
//        CarParkKind kind = CarParkKind.STUDENT;
//        //Normal Periods
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(new Period(10, 12));
//        //Reduced Periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(new Period(17, 19));
//        //Normal Rate
//        BigDecimal normalRate = BigDecimal.valueOf(0);
//        //Reduced Rate
//        BigDecimal reducedRate = BigDecimal.valueOf(0);
//        // Rate Class to be tested - Line of Failure
//        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
//    }
    @Test
    public void isNormalRateGreaterThanReducedRateNormalIsLarger() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(20);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(10);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    @Test
    public void isNormalRateGreaterThanReducedRateMaxIntVsMinInt() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(Integer.MAX_VALUE);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(0);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    /* ---------- NULL INPUT TESTING ---------- */

//    @Test (expected = IllegalArgumentException.class)
//    public void kindIsNullTest() {
//        //CarParkKind
//        CarParkKind kind = null;
//        //Normal Periods
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(new Period(10, 12));
//        //Reduced Periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(new Period(17, 19));
//        //Normal Rate
//        BigDecimal normalRate = BigDecimal.valueOf(20);
//        //Reduced Rate
//        BigDecimal reducedRate = BigDecimal.valueOf(10);
//        // Rate Class to be tested - Line of Failure
//        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
//
//    }
    @Test (expected = IllegalArgumentException.class)
    public void normalPeriodsIsNullTest() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = null;
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(20);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(10);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

    }
    @Test (expected = IllegalArgumentException.class)
    public void reducedPeriodsIsNullTest() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = null;
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(20);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(10);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

    }
    @Test (expected = IllegalArgumentException.class)
    public void normalRateIsNullTest() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = null;
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(10);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

    }
    @Test (expected = IllegalArgumentException.class)
    public void reducedRateIsNullTest() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = null;
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

    }

    /* ---------- OVERLAP TESTING ---------- */

    @Test (expected = IllegalArgumentException.class)
    public void doesNormalPeriodFeatureOverlappingPeriods() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        normalPeriods.add(new Period(11, 13));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(20);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(10);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

    }
    @Test (expected = IllegalArgumentException.class)
    public void doesReducedPeriodFeatureOverlappingPeriods() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 12));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        reducedPeriods.add(new Period(16, 22));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(20);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(10);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

    }
    @Test (expected = IllegalArgumentException.class)
    public void doesReducedPeriodAndNormalPeriodOverlap() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(10, 18));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17, 19));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(20);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(10);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

    }

    /* ---------- CALCULATION TESTING ---------- */

//    @Test
//    public void calculationBasedOnChrisExample() {
//        //CarParkKind
//        CarParkKind kind = CarParkKind.STUDENT;
//        //Normal Periods
//        ArrayList<Period> normalPeriods = new ArrayList<>();
//        normalPeriods.add(new Period(2, 5));
//        //Reduced Periods
//        ArrayList<Period> reducedPeriods = new ArrayList<>();
//        reducedPeriods.add(new Period(6, 24));
//        //Normal Rate
//        BigDecimal normalRate = BigDecimal.valueOf(5);
//        //Reduced Rate
//        BigDecimal reducedRate = BigDecimal.valueOf(2);
//        // Rate Class to be tested - Line of Failure
//        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
//
//
//        assertEquals(BigDecimal.valueOf(17), rate.calculate(new Period(1,6)));
//    }
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
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


        assertEquals(BigDecimal.valueOf(5200000), rate.calculate(new Period(7,16)));
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
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(0.44), rate.calculate(new Period(7,16)));
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
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


        assertEquals(BigDecimal.valueOf(10), rate.calculate(new Period(0,10)));
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
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


        assertEquals(BigDecimal.valueOf(10), rate.calculate(new Period(12,22)));
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
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


        assertEquals(BigDecimal.valueOf(0), rate.calculate(new Period(6,7)));
    }

    /* ---------- TDD UPDATED SPEC TESTING ---------- */

}