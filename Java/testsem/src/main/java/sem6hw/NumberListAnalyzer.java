package sem6hw;
import java.util.List;

public class NumberListAnalyzer {
    public String compareAverage(List<Integer> list1, List<Integer> list2) {
        double avg1 = calculateAverage(list1);
        double avg2 = calculateAverage(list2);

        if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avg1 < avg2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    public double calculateAverage(List<Integer> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }
}

