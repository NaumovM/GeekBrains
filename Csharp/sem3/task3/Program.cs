// Напишите программу, которая принимает на вход число (N)
//  и выдаёт таблицу квадратов чисел от 1 до N.
// 5 -> 1, 4, 9, 16, 25.
// 2 -> 1,4
Console.Clear();
Console.Write("Введите число: ");
int x = int.Parse(Console.ReadLine());
int i = 1;
Console.Write($"{x} -> ");
if (x<0) {
    i = x;
    x = -1;
}
while (i <= x){
    Console.Write($"{Math.Pow(i, 2)} ");
    i++;
}

/*Console.Clear();
Console.Write("Введите число: ");
int x = int.Parse(Console.ReadLine());
int i = 1;
Console.Write($"{x} -> ");
if (x<0) {
    i = x;
    x = -1;
}
int[] result = new int[x];
for(int j = 0; j < x; j++) {
    result[j] = j*j;
}
for(int j = 0; j < x; j++) {
    Console.Write($"{result[j]} ");
}
*/