// **Задача 63:** Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от 1 до N.
// N = 5 -> "1, 2, 3, 4, 5"
// N = 6 -> "1, 2, 3, 4, 5, 6"

Console.Clear();
Console.Write("Введите число: ");
int n = int.Parse(Console.ReadLine());

Console.Write(PrintNumbers(n));

string PrintNumbers(int end)
{
    if (end == 1)
    {
        //Console.WriteLine(1);
        return "1";
    }
    string s = PrintNumbers(end-1) + ' ' + end.ToString();
    //Console.WriteLine(s);
    return(s);
}