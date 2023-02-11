// Доп
// Задача 37:Найдите произведение пар чисел в одномерном массиве.
// Парой считаем первый и последний элемент, второй и предпоследний и т.д.
// Результат запишите в новом массиве.
// [1 2 3 4 5] -> 5 8 3
// [6 7 3 6]-> 36 21
Console.Clear();
Console.Write("Введите элементы массива через пробел: ");
string elements = Console.ReadLine();
int[] baseArray = GetArrayFromString(elements);
int[] GetArrayFromString(string stringArray) {
    string[] nums = stringArray.Split(" ", StringSplitOptions.RemoveEmptyEntries);
    int[] res = new int[nums.Length];

    for (int i = 0; i < nums.Length; i++) {
        res[i] = int.Parse(nums[i]);
    }
    return res;
}
int[] multiplication = multiArray(baseArray);
int[] multiArray(int[] baseArray) {
    if(baseArray.Length % 2 == 0) {        // если массив чётной длины
        int[] res = new int[baseArray.Length / 2];
        for (int i = 0 ; i < baseArray.Length / 2; i++) {
            res[i] = baseArray[i] * baseArray[baseArray.Length - 1 - i] ;  
        }
        return res;
    }
    else {                      // если массив не четной длины, доб. в последний индекс нечетную середину
        int[] res = new int[(baseArray.Length + 1) / 2];      
        for (int i = 0 ; i < baseArray.Length / 2; i++) {       
            res[i] = baseArray[i] * baseArray[baseArray.Length - 1 - i];
        }
        res[res.Length - 1] = baseArray[baseArray.Length / 2];
        return res;
    }
}
Console.WriteLine($"[{String.Join(", ", multiplication)}]");
// задача очень тяжело далась, возможно не оптимальное решение