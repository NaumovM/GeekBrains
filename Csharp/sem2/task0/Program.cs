/*Напишите программу, которая выводит случайное число из отрезка [10, 99] и показывает наибольшую цифру числа.

78 -> 8

12-> 2

85 -> 8*/

Console.Clear();
int a = new Random().Next(10, 100);
int a1 = a / 10;
int a2 = a % 10;
Console.WriteLine($"num = {a}");
Console.WriteLine(a1 > a2 ? $"max = {a1}" : $"max = {a2}");