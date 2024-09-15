package com.mtfn.solid_example.interfaceSegregation.best.abstracts;

import com.mtfn.solid_example.interfaceSegregation.best.abstracts.common.CreditCalculator;

public interface CarLoanCalculator extends CreditCalculator {
    float calculateCarLoan();

}
