// Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m,n) = 9
// m = 3, n = 2 -> A(m,n) = 29
Console.Clear();
Console.Write("Введите число M: ");
int m = int.Parse(Console.ReadLine());
Console.Write("Введите число N: ");
int n = int.Parse(Console.ReadLine());
int Akkerman(int n, int m) //логика функции не совсем понятна(после 3 оператора), логически переписана с мат. языка по формуле из гугла.
{
    if (n == 0) return m + 1;
    else if (m == 0) return Akkerman(n - 1, 1);
    else return (Akkerman((n - 1), Akkerman(n, m - 1)));
}
Console.WriteLine(Akkerman(m, n));