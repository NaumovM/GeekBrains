﻿// Задача 15: Напишите программу, которая принимает на вход цифру,
// обозначающую день недели, и проверяет, является ли этот день выходным.

Console.Clear();
Console.Write("Введите число от 1 до 7: ");
int a = int.Parse(Console.ReadLine());
if (a < 1 || a > 7) {
    Console.WriteLine("Введено неверное число");
    return;
}
else if (a == 6 || a == 7) {
    Console.WriteLine($"{a} - это выходной.");
}
else {
    Console.WriteLine($"{a} - это рабочий");
}