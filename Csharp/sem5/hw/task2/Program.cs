// Задача 34: Задайте массив заполненный
// случайными положительными трёхзначными числами.
// Напишите программу, которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2
Console.Clear();
Console.WriteLine("Введите длину массива: ");
int size = int.Parse(Console.ReadLine());
int[] array = GetArray(size);
int[] GetArray(int size) {
    int[] res = new int[size];
    for (int i = 0; i < size; i++) {
        res[i] = new Random().Next(100, 1000);
    }
    return res;
}
Console.Write($"[{String.Join(", ", array)}] -> ");
int evenCount(int[] array) {
    int evenCount = 0;
    foreach (int i in array) {
        evenCount += i % 2 == 0 ? 1 : 0;
    }
    return evenCount;
}
Console.WriteLine(evenCount(array));