package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public abstract class Employee implements TaxPayer {

    private String name;
    private LocalDate localDate;

    public Employee(String name, LocalDate localDate) {
        this.name = name;
        this.localDate = localDate;
    }

    public String getEmployeeInfo(){
        return "name = " + name + " " +
                "hireDate = " + localDate;
    }

    public String work(){
       return name + " worked";
    }

    public abstract double computeMonthlyCompesation();

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}