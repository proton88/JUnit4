package com.suglob.modtest;

public class ScholarshipCalculatorImpl implements IscholarshipCalculator {
    public static final double BASIC_SCHOLARSHIP = 100;
    @Override
    public double scholarshipCalculate(double stepUpCoefficient) {
        return BASIC_SCHOLARSHIP*stepUpCoefficient;

    }

    public double stepUpCoefCalc(int avgMark) throws NotSuchMarkException{
        double stepUpCoef;

        switch (avgMark){
            case 5:
                stepUpCoef=1.5;
                break;
            case 4:
                stepUpCoef=1.3;
                break;
            case 3:
                stepUpCoef=1;
                break;
            case 2:
                stepUpCoef=0;
                break;
            default:
                throw new NotSuchMarkException("There is no mark:" + avgMark);
        }
        return stepUpCoef;
    }
}
