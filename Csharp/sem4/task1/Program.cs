// 26 Напишите программу,
// которая принимает на вход число и выдаёт количество цифр в числе.
// 456 -> 3
// 78 -> 2
// 89126 -> 5
Console.Clear();
Console.Write("Введите число: ");
int a = int.Parse(Console.ReadLine());
int CountNumbers(int n) {
    int count = 0;
    if (n < 0) 
        n *= (-1);
    while (n > 0) {
        count++;
        n /= 10;
    }
    return count;
}
Console.WriteLine($"Количество цифр = {CountNumbers(a)}");