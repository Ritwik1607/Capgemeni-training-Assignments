package assessment1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> employees = EmployeeRepository.getEmployees();

    // Q1. To Calculate average salary
    public double calculateAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    // Q2. Find employee with maximum salary in each department
    public Map<String, Optional<Employee>> findMaxSalaryEmployeeByDepartment() {

        return employees.stream()
                .filter(emp -> emp.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment().getDepartmentName(),
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));
    }

    // Q3. Calculate total salary per department
    public Map<String, Double> calculateTotalSalaryByDepartment() {

        return employees.stream()
                .filter(emp -> emp.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment().getDepartmentName(),
                        Collectors.summingDouble(Employee::getSalary)
                ));
    }

    // Q4.To Display employee name and salary
    public List<String> displayEmployeeNameAndSalary() {

        return employees.stream()
                .map(emp -> emp.getFirstName() + " " + emp.getLastName()
                        + " - " + emp.getSalary())
                .collect(Collectors.toList());
    }

    // Q5.To Sort by salary in descending order
    public List<Employee> sortBySalaryDescending() {

        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }
}