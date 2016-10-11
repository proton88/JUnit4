package test.com.suglob.modtest;

import com.suglob.modtest.IscholarshipCalculator;
import com.suglob.modtest.ScholarshipCalculatorImpl;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ScholarshipRunner.class)
public class ScholarshipCalculatorTest {
    @Test
    public void scholarshipCalculateTest(){
        IscholarshipCalculator scholarshipCalculator=new ScholarshipCalculatorImpl();
        double basicScholarship=ScholarshipCalculatorImpl.BASIC_SCHOLARSHIP;
        double stepUpCoefficient=1.1;
        double expected = basicScholarship*stepUpCoefficient;
        double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);
        Assert.assertEquals("Test failed",expected,actual,0.01);
    }

    @Test
    public void scholarshipCalculateTestFalse(){
        IscholarshipCalculator scholarshipCalculator=new ScholarshipCalculatorImpl();
        double basicScholarship=ScholarshipCalculatorImpl.BASIC_SCHOLARSHIP;
        double stepUpCoefficient=1.1;
        double expected = basicScholarship*stepUpCoefficient+1;
        double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);
        //AssertionError error=new AssertionError();

            Assert.assertNotEquals("Test failed",expected, actual, 0.01);
            //Assert.assertEquals(expected,actual,0.01);
            //Assert.assertNotNull(basicScholarship);
            //Assert.fail();
            //Assume.assumeTrue("Test 2 failed",expected==actual);



    }
}
