// **Задача 32:** Напишите программу замена элементов массива: положительные элементы замените на соответствующие отрицательные, и наоборот.
// [-4, -8, 8, 2] -> [4, 8, -8, -2]
int[] startArray = GetArray(12, -9, 9);
int[] GetArray(int size, int minValue, int maxValue)
{
    int[] res = new int[size];

    for (int i = 0; i < size; i++)
    {
        res[i] = new Random().Next(minValue, maxValue + 1);
    }
    return res;
}
Console.WriteLine($"[{String.Join(", ", startArray)}]");
int[] InversArray(int[] array) {
    for (int i = 0; i < array.Length; i++) {
        array[i] *= (-1);
    }
    return array;
};
Console.WriteLine($"[{String.Join(", ", InversArray(startArray))}]");