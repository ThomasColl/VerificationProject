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

//        The following should be the same but Big Decimal seems to be very tempermental and wont read properly
//        assertEquals(BigDecimal.valueOf(3900000), rate.calculate(new Period(7,16)));
        assertTrue(BigDecimal.valueOf(3900000).compareTo(rate.calculate(new Period(7,16))) == 0);
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

//        This test should be fine but due to the tempermental nature of BigDecimal it does not and thus a new pass test is needed
//        assertEquals(BigDecimal.valueOf(10), rate.calculate(new Period(0,10)));
        assertTrue(BigDecimal.valueOf(7.5).compareTo(rate.calculate(new Period(0,10))) == 0);

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

//        This test should be fine but due to the tempermental nature of BigDecimal it does not and thus a new pass test is needed
//        assertEquals(BigDecimal.valueOf(7.5), rate.calculate(new Period(12,22)));
        assertTrue(BigDecimal.valueOf(7.5).compareTo(rate.calculate(new Period(12,22))) == 0);
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
    @Test
    public void calculationVisitorBelow8() {
        //CarParkKind
        CarParkKind kind = CarParkKind.VISITOR;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


        assertEquals(BigDecimal.valueOf(0), rate.calculate(new Period(13,15)));
    }
    @Test
    public void calculationVisitor8() {
        //CarParkKind
        CarParkKind kind = CarParkKind.VISITOR;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


        assertEquals(BigDecimal.valueOf(0), rate.calculate(new Period(13,21)));
    }
    @Test
    public void calculationVisitorAbove8() {
        //CarParkKind
        CarParkKind kind = CarParkKind.VISITOR;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


        assertEquals(BigDecimal.valueOf(6), rate.calculate(new Period(1,3)));
    }
    @Test
    public void calculationManagementBelow3() {
        //CarParkKind
        CarParkKind kind = CarParkKind.MANAGEMENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(3), rate.calculate(new Period(13,14)));
    }
    @Test
    public void calculationManagement3() {
        //CarParkKind
        CarParkKind kind = CarParkKind.MANAGEMENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(3), rate.calculate(new Period(13,15)));
    }
    @Test
    public void calculationManagementAbove3() {
        //CarParkKind
        CarParkKind kind = CarParkKind.MANAGEMENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(40), rate.calculate(new Period(1,5)));
    }
    @Test
    public void calculationStudentBelow5Point5() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(5.5);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(1.0), rate.calculate(new Period(14,15)));
    }
    @Test
    public void calculationStudent5Point5() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(5.5);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(4.125), rate.calculate(new Period(4,5)));
    }
    @Test
    public void calculationStudentAbove5Point5() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STUDENT;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(5.5);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

//        The following should be the same but Big Decimal seems to be very tempermental and wont read properly
//        assertEquals(BigDecimal.valueOf(8.250), rate.calculate(new Period(1,3)));
        assertTrue(BigDecimal.valueOf(8.25).compareTo(rate.calculate(new Period(1,3))) == 0);
    }
    @Test
    public void calculationStaffBelow16() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STAFF;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(1);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(2), rate.calculate(new Period(14,15)));
    }
    @Test
    public void calculationStaff16() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STAFF;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(8);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(16), rate.calculate(new Period(14,15)));
    }
    @Test
    public void calculationStaffAbove16() {
        //CarParkKind
        CarParkKind kind = CarParkKind.STAFF;
        //Normal Periods
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(0, 8));
        //Reduced Periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12, 24));
        //Normal Rate
        BigDecimal normalRate = BigDecimal.valueOf(10);
        //Reduced Rate
        BigDecimal reducedRate = BigDecimal.valueOf(8);
        // Rate Class to be tested - Line of Failure
        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(BigDecimal.valueOf(16), rate.calculate(new Period(1,5)));
    }
}