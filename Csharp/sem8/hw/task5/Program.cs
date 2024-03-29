﻿// Дополнительная задача 61: Вывести первые N строк треугольника Паскаля. Сделать вывод в виде равнобедренного треугольника


// скопировал, чтобы понять, сам не писал, не понял формулу факториалов, хотя не сложная.
Console.Clear();
Console.Write("Введите нужное количество строк треугольника Паскаля: ");
int rows = int.Parse(Console.ReadLine());
PrintTriangle(rows);
//Функция вывода треугольника
void PrintTriangle(int n)
{
    //Цикл для перебора строк треугольника
    for (int i = 0; i < n; i++)
    {
        // создаём после каждой строки n-i отступов от левой стороны консоли, чем ниже строка, тем меньше отступ
        for (int c = 0; c <= (n - i); c++) {
            Console.Write(" . ");
        }
        for (int c = 0; c <= i; c++)
        {
            Console.Write("  . "); // создаём пробелы между элементами треугольника
            Console.Write(factorial(i) / (factorial(c) * factorial(i - c))); //формула вычисления элементов треугольника
        }
        Console.WriteLine(); // после каждой строки с числами отступаем две пустые строчки
    }
}
//Функция для подсчета факториала
float factorial(int n)
{
    float x = 1;
    for (int i = 1; i <= n; i++)
    {
        x *= i;
    }
    return x;
}