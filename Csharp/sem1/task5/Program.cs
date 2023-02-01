Console.Clear();
Console.Write("Ведите трехзначное число: ");
int a = int.Parse(Console.ReadLine());
if (a < 100 || a > 999) {
    Console.WriteLine("Введено неверное число.");
    return;
}
int b = a % 10;
Console.WriteLine($"Последняя цифра {b}");