// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
// и возвращает значение этого элемента или же указание, что такого элемента нет.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 17 -> такого числа в массиве нет

Console.Clear();
Console.Write("Введите адрес элемента через пробел: ");
string[] st = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);
int x = int.Parse(st[0]), y = int.Parse(st[1]);
int rows = new Random().Next(3, 9);
int columns = new Random().Next(3, 9); //rndm array
int[,] GetArray(int rows, int columns)
{
    int[,] res = new int[rows, columns];
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            res[i, j] = new Random().Next(10); //rndm fill
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
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}
PrintArray(array);
void PrintRes()
{
    if (x > array.GetLength(0) || y > array.GetLength(1))
    {
        Console.WriteLine($"Адрес элемента [{x}, {y}] -> не существует");
    }
    else Console.WriteLine($"Адрес элемента [{x}, {y}] -> {array[x - 1, y - 1]}");
}
PrintRes();