package assignment4;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private int experience;
    private double salary;
    private String department;

    public Employee(String name, int age, int experience, double salary, String department) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

public class CompanyEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Smitha", 28, 4, 70000, "DevOps"),
                new Employee("Jessy", 30, 8, 150000, "Marketing"),
                new Employee("Mike", 25, 3, 50000, "HR"),
                new Employee("Tony", 28, 4, 70000, "DevOps"),
                new Employee("Liza", 25, 3, 50000, "HR"),
                new Employee("Santhosh", 30, 8, 150000, "Marketing")
                );

        long totalEmployees = employees.stream().count();
        System.out.println("Total number of employees: " + totalEmployees);

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees grouped by department: " + employeesByDepartment);

        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary paid to all employees: " + totalSalary);

        Map<String, Double> totalSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));
        System.out.println("Total salary paid to employees of each department: " + totalSalaryByDepartment);

        List<Employee> employeesSortedByAge = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by age: " + employeesSortedByAge);

        List<Employee> employeesSortedByExperience = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getExperience))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by experience: " + employeesSortedByExperience);
    }
}
