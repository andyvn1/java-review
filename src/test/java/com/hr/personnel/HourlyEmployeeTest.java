package com.hr.personnel;

import com.hr.personnel.Department;
import com.hr.personnel.client.HourlyEmployee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    private HourlyEmployee employee1;
    private Department department;

    @Before
    public void setUp() throws Exception {
        employee1 = new HourlyEmployee("Juan", LocalDate.of(2022,5,16), 180, 40.00);
        department = new Department("marketing");
    }

    @Test
    public void computeMonthlyCompesation_should_give_monthly_compensation_of_hourly_employee() {
        department.addEmployee(employee1);
        double montlycomp = employee1.computeMonthlyCompesation();
        Assert.assertEquals(7200, montlycomp, .001);
    }
    @Test
    public void computeMontlyTaxToPay_should_return_tax_taken_out_of_monthly_compesation() {
        department.addEmployee(employee1);
        double monthlyTaxTaken = employee1.computeMonthlyTaxToPay();
        Assert.assertEquals(1800, monthlyTaxTaken, .001);
    }
}