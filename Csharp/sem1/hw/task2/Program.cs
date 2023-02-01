//Задача 6: Напишите программу, которая на вход принимает число и выдает, является ли число четным (делится ли оно на два без остатка).

Console.Clear();
Console.Write("Enter number: ");
int a = int.Parse(Console.ReadLine());
if (a % 2 == 0) {
    Console.WriteLine($"Number {a} is even");
}
else Console.WriteLine($"Number {a} is odd");