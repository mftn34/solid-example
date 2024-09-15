package com.mtfn.solid_example.interfaceSegregation.worst;

public class PersonalCreditCalculatorImpl implements CreditCalculator{
    @Override
    public float calculatePersonalCredit() {
        return 0;
    }

    @Override
    public float calculateHousingLoan() {
        return 0;
    }

    @Override
    public float calculateCarLoan() {
        return 0;
    }
}