import java.util.Scanner;
public class sem2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите первую строку: ");
//        String str1 = in.nextLine();
//        System.out.println("Введите вторую строку: ");
//        String str2 = in.nextLine();
//        StringBuilder builder = new StringBuilder(str2);
//        str2 = builder.reverse().toString();
//        if (str1.equals(str2)) System.out.println("Да");
//        else System.out.println("Нет");
//    }

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("3+53=56");
        int x = builder.indexOf("=");
        builder.replace(x, x+1, "равно");
        System.out.println(builder);
    }
}
