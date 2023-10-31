﻿int[] array = { -10, -5, -9, 0, 2, 5, 3, 1, 0, 1 };
int[] sortedArray = CountingSortExtended(array);
Console.WriteLine(string.Join(", ", sortedArray));
// void CountingSort(int[] inputArray)
// {
//     int[] counters = new int[10];
//     for (int i = 0; i < inputArray.Length; i++)
//     {
//         counters[inputArray[i]]++;
//     }
//     int index = 0;
//     for (int i = 0; i < counters.Length; i++)
//     {
//         for (int j = 0; j < counters[i]; j++)
//         {
//             inputArray[index] = i;
//             index++;
//         }
//     }
// }

// CountingSort(array);
// Console.WriteLine(string.Join(", ", array));

int[] CountingSortExtended(int[] inputArray)
{
    int max = inputArray.Max();
    int min = inputArray.Min();
    int offset = -min;
    int[] sortedArray = new int[inputArray.Length];
    int[] counters = new int[max + offset + 1];
    for (int i = 0; i < inputArray.Length; i++)
    {
        counters[inputArray[i] + offset]++;
    }
    int index = 0;
    for (int i = 0; i < counters.Length; i++)
    {
        for (int j = 0; j < counters[i]; j++)
        {
            sortedArray[index] = i - offset;
            index++;
        }
    }
    return sortedArray;
}