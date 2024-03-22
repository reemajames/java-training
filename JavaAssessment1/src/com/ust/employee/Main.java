package com.ust.employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Sarah Jacob");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John"));
        System.out.println(employee);
    }
}