﻿//Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.

Console.Clear();
Console.Write("Enter number: ");
int a = int.Parse(Console.ReadLine());
int i = 1;
while (i < a) {
    if (i % 2 == 0) {
        Console.Write($"{i} ");
    }
    i = i + 1;
}