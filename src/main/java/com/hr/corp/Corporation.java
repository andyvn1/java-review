package com.hr.corp;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {

    private String name;
    private double monthlyIncome;

    public Corporation(String name, double monthlyIncome) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return getMonthlyIncome() * CORP_TAX_RATE;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }
}