package com.hr.personnel;

import com.hr.personnel.client.HourlyEmployee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {

    private SalariedEmployee employee1;
    private HourlyEmployee employee2;
    private Department department;

    @Before
    public void setUp() throws Exception {
        employee1 = new SalariedEmployee("maria", LocalDate.of(2010, 1, 1), 5000);
        employee2 = new HourlyEmployee("Juan", LocalDate.of(2022,5,16), 180, 40.00);
        department = new Department("marketing");
    }

    @Test
    public void addEmployee_should_add_one_to_the_current_index_on_employee_array() {
           int currentindex = 0;
           department.addEmployee(employee1);
       currentindex = department.currentIndex;
        Assert.assertEquals( 1, currentindex);

        }


    @Test
    public void letEmployeedWorkAndReturnNumberOfEmployeesWhoWork() {
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        int numberWhoWork = department.letEmployeedWorkAndReturnNumberOfEmployeesWhoWork();
        Assert.assertEquals(2, numberWhoWork);
    }

    @Test
    public void computeDepartmentMonthlyTotalCompensation_should_return_total_compensation_of_employee_added() {
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        double departmentTotalMonthlyCompensation = department.computeDepartmentMonthlyTotalCompensation();
        Assert.assertEquals(12200, departmentTotalMonthlyCompensation, .01);
    }
}