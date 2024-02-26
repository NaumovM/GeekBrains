package sem3;

abstract class Employee implements Comparable<Employee> {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public abstract double calculateAverageMonthlySalary();

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(monthlySalary, employee.monthlySalary);
    }
}