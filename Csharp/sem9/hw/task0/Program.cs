// Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.
// N = 5 -> "5, 4, 3, 2, 1"
// N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1

Console.Clear();
Console.Write("Введите число: ");
int n = int.Parse(Console.ReadLine());

Console.Write(PrintNumbers(n));

string PrintNumbers(int end)
{
    if (end == 1) return end.ToString();
    return (end.ToString() + ' ' + PrintNumbers(end - 1));
}