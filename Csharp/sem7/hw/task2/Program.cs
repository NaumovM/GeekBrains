﻿// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.
Console.Clear();
int rows = new Random().Next(3, 9);
int columns = new Random().Next(3, 9); //rndm array
int[,] GetArray(int rows, int columns)
{
    int[,] res = new int[rows, columns];
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            res[i, j] = new Random().Next(9); //rndm fill
        }
    }
    return res;
}
int[,] array = GetArray(rows, columns);
void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"|{array[i, j]} |");
        }
        Console.WriteLine();
    }
}
PrintArray(array);
Console.WriteLine();
void PrintAverage()
{
    for (int j = 0; j < array.GetLength(1); j++)
    {
        double average = 0;
        for (int i = 0; i < array.GetLength(0); i++)
        {
            average = average + array[i, j];
        }
        average = average / array.GetLength(0);
        Console.Write($"{average:0.0} ");
    }
}
PrintAverage();