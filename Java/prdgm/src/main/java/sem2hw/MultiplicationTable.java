package sem2hw;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 12;  // Пример n

        printMultiplicationTable(n);
    }

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
                System.out.println(1 + " * " + i + " = " + (1 * i));
        }
    }
}

