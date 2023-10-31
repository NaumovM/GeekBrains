package hw1;

public class Calculator {
//    public static void main(String[] args) {
//        System.out.println(calculateDiscount(100, 10));
//    }
    public static float calculateDiscount(float purchaseAmount, float discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid arguments: negative purchase amount " +
                    "or invalid discount percentage");
        }

        float discount = purchaseAmount * (discountPercentage / 100);
        return purchaseAmount - discount;
    }
}