import sem6hw.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

public class NumberListAnalyzerTest {
    //Тесты проверяют взаимодействие в различных случаях с массивами, есть простые юнит тесты,
    // проверка метода пограничными значениями и есть интеграционные,
    // проверяют взаимодействие в программе. Выбраны по логике с семинаров.
    // Названия тестов позволяют понять, что они тестируют.
    @Test
    public void testCompareAverage() {
        NumberListAnalyzer analyzer = new NumberListAnalyzer();

        String message1 = analyzer.compareAverage(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        assertEquals("Второй список имеет большее среднее значение", message1);

        String message2 = analyzer.compareAverage(Arrays.asList(1, 2, 3), Arrays.asList(1, 1, 1));
        assertEquals("Первый список имеет большее среднее значение", message2);

        String message3 = analyzer.compareAverage(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1));
        assertEquals("Средние значения равны", message3);
    }
    @Test
    public void testCalculateAverageWithEmptyList() {
        NumberListAnalyzer analyzer = new NumberListAnalyzer();
        double average = analyzer.calculateAverage(Arrays.asList());
        assertEquals(0.0, average);
    }
    @Test
    public void testCalculateAverageWithPositiveNumbers() {
        NumberListAnalyzer analyzer = new NumberListAnalyzer();
        double average = analyzer.calculateAverage(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(3.0, average);
    }
    @Test
    public void testCalculateAverageWithNegativeNumbers() {
        NumberListAnalyzer analyzer = new NumberListAnalyzer();
        double average = analyzer.calculateAverage(Arrays.asList(-1, -2, -3, -4, -5));
        assertEquals(-3.0, average);
    }

    @Test
    public void testCalculateAverageWithMixedNumbers() {
        NumberListAnalyzer analyzer = new NumberListAnalyzer();
        double average = analyzer.calculateAverage(Arrays.asList(1, -2, 3, -4, 5));
        assertEquals(0.6, average, 0.001);
    }
    @Test
    public void testCompareAverageWithEmptyLists() {
        NumberListAnalyzer analyzer = new NumberListAnalyzer();
        String result = analyzer.compareAverage(Arrays.asList(), Arrays.asList());
        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareAverageWithOneEmptyList() {
        NumberListAnalyzer analyzer = new NumberListAnalyzer();
        String result = analyzer.compareAverage(Arrays.asList(1, 2, 3), Arrays.asList());
        assertEquals("Первый список имеет большее среднее значение", result);

        result = analyzer.compareAverage(Arrays.asList(), Arrays.asList(1, 2, 3));
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCalculateAverageWithSingleNumber() {
        NumberListAnalyzer analyzer = new NumberListAnalyzer();
        double average = analyzer.calculateAverage(Arrays.asList(5));
        assertEquals(5.0, average);
    }
}
