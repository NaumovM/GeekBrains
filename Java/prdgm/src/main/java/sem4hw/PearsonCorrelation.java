package sem4hw;

public class PearsonCorrelation {
    public static void main(String[] args){
        double[] array1 = {1, 2, 3, 4, 5};
        double[] array2 = {2, 3, 6, 8, 10};

        double correlation = calculatePearsonCorrelation(array1, array2);
        System.out.println("Коэффициент корреляции Пирсона: " + correlation);
    }

    public static double calculatePearsonCorrelation(double[] x, double[] y){
        int n = x.length;
        double sumX = 0;
        double sumY = 0;
        double sumX2 = 0;
        double sumY2 = 0;
        double sumXY = 0;

        for (int i = 0; i < n; i++){
            sumX += x[i];
            sumY += y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
            sumXY += x[i] * y[i];
        }

        double numerator = n * sumXY - sumX * sumY;
        double denominator = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));

        if (denominator == 0) {
            return 0;
        }

        return numerator / denominator;
    }
}