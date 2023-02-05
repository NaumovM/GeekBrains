 /*//1 
 void Method1() {
    Console.WriteLine("Автор ...");
 }
Method1();

 //2
 void Method2(string msg, int count) {
    int i = 0;
    while (i < count) {
    Console.WriteLine(msg);
    i++;
    }
 }

 Method2("text2", 4);
 //3
 int Method3() {
    return DateTime.Now.Year;
 }
 int year = Method3();
 Console.WriteLine(year);

 //4
 string Method4(int count, string text) {
    int i = 0;
    string result = String.Empty;
    for (int i = 0; i < count; i++) {
        result = result + text;
    }
    return result;
 }
 string res = Method4(10, "asdf");
 Console.WriteLine(res);
 
 ____________________________________________________________________________________*/

 /*for (int i = 2; i <= 10; i++) {
    for (int j = 2; j <=10; j++) {
        Console.WriteLine($"{i} x {j} = {i * j}");
    }
    Console.WriteLine();
 }
 */




// string Replace(string text, char oldValuer, char newValue) {
//     string result = String.Empty;
//     int length = text.Length;
//     for (int i = 0; i < length; i++) {
//         if(text[i]  == oldValue) result = result + $"{newValue}";
//         else result = result + $"{text[i]}";
//     }
//     return result;
// }
// string newText = Replace(text, ' ', '|');
// Console.WriteLine(newText);

int[] arr = {4, 1, 5, 8};
void PrintArray(int[] array) {
    int count = array.Length;
    for(int i = 0; i < count; i++) {
        Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
}

void SelectionSort(int[] array) {
    for(int i = 0; i < array.Length - 1 ; i++) {
        int minPosition = i;
        for(int j = i + 1; j < array.Length; j ++) {
            if(array[j] < array[minPosition]) minPosition = j;
        }
        int temporary = array[i];
        array[i] = array[minPosition];
        array[minPosition] = temporary;
    }

}
PrintArray(arr);
SelectionSort(arr); 

PrintArray(arr);