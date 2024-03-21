package Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ashly", 100000, "Java"));
        employees.add(new Employee(2, "Riya", 80000, "React"));
        employees.add(new Employee(3, "Joyce", 75000, "Python"));
        try {
            Optional<Employee> pythonEmployee = employees.stream()
                    .filter(e -> e.getSkill().equalsIgnoreCase("Python"))
                    .findFirst();
            if (pythonEmployee.isPresent()) {
                System.out.println("Employee with Python skill found:");
                System.out.println("ID: " + pythonEmployee.get().getId());
                System.out.println("Name: " + pythonEmployee.get().getName());
                System.out.println("Salary: " + pythonEmployee.get().getSalary());
                System.out.println("Skill: " + pythonEmployee.get().getSkill());
            } else {
                throw new RuntimeException("No employees with Python skill found.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
