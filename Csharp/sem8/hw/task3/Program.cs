// Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. 
// Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.
// Массив размером 2 x 2 x 2
// 66(0,0,0) 25(0,1,0)
// 34(1,0,0) 41(1,1,0)
// 27(0,0,1) 90(0,1,1)
// 26(1,0,1) 55(1,1,1)
Console.Clear();
int rows = new Random().Next(4, 5);
int columns = new Random().Next(4, 5);
int page = new Random().Next(4, 5);
int[,,] GetRandomArray(int rows, int columns, int page)
{
    int[] rndm = new int[rows * columns * page];
    for (int i = 0; i < rndm.GetLength(0); i++)
    {
        rndm[i] = new Random().Next(10, 100);
        if (i >= 1)
        {
            for (int j = 0; j < i; j++)
            {
                while (rndm[i] == rndm[j])      //подсмортел пару моментов (проверка предидущих значений и перенос из 1мерного в 3мерный)
                {
                    rndm[i] = new Random().Next(10, 100);     
                    j = 0;
                }
            }
        }
    }
    int count = 0;
    int[,,] result = new int[rows, columns, page];
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            for (int k = 0; k < page; k++)
            {
                result[i, j, k] = rndm[count];
                count++;
            }
        }
    }
    return result;
}
int[,,] array = GetRandomArray(rows, columns, page);
void PrintArray(int[,,] array)
{
    for (int k = 0; k < array.GetLength(0); k++)
    {
        for (int i = 0; i < array.GetLength(1); i++)
        {
            for (int j = 0; j < array.GetLength(2); j++)
            {
                Console.Write($"{array[i, j, k]}({i},{j},{k}) ");
            }
            Console.WriteLine();
        }
        Console.WriteLine();
    }
}
PrintArray(array);
Console.WriteLine();



// straight fill with count;
// Console.Clear();
// int rows = new Random().Next(4, 5);
// int columns = new Random().Next(4, 5);
// int page = new Random().Next(4, 5);
// int[,,] GetArray(int rows, int columns, int page)
// {
//     int[,,] res = new int[rows, columns, page];
//     int count = 0;
//     for (int i = 0; i < rows; i++)
//     {
//         for (int j = 0; j < columns; j++)
//         {
//             for (int k = 0; k < page; k++)
//             {
//                 res[i, j, k] = 10 + count;
//                 count++;
//             }
//         }
//     }
//     return res;
// }
// int[,,] array = GetArray(rows, columns, page);
// void PrintArray(int[,,] array)
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             for (int k = 0; k < array.GetLength(2); k++)
//             {
//                 Console.Write($"{array[i, j, k]}({i}, {j}, {k}) ");
//             }
//             Console.WriteLine();
//         }
//     }
// }
// PrintArray(array);
// Console.WriteLine();

