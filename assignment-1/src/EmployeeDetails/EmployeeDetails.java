package EmployeeDetails;
import java.util.*;
class Employee {
    private String id;
    private String name;
    private double salary;
    private String department;
    public Employee(String id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("211475", "Liza George", 35000, "Operations"));
        employees.add(new Employee("211476", "Philip Thomas", 40000, "Finance"));
        employees.add(new Employee("211477", "Rahul Suresh", 45000, "Human Resources"));
        employees.add(new Employee("211475", "Liza George", 35000, "Operations"));
        Set<String> employeeIds = new HashSet<>();
        for (Employee employee : employees) {
            employeeIds.add(employee.getId());
        }
        List<String> sortedEmployeeIds = new ArrayList<>(employeeIds);
        Collections.sort(sortedEmployeeIds, Collections.reverseOrder());
        Map<String, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            employeeMap.put(employee.getId(), employee);
        }
        for (String id : sortedEmployeeIds) {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Details: " + employeeMap.get(id));
        }
    }
}