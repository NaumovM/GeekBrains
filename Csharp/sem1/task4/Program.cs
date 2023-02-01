Console.Clear();
Console.Write("Ведите число: ");
int a = int.Parse(Console.ReadLine());
int b = (-a);
while(b <= a) {
    Console.Write($"{b} ");
    b++;
}