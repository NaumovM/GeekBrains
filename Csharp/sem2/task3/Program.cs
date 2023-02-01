//Напишите программу, которая принимает на вход число и проверяет, кратно ли оно одновременно 7 и 23.

Console.Clear();
Console.WriteLine("Enter first number: ");
int a = int.Parse(Console.ReadLine());
if (a % 7 == 0 && a % 23 == 0) {
    Console.WriteLine($"Число {a} кратно 7 и 23");
}
else {
    Console.WriteLine($"Число {a} не кратно 7 и 23");
}

//Напишите программу, которая принимает на вход два числа и проверяет, является ли одно число квадратом другого.

Console.Clear();
Console.WriteLine("Enter first number: ");
int a = int.Parse(Console.ReadLine());
Console.WriteLine("Enter second number: ");
int b = int.Parse(Console.ReadLine());
if (a * a == b || b * b == a) {
    Console.WriteLine("Да");
}
else {
    Console.WriteLine("Нет");
}