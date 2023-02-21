// /* **Задача 57:**Составить частотный словарь элементов
// двумерного массива. Частотный словарь содержит информацию о том,
// сколько раз встречается элемент входных данных.
Console.Clear();
int rows = new Random().Next(3, 4);
int columns = new Random().Next(3, 4); //rndm array
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

int[] MonoArray(int[,] array)
{
    int[] monoArray = new int[array.GetLength(0) * array.GetLength(1)];
    int index = 0;
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            monoArray[index] = array[i, j];
            index++;
        }
    }
    return monoArray;
}
int[] monoArray = MonoArray(array);
Console.WriteLine(String.Join(", ", monoArray));

void SortArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        for (int j = i + 1; j < array.Length; j++)
        {
            if (array[i] > array[j])
            {
                int k = array[i];
                array[i] = array[j];
                array[j] = k;
            }
        }
    }
}
SortArray(monoArray);
Console.WriteLine(String.Join(", ", monoArray));
void PrintData(int[] array)
{
    int el = array[0];
    int count = 1;
    for (int i = 1; i < array.Length; i++)
    {
        if (array[i] != el)
        {
            Console.WriteLine($"{el} встречается {count}");
            el = array[i];
            count = 1;
        }
        else
        {
            count++;
        }
    }
    Console.WriteLine($"{el} встречается {count}");
}
PrintData(monoArray);
