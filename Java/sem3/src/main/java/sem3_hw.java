import java.util.ArrayList;
import java.util.Random;

public class sem3_hw {
    public static void main(String[] args) {
        //get random arr
        ArrayList<Integer> list = new ArrayList<>(15);
        Random random = new Random();
        int listLength = 15;
        for (int i = 0; i < listLength; i++) {
            int num = random.nextInt(100);
            list.add(num);
        }
        // del even
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        //find min
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
               min = list.get(i);
            }
        }
        //find max
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        //find avg
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        double avg = sum / (double) list.size();        // Почему если удалить дабл в знаменателе, то результат не будет дробным?
        //find avg2
        double[] sum2 = {0};
        list.forEach(n -> sum2[0] += n);
        sum2[0] /= list.size();                            // А здесь достотчно сделать дабл в массиве и все дробно будет
        //res
        System.out.println("Список после удаления четных чисел: " + list);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
        System.out.println("Среднее значение второй способ: " + sum2[0]);
    }
}