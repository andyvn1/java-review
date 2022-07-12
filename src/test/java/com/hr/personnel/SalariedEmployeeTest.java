package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    private SalariedEmployee employee1;
    private Department department;

    @Before
    public void setUp() throws Exception {
        employee1 = new SalariedEmployee("maria", LocalDate.of(2010, 1, 1), 5000);
        department = new Department("marketing");
    }

    @Test
    public void computeMonthlyCompesation_should_give_monthly_compensation_of_Salaried_employee() {
        department.addEmployee(employee1);
        double montlycomp = employee1.computeMonthlyCompesation();
        Assert.assertEquals(5000, montlycomp, .001);
    }

    @Test
    public void computeMontlyTaxToPay_should_return_tax_taken_out_of_monthly_compesation() {
        department.addEmployee(employee1);
        double monthlyTaxTaken = employee1.computeMonthlyTaxToPay();
        Assert.assertEquals(1500, monthlyTaxTaken, .001);
    }
}