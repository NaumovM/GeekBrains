// Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; 
// значения b1, k1, b2 и k2 задаются пользователем.
// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)
Console.Clear();
Console.Write("Введите b1 k1 b2 k2 через пробел: ");
string[] st = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);
double b1 = double.Parse(st[0]), k1 = double.Parse(st[1]), b2 = double.Parse(st[2]), k2 = double.Parse(st[3]);
double[] Coords(double b1, double k1, double b2, double k2) {
    double[] coord = new double[2];
    double x = (b2 - b1) / (k1 - k2);
    coord[0] = x;
    double y = k2 * ((b2 - b1) / (k1 - k2)) + b2;
    coord[1] = y;
    return coord;
}
double[] coord = Coords(b1, k1, b2, k2);
Console.WriteLine($"[{String.Join(", ", coord)}]");


// y = k1 * x + b1
// y = k2 * x + b2

// y-y = k1 * x + b1 - (k2 * x + b2);
// 0 = k1 * x - k2 * x + b1 - b2;
// k1 * x - k2 * x  = b2 - b1;
// (k1 - k2) * x = b2 - b1
// x = ((b2 - b1) / (k1 - k2))
// y = k2 * ((b2 - b1) / (k1 - k2)) + b2;
