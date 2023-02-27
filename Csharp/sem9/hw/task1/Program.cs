// Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.
// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30
// 4+5+6+7+8   
Console.Clear();
Console.Write("Введите число M: ");
int m = int.Parse(Console.ReadLine());
Console.Write("Введите число N: ");
int n = int.Parse(Console.ReadLine());
if (m > n)
{
    int t = n;
    n = m;
    m = t;
}
Console.Write(SumNumbers(m, n));

int SumNumbers(int start, int end)
{
    while (start == end + 1) return 0;
    return (start + SumNumbers(start + 1, end));
}
