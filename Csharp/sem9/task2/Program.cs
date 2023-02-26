//67.Напишите программу, которая будет принимать на вход 
//число и возвращать сумму его цифр.

Console.Clear();
Console.Write("Введите число M: ");
int m = int.Parse(Console.ReadLine());
Console.WriteLine($"{m} -> {SumNumbers(m)}");
int SumNumbers(int num)
{
    if (num == 0)
    {
        return 0;
    }
    return (num % 10 + SumNumbers(num / 10));
}