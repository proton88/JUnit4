package test.com.suglob.modtest;

import com.suglob.modtest.NotSuchMarkException;
import com.suglob.modtest.ScholarshipCalculatorImpl;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(ScholarshipRunner.class)
public class ScholarshipCalculatorTest2 {
    private static ScholarshipCalculatorImpl scholarshipCalculator;
    @BeforeClass
    public static void initScholarshipCalculator(){
        scholarshipCalculator=new ScholarshipCalculatorImpl();
    }

    @Test
    public void stepUpCoefForFiveTest() throws NotSuchMarkException {
        double expected = 1.5;
        double actual = scholarshipCalculator.stepUpCoefCalc(5);
        assertEquals("Coef for mark 5 is wrong",expected,actual,0.01);
    }
    //@Ignore("this test is wrong")
    @Test(timeout = 2)
    public void stepUpCoefForThreeTest() throws NotSuchMarkException{
        //double expected = 1;
        for (int i=1;i<1000_000;i++){
            double stepUpCoefficient = 1 / i;
            double expected = 100 * stepUpCoefficient;
            expected=1.0;
            double actual = scholarshipCalculator.stepUpCoefCalc(3);
            assertEquals("Coef for mark 3 is wrong",expected,actual,0.01);
        }


    }

    @Test(expected = NotSuchMarkException.class)
    public void stepUpCoefForElevenTest() throws NotSuchMarkException{
        double expected = 1;
        double actual = scholarshipCalculator.stepUpCoefCalc(11);
        assertEquals("For mark wasn't exception",expected,actual,0.01);
    }
}
