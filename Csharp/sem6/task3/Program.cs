/*Задача 45: Напишите программу,
которая будет создавать копию заданного массива с помощью поэлементного копирования.*/
Console.Clear();
int[] startArray = GetArray(10, 0, 10);
int[] copyArray = CopyArray(startArray);
Console.WriteLine($"[{String.Join(", ", startArray)}]");
Console.WriteLine($"[{String.Join(", ", copyArray)}]");
int[] GetArray(int size, int minValue, int maxValue) {
    int[] res = new int[size];

    for (int i = 0; i < size; i++) {
        res[i] = new Random().Next(minValue, maxValue + 1);
    }
    return res;
}
int[] CopyArray(int[] array) {
    int[] CopyArray = new int[array.Length];
    for (int i = 0; i < array.Length; i ++) {
        CopyArray[i] = array[i];
    }
    return CopyArray;
}
