//Напишите программу, которая перевернёт одномерный массив
//(последний элемент будет на первом месте, а первый - на последнем и т.д.)
Console.Clear();
int[] startArray = GetArray(10, 0, 10);
Console.WriteLine($"[{String.Join(", ", startArray)}]");
int[] GetArray(int size, int minValue, int maxValue) {
    int[] res = new int[size];

    for (int i = 0; i < size; i++) {
        res[i] = new Random().Next(minValue, maxValue + 1);
    }
    return res;
}
void ReversArray(int[] array) {
    int[] reversArray = new int[array.Length];
    for (int i = 0; i < array.Length / 2; i ++) {
        int temp = array[i];
        array[i] = array[array.Length - 1 - i];
        array[array.Length - 1 - i] = temp;
    }
}
ReversArray(startArray);
Console.WriteLine($"[{String.Join(", ", startArray)}]");