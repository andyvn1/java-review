package com.hr.personnel;

public class Department {

    String name;
    String location;
    Employee[] employees = new Employee[100];
    int currentIndex  = 0;

    public Department(String departmentName) {
    }

    public void addEmployee(com.hr.personnel.Employee employee){
        employees[currentIndex] = employee;
        currentIndex++;

    }
    public int letEmployeedWorkAndReturnNumberOfEmployeesWhoWork(){
        int workers = 0;
        for (int i = 0; i <currentIndex ; i++) {
            String work = employees[i].work();
            if (work.contains("worked"));
           workers ++;

        }
       return workers;
    }
    public double computeDepartmentMonthlyTotalCompensation(){
        double departmentTotalMonthlyCompesation = 0.0;

        for (int i = 0; i <currentIndex ; i++) {
           double employees_comp = employees[i].computeMonthlyCompesation();
            departmentTotalMonthlyCompesation += employees_comp;

        }
        return departmentTotalMonthlyCompesation;
    }
}