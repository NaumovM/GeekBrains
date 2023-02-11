// Задача 38: Задайте массив вещественных чисел.
// Найдите разницу между максимальным и минимальным элементов массива.
// [3 7 22 2 78] -> 76
Console.Clear();
Console.WriteLine("Введите длину массива: ");
int size = int.Parse(Console.ReadLine());
double[] array = GetArray(size);
double[] GetArray(int size) {
    double[] res = new double[size];
    for (int i = 0; i < size; i++) {
        res[i] = new Random().Next(-100, 101);
    }
    return res;
}
Console.Write($"[{String.Join(", ", array)}] -> "); //массив получается только из целых чисел, не понятно.
double maxmin(double[] array) {
    double min = array[0];
    double max = array[0];
    for (int i = 1; i < array.Length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
        if (array[i] < min) {
            min = array[i];
        }            
    }
    double maxmin = max - min;
    return maxmin;
}
Console.WriteLine(maxmin(array)); //в примере стоят положительные целые числа, в условиях - вещественные (+-дробь). 
                                    //программа работает по логике условий, но не генерирует дробные числа.