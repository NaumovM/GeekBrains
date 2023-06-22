import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class sem4 {
    public static void main(String[] args) {
        ArrayList<String> listData = new ArrayList<>();
        String str = "Hello";
        Scanner in = new Scanner(System.in);
        while (!str.equals("Exit")) {
            System.out.println("Введите ФИО, Возраст, Пол: ");
            str = in.nextLine();
            if (!str.equals("Exit")) {
                String[] tmp = new String[3];
                tmp = str.split(", ");
                String[] fio = new String[3];
                fio = tmp[0].split(" ");
                String itog = tmp[1] + fio[0] + " " + fio[1].toUpperCase().charAt(0) + "." +
                        fio[2].toUpperCase().charAt(0) + ". " + tmp[1] + " " + tmp[2];
                listData.add(itog);
            }
        }
        listData.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int r = Integer.parseInt(o1.split(" ")[2]) - Integer.parseInt(o2.split(" ")[2]);
                return r;
            }
        });
        for (int i = 0; i < listData.size(); i++) {
            System.out.println(listData.get(i).substring(2));
        }
    }
}
