// Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
// Например, на выходе получается вот такой массив:
// 01 02 03 04
// 12 13 14 05
// 11 16 15 06
// 10 09 08 07
Console.Clear();
int rows = 4;
int columns = rows;
int[,] matrix = new int[rows, columns];
void SpiralMatrix(int[,] matrix)
{
    int count = 1;
    int i = 0;
    int j = 0;
    while (count <= matrix.GetLength(0) * matrix.GetLength(1))  //немного подсмотрел принцип
    {
        matrix[i, j] = count;
        count++;
        if (i <= j + 1 && i + j < columns - 1)
            j++;
        else if (i < j && i + j >= rows - 1)
            i++;
        else if (i >= j && i + j > columns - 1)
            j--;
        else
            i--;
    }
}
SpiralMatrix(matrix);
void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            if (array[i, j] < 10)
            {
                Console.Write($"0{array[i, j]} ");
            }
            else
                Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}
PrintArray(matrix);



// 01 02 03 04  00 01 02 03
// 12 13 14 05  10 11 12 13
// 11 16 15 06  20 21 22 23
// 10 09 08 07  30 31 32 33

// i   j
// 0   0 <=+1
// 0   1 <=+1
// 0   2 <=+1
// 0   3 <=+1
// 1   3 <
// 2   3 <
// 3   3 <
// 3   2 >=
// 3   1 >=
// 3   0 >=
// 2   0 else
// 1   0 else
// 1   1 <=+1
// 1   2 <=+1
// 2   2 >=
// 2   1 <