// Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
// Например, даны 2 матрицы:
// 2 4 | 3 4
// 3 2 | 3 3
// Результирующая матрица будет:
// 18 20
// 15 18
Console.Clear();
int rows = new Random().Next(2, 5);
int columns = rows; //only straight
int[,] GetArray(int rows, int columns)
{
    int[,] res = new int[rows, columns];
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            res[i, j] = new Random().Next(9);
        }
    }
    return res;
}
int[,] matrix1 = GetArray(rows, columns);
int[,] matrix2 = GetArray(rows, columns);
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
PrintArray(matrix1);
Console.WriteLine();
PrintArray(matrix2);
Console.WriteLine();
int[,] MultiMatrix(int[,] m1, int[,] m2)
{
    int[,] multiMatrix = new int[rows, columns];
    for (int i = 0; i < multiMatrix.GetLength(0); i++)
    {
        for (int j = 0; j < multiMatrix.GetLength(1); j++)
        {
            int sum = 0;
            for (int k = 0; k < multiMatrix.GetLength(1); k++) 
            {
                sum += m1[i, k] * m2[k, j];
            }
            multiMatrix[i, j] = sum;
        }
    }
    return multiMatrix;
}
int[,] multiMatrix = MultiMatrix(matrix1, matrix2);
PrintArray(multiMatrix);