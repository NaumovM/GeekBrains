// Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, 
// которая будет находить строку с наименьшей суммой элементов.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка
Console.Clear();
int rows = new Random().Next(4, 5);
int columns = new Random().Next(4, 5);
int[,] GetArray(int rows, int columns)
{
    int[,] res = new int[rows, columns];
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            res[i, j] = new Random().Next(10);
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
Console.WriteLine();
void PrintMinimal(int[,] array)
{
    int count = 0;
    int sum = 99999;  //костыль, можно заменить на функцию суммы строки, но не критично
    for (int i = 0; i < array.GetLength(0); i++)
    {
        int suminrow = 0;
        for (int j = 0; j < array.GetLength(1); j++)
        {
            suminrow += array[i, j];
        }
        if (suminrow < sum)
        {
            count = i + 1;
            sum = suminrow;
        }
    }
    Console.WriteLine($"Строка с наименьшей суммой элементов - {count}");
}
PrintMinimal(array);