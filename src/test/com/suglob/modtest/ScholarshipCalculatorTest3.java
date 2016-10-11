package test.com.suglob.modtest;

import com.suglob.modtest.NotSuchMarkException;
import com.suglob.modtest.ScholarshipCalculatorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
//@RunWith(ScholarshipRunner.class)
public class ScholarshipCalculatorTest3 {
    private int avgMark;
    private double stepUpCoef;

    public ScholarshipCalculatorTest3(int avgMark, double stepUpCoef) {
        this.avgMark = avgMark;
        this.stepUpCoef = stepUpCoef;
    }

    @Parameters public static Collection<Object[]> stepUpCoefTableValues(){
        return Arrays.asList(new Object[][]{
                {3,1.0},
                {4,1.3},
                {5,1.5}
        });
    }

    @Test
    public void setStepUpCoefTest() throws NotSuchMarkException {
        ScholarshipCalculatorImpl scholarshipCalculator=new ScholarshipCalculatorImpl();
        double expected=this.stepUpCoef;
        double actual = scholarshipCalculator.stepUpCoefCalc(this.avgMark);
        assertEquals("Wronf coef with mark"+avgMark,expected,actual,0.01);
    }
}
