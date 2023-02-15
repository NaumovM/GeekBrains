// Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 3
Console.Clear();
Console.Write("Введите числа через пробел: ");
string[] st = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);
int[] FromStringToInt(string[] array) {
    int[] intArray = new int[array.Length];
    for (int i = 0; i < array.Length; i ++) {
        intArray[i] = int.Parse(array[i]);
    }
    return intArray;
}
int[] intArray = FromStringToInt(st);
int PositiveCount(int[] array) {
    int count = 0;
    foreach (var el in array) {
        count += el > 0 ? 1 : 0;
    }
    return count;
}
Console.WriteLine($"Чисел больше 0: {PositiveCount(intArray)}");