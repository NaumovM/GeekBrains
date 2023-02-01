//Задача 4: Напишите программу, которая принимает на вход 
//три числа и выдает максимальное из этих чисел.

Console.Clear();
Console.Write("Enter first number: ");
int a = int.Parse(Console.ReadLine());
Console.Write("Enter second number: ");
int b = int.Parse(Console.ReadLine());
Console.Write("Enter third number: ");
int c = int.Parse(Console.ReadLine());
if (a > b && a > c) {
    Console.WriteLine($"Max = {a}");
}
else if (b > a && b > c) {
    Console.WriteLine($"Max = {b}");
}
else Console.WriteLine($"Max = {c}");