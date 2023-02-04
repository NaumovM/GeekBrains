// Напишите программу, 
// которая принимает на вход координаты двух точек и находит 
// расстояние между ними в 2D пространстве.

// A (3,6); B(2, 1)-> 5,09
// A(7, -5); B(1, -1)-> 7,21
//sqrt((3 - 2)^2 + (6 - 1)^2) = 5.09
//double s = Math.Sqrt(...);
Console.Clear();
Console.Write("Введите координаты первой точки по иксу: ");
int x1 = int.Parse(Console.ReadLine());
Console.Write("Введите координаты первой точки по игрику: ");
int y1 = int.Parse(Console.ReadLine());
Console.Write("Введите координаты второй точки по иксу: ");
int x2 = int.Parse(Console.ReadLine());
Console.Write("Введите координаты второй точки по игрику: ");
int y2 = int.Parse(Console.ReadLine());
double s = Math.Sqrt(Math.Pow(x1 - x2, 2) + Math.Pow(y1 - y2, 2));
Console.WriteLine($"s={s:f3}");