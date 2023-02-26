//69.
//Напишите программу, которая на вход принимает два числа A и B, 
//и возводит число А в целую степень B с помощью рекурсии.
Console.Clear();
Console.Write("Введите число A: ");
int m = int.Parse(Console.ReadLine());
Console.Write("Введите степень B: ");
int n = int.Parse(Console.ReadLine());
Console.WriteLine(MathPow(m, n));
int MathPow(int number, int rank)
{
    if (rank == 0) return 1;
    return (MathPow(number, rank - 1) * number);
}