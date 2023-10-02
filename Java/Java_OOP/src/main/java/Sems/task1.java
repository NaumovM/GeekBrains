package Sems;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        float number = getFloatInput();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloatInput() {
        float number = 0.0f;
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            try {
                number = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введено некорректное значение. Повторите ввод.");
                scanner.nextLine();
            }
        }
        return number;
    }
}
