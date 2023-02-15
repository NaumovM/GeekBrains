// **Задача 42:**Напишите программу,
// которая будет преобразовывать десятичное число в двоичное.
// 45 -> 101101
// 3 -> 11
// 2 -> 10
Console.Clear();
Console.Write("Введите число: ");
int number = int.Parse(Console.ReadLine());
string res = DecToNum(number, 2);

Console.WriteLine($"{number}->{res}");

string DecToNum(int decNumber, int otherSystem)
{
    string res = "";
    string nums = "0123456789ABCDEF";
    while (decNumber > 0)
    {
        int ost = decNumber / otherSystem;
        res = nums[decNumber - otherSystem * ost] + res;
        decNumber /= otherSystem;
    }
    return res;
}