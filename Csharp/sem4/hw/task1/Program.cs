// Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
// 452 -> 11
// 82 -> 10
// 9012 -> 12
Console.Clear();
Console.Write("Введите число: ");
int num = int.Parse(Console.ReadLine());
int SumNum(int a) {
int result = 0; 
    while(a > 0) {
        int a1 = 0;
        a1 = a % 10;
        result += a1;
        a /= 10;
    }
    return result;
}
Console.WriteLine($"Сумма цифр в числе {num} равна {SumNum(num)}");