// Задача 36: Задайте одномерный массив,
// заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0
Console.Clear();
Console.WriteLine("Введите длину массива: ");
int size = int.Parse(Console.ReadLine());
int[] array = GetArray(size);
int[] GetArray(int size) {
    int[] res = new int[size];
    for (int i = 0; i < size; i++) {
        res[i] = new Random().Next(-100, 101);
    }
    return res;
}
Console.Write($"[{String.Join(", ", array)}] -> ");
int sumodd(int[] array) {
    int sumodd = 0;
    for (int i = 1; i < array.Length; i += 2) {
        sumodd += array[i];
    }
    return sumodd;
}
Console.WriteLine(sumodd(array));