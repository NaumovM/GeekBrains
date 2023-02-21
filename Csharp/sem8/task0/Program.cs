// Задача 53: Задайте двумерный массив.
// Напишите программу, которая поменяет местами первую и последнюю строку массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// В итоге получается вот такой массив:
// 8 4 2 4
// 5 9 2 3
// 1 4 7 2
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
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}
PrintArray(array);
Console.WriteLine();
int[,] ReversArray(int[,] array)
{
    for (int j = 0; j < array.GetLength(1); j++)
    {
        int[] revers = new int[array.GetLength(1)];
        int i = 0;
        int k = array.GetLength(0) - 1;
        revers[j] = array[i, j];
        array[i, j] = array[k, j];
        array[k, j] = revers[j];
    }
    return array;
}
int[,] reversArray = ReversArray(array);
PrintArray(reversArray);
