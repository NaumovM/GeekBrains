package sem3;

class Worker extends Employee {
    public Worker(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return getMonthlySalary();
    }
}

