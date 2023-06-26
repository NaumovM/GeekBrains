import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sem5_hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Имя Фамилия Телефон");
        System.out.println("Для окончания ввода введите пустую строку");

        Map<String, String> phoneBook = new HashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] inputParts = input.split(" ");

            String name = inputParts[0] + " " + inputParts[1];
            String phone = inputParts[2];

            if (phoneBook.containsKey(name)) {
                phone = phoneBook.get(name) + ", " + phone;
            }

            phoneBook.put(name, phone);
        }

        Map<String, String> sortedPhoneBook = new TreeMap<>(Comparator.reverseOrder());
        sortedPhoneBook.putAll(phoneBook);

        for (String name : sortedPhoneBook.keySet()) {
            System.out.println(name + ": " + sortedPhoneBook.get(name));
        }
    }
}