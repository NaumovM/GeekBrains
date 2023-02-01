// Задача 10: Напишите программу, которая принимает на вход трёхзначное число
//  и на выходе показывает вторую цифру этого числа.

Console.Clear();
Console.Write("Введите трехзначное число: ");
int a = int.Parse(Console.ReadLine());
if (a < 100 || a > 999) {
    Console.WriteLine("Не верное число");
    return;
}
int a1 = a / 10;
int a2 = a1 % 10;
Console.WriteLine(a2);