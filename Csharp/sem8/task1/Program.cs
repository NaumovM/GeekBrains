// **Задача 55:**Задайте двумерный массив.
// Напишите программу, которая заменяет строки на столбцы.
// В случае, если это невозможно, программа должна вывести сообщение для пользователя.
Console.Clear();
int rows = new Random().Next(4, 6);
int columns = new Random().Next(4, 6); //rndm array
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
void rowsandcolumns(int[,] array)
{
    if (rows != columns)
    {
        Console.WriteLine("В данной матрице нельзя заменить элементы");
        return;
    }
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = i; j < array.GetLength(1); j++)
        {
            int temp = array[j, i];
            array[j, i] = array[i, j];
            array[i, j] = temp;
        }
    }
}
rowsandcolumns(array);
PrintArray(array);
 