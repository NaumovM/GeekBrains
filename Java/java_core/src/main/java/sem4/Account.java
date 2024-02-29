package sem4;

public class Account {
    private double balance;

    /**
     * Конструктор создания начального баланса с проверкой на положительное число
     * @param initialBalance - сумма начального баланса
     */
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть негативным");
        }
        this.balance = initialBalance;
    }

    /**
     * Метод депозита с проверкой на положительное число
     * @param amount - сумма депозита
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Депозит не может быть негативным");
        }
        balance += amount;
        System.out.println("Депозит: " + amount);
    }

    /**
     * Метод вывода средств с проверкой на положительное число и достаточность баланса
     * @param amount - сумма вывода
     * @throws InsufficientFundsException
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма вывода не может быть негативной");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств. Баланс: " + balance);
        }
        balance -= amount;
        System.out.println("Вывод: " + amount);
    }
}
