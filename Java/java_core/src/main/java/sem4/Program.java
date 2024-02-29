package sem4;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(1000);        //начальный баланс здесь
        try {
            account.deposit(500);                       //здесь можно вызвать исключения
            account.withdraw(700);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
