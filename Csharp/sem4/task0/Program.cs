//24 Напишите программу, которая принимает на вход число A
// и выдаёт сумму чисел от 1 до A
// a = 5
// sum = 1 + 2 + 3 + 4 + 5
Console.Clear();
Console.Write("Введите число: ");
int a = int.Parse(Console.ReadLine());
int sum(int limit) {
    int sum = 0;
    for(int i = 1; i <= limit; i++) {
        sum += i;
    }
    return sum;
}
Console.WriteLine($"Сумма от 1 до {a} равна {sum(a)}");