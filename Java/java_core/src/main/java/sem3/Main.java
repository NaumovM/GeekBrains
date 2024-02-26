package sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Freelancer("Freelancer 1", 30));
        employees.add(new Freelancer("Freelancer 2", 5));
        employees.add(new Worker("Worker 1", 5000));
        employees.add(new Worker("Worker 2", 1800));

        for (Employee employee : employees) {
            System.out.println("Имя: " + employee.getName() + ", Среднемесячная заработная плата: " + employee.calculateAverageMonthlySalary());
        }

        Collections.sort(employees, Comparator.comparingDouble(Employee::calculateAverageMonthlySalary).reversed());

        for (Employee employee : employees) {
            System.out.println("Имя: " + employee.getName() + ", Среднемесячная заработная плата: " + employee.calculateAverageMonthlySalary());
        }
    }
}
