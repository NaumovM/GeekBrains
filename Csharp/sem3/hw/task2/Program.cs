﻿// Задача 23
// Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.
// 3 -> 1, 8, 27
// 5 -> 1, 8, 27, 64, 125
Console.Clear();
Console.Write("Введите число: ");
int x = int.Parse(Console.ReadLine());
int i = 1;
Console.Write($"{x} -> ");
if (x<0) {
    i = x;
    x = -1;
}
while (i <= x){
    Console.Write($"{Math.Pow(i, 3)} ");
    i++;
}
