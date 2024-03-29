﻿// Доп
// Задача 35:Задайте одномерный массив из 123 случайных чисел [0: 1000].
// Найдите количество элементов массива, значения которых лежат в отрезке [10,99].
// Пример для массива из 5, а не 123 элементов. В своём решении сделайте для 123
// [5, 18, 123, 6, 2] -> 1
// [1, 2, 3, 6, 2]-> 0
// [10, 11, 12, 13, 14]-> 5
Console.Clear();
int[] array = GetArray(123, 0, 1000);
int sumElements = 0;
int[] GetArray(int size, int minValue, int maxValue) {
    int[] res = new int[size];

    for (int i = 0; i < size; i++)
    {
        res[i] = new Random().Next(minValue, maxValue + 1);
    }
    return res;
}
int elements(int[] array) {
    foreach(int el in array) {
        sumElements += el > 10 & el < 99 ? 1 : 0; 
    }
    return sumElements;
}
Console.WriteLine($"Количество значений в отрезке [10, 99] = {elements(array)}");