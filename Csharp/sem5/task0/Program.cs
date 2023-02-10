//Задайте массив из 12 элементов, заполненный случайными числами из промежутка [-9, 9].
//Найдите сумму отрицательных и положительных элементов массива.
int[] array = GetArray(12, -9, 9);
int[] GetArray(int size, int minValue, int maxValue)
{
    int[] res = new int[size];

    for (int i = 0; i < size; i++)
    {
        res[i] = new Random().Next(minValue, maxValue + 1);
    }
    return res;
}
Console.WriteLine($"[{String.Join(", ", array)}]");
//int minusSum(int[] array){
//     int minus = 0;
//     for(int i = 0; i < array.Length; i++){
//         if(array[i] < 0) {
//             minus += (array[i]);
//         }
//     }
//     return minus;
// }
//int plusSum(int[] array){
//     int plus = 0;
//     for(int i = 0; i < array.Length; i++){
//         if(array[i] > 0) {
//             plus += (array[i]);
//         }
//     }
//     return plus;
// }
// Console.WriteLine($"Сумма отрицательных чисел равна {minusSum(array)}");
// Console.WriteLine($"Сумма положительных чисел равна {plusSum(array)}");
int plusSum = 0;
int minusSum = 0;
foreach (int i in array) {
    plusSum += i > 0 ? i : 0;
    minusSum += i < 0 ? i : 0;
}
Console.WriteLine($"Сумма отрицательных чисел равна {minusSum}, Сумма положительных чисел равна {plusSum}");