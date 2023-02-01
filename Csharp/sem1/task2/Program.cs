Console.Clear();
Console.Write("Ведите первое число: ");
int a = int.Parse(Console.ReadLine());
Console.Write("Ведите второе число: ");
int b = int.Parse(Console.ReadLine());
if( b * b == a) {
    Console.WriteLine("Да");
}
else {
    Console.WriteLine("Нет");
}