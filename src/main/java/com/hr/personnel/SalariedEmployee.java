package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate localDate, double monthlySalary) {
        super(name, localDate);
        this.monthlySalary = monthlySalary;
    }

    public double computeMonthlyTaxToPay(){
        return getMonthlySalary() * SALARIED_TAX_RATE;
    }

    @Override
    public double computeMonthlyCompesation(){
        return  monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

}