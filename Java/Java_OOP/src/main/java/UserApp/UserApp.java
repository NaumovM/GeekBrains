package UserApp;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class UserApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные в следующем порядке (разделенные пробелом): " +
                    "Фамилия Имя Отчество Дата рождения Номер телефона Пол");
            String input = scanner.nextLine();
            String[] data = input.split(" ");

            if (data.length != 6) {
                throw new IllegalArgumentException("Неверное количество данных");
            }

            String lastName = data[0];
            String firstName = data[1];
            String patronymic = data[2];
            String dateOfBirth = data[3];
            long phoneNumber = Long.parseLong(data[4]);
            char gender = data[5].charAt(0);

            validateDateFormat(dateOfBirth);
            validateGender(gender);

            String userData = lastName + " " + firstName + " " + patronymic + " "
                    + dateOfBirth + " " + phoneNumber + " " + gender;

            FileWriter fileWriter = new FileWriter(lastName + ".txt", true);
            fileWriter.write(userData + "\n");
            fileWriter.close();
            System.out.println("Данные успешно записаны в файл.");

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл:");
            e.printStackTrace();
        }
    }

    private static void validateDateFormat(String date) {
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new IllegalArgumentException("Неверный формат даты рождения. Ожидается dd.mm.yyyy");
        }
    }

    private static void validateGender(char gender) {
        if (gender != 'm' && gender != 'f') {
            throw new IllegalArgumentException("Неверное значение пола. Ожидается 'f' или 'm'");
        }
    }

}
