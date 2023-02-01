// Задача 13: Напишите программу, которая выводит третью цифру заданного 
// числа или сообщает, что третьей цифры нет.

Console.Clear();
Console.Write("Введите число: ");
int a = int.Parse(Console.ReadLine());
if (a < 100) {
    Console.WriteLine("Третьего числа нет");
    return;
}
else {
    string b = Convert.ToString(a); //не понятно как писать чисто, написал логически.
    Console.WriteLine(b[2]);
}