﻿// Задача 19
// Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.
// 14212 -> нет
// 12821 -> да
// 23432 -> да
Console.Clear();
Console.Write("Введите 5-значное число: ");
int x = int.Parse(Console.ReadLine());
if (x<10000 || x>99999) {
    Console.WriteLine("Введено неверное число");
    return;
}
int x1 = x/10000;
int x2 = (x/1000)%10;
int x3 = (x%100)/10;
int x4 = x%10;
if (x1 == x4 && x2 == x3) {
    Console.WriteLine($"Число {x} является палиндромом");
}
else {
   Console.WriteLine($"Число {x} не является палиндромом");
}