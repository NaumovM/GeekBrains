//28 Напишите программу, которая принимает на вход число N
//и выдаёт произведение чисел от 1 до N.
//4-> 24
//5-> 120 == 1 * 2 * 3 * 4 * 5
Console.Clear();
Console.Write("Введите число: ");
int a = int.Parse(Console.ReadLine());
int GetMultiply(int a) {
    int res = 1;
    for (int i = 2; i <= a; i++) {
        res *= i;
    }
    return res;
}
Console.WriteLine($"Произведение чисел от 1 до {a} равно {GetMultiply(a)}");