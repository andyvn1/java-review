package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.SalariedEmployee;


import java.time.LocalDate;

class HRClient {
    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("sang", LocalDate.of(2020, 5, 07), 180, 36.0);
        SalariedEmployee employee2 = new SalariedEmployee("mary", LocalDate.of(1999, 1, 3), 5000);
        SalariedEmployee employee3 = new SalariedEmployee("Juan", LocalDate.of(2010, 2, 28), 4000);

        Department department = new Department("marketing");

        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        int numberofEmployeesWhoWorked = department.letEmployeedWorkAndReturnNumberOfEmployeesWhoWork();
        System.out.println("number = " + numberofEmployeesWhoWorked);

        System.out.println("total department compensation is: " +
                department.computeDepartmentMonthlyTotalCompensation());


    }
}