package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    int hoursWorkedPerMonth;
    double hourlyRate;

    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, localDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    public double computeMonthlyTaxToPay(){
        return computeMonthlyCompesation() * HOURLY_TAX_RATE;
    }

    @Override
    public double computeMonthlyCompesation(){
        return getHourlyRate() * getHoursWorkedPerMonth();
    }

    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

}