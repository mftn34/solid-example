package com.mtfn.solid_example.interfaceSegregation.worst;

public class CarLoanCalculatorImpl implements CreditCalculator {

    // car credit class in personal credit calculation is very bad..
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
