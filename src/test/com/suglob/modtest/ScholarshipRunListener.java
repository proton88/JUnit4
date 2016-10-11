package test.com.suglob.modtest;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * Created by User on 05.10.2016.
 */
public class ScholarshipRunListener extends RunListener {
    @Override
    public void testStarted(Description description) throws Exception{
        System.out.println("test is started: "+description.getMethodName());
    }

    @Override
    public void testFinished(Description description) throws Exception{
        System.out.println("test is finished: "+description.getMethodName()+"\n-----------------------------");
    }

    @Override
    public void testFailure(Failure failure) throws Exception{
        System.out.println("test is failed:" + failure.getException());
    }

    @Override
    public void testIgnored(Description description) throws Exception{
        System.out.println("test was ignored: " + description.getMethodName()+"\n--------------------------");
    }

    @Override
    public void testRunFinished(Result result) throws Exception{
        System.out.println("result of tests:");
        System.out.println("time execute: "+ result.getRunTime()+" millis");
        System.out.println("Count of tests: "+result.getRunCount());
        System.out.println("tests was failed: "+result.getFailureCount());
        System.out.println("tests was ignored: "+result.getIgnoreCount());
        System.out.println("all tests were successfully:"+ result.wasSuccessful());
    }

}
