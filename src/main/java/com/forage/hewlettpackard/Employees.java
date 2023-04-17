package com.forage.hewlettpackard;

// For this task, you can hard code the list of employees into your system

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeesList = new ArrayList<>();

    public Employees() {
        employeesList.add(new Employee("1", "john", "doe", "test@email.com", "tech"));
        employeesList.add(new Employee("2", "jane", "does", "test@email.com", "tech"));
        employeesList.add(new Employee("3", "joe", "doea", "test@email.com", "tech"));
        employeesList.add(new Employee("4", "joff", "doee", "test@email.com", "tech"));
    }

    public List<Employee> getAllEmployees() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }
}
