/*Напишите программу, которая будет принимать на вход два числа и выводить, 
является ли второе число кратным первому. Если второе число не кратно числу первому, 
то программа выводит остаток от деления.
*/

Console.Clear();
Console.WriteLine("Enter first number: ");
int a = int.Parse(Console.ReadLine());
Console.WriteLine("Enter second number: ");
int b = int.Parse(Console.ReadLine());
int res = a % b;
if (a % b == 0){
    Console.WriteLine($"{a}, {b} -> кратно.");
}
else {
    Console.WriteLine($"{a}, {b} -> не кратно, остаток {res}");
}