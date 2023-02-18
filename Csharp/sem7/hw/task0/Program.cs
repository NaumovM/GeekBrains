// Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
// m = 3, n = 4.
// 0,5 7 -2 -0,2
// 1 -3,3 8 -9,9
// 8 7,8 -7,1 9

Console.Clear();
Console.Write("Введите количесвто строк: ");
int rows = int.Parse(Console.ReadLine());
Console.Write("Введите количесвто столбцов: ");
int columns = int.Parse(Console.ReadLine());
double[,] GetArray(int rows, int columns, double minValue, double maxValue)
{
    double[,] res = new double[rows, columns];
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            res[i, j] = new Random().NextDouble() * (maxValue - minValue) + minValue; //непонятный принцип нахождения min max
        }
    }
    return res;
}
double[,] array = GetArray(rows, columns, -9, 9);
void PrintArray(double[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]:0.0} ");
        }
        Console.WriteLine();
    }
}
PrintArray(array);