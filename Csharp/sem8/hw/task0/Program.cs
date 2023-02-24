// Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию 
// элементы каждой строки двумерного массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// В итоге получается вот такой массив:
// 7 4 2 1
// 9 5 3 2
// 8 4 4 2
Console.Clear();
int rows = new Random().Next(3, 7);
int columns = new Random().Next(3, 7);
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
void SortArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {   
        for (int x = 0; x < array.GetLength(1); x++)
        {
            for (int j = 0; j < array.GetLength(1) - 1; j++)
            {
                if (array[i, j] < array[i, j + 1])
                {
                    int k = array[i, j];
                    array[i, j] = array[i, j + 1];
                    array[i, j + 1] = k;
                }
            }
        }
    }
}
SortArray(array);
PrintArray(array);
