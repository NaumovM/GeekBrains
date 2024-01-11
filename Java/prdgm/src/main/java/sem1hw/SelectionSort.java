package sem1hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionSort {            //Imperative
    public static void selectionSortDescending(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = numbers[maxIndex];
            numbers[maxIndex] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static void sortDescending(int[] numbers) {  //Declarative
        List<Integer> numberList = Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new));
        Collections.sort(numberList, Collections.reverseOrder());
        numberList.toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        selectionSortDescending(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        sortDescending(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

}

