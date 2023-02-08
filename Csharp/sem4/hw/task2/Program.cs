// Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.
// 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
// 6, 1, 33 -> [6, 1, 33]
Console.Clear();
int[] NewArray8() {
    int[] NewArray = new int [8];
    for (int i = 0; i < 8; i++) {
        NewArray[i] = new Random().Next(999);
    }
    return NewArray;
}
int[] array = NewArray8();
Console.Write($"[{String.Join(", ", array)}]");

