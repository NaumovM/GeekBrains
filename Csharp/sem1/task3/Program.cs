Console.Clear();
Console.Write("Ведите номер дня недели: ");
int dayOfWeek = int.Parse(Console.ReadLine());
if (dayOfWeek == 1) {Console.WriteLine("Понедельник");}
else if (dayOfWeek == 2) {Console.WriteLine("Вторник");}
else if (dayOfWeek == 3) {Console.WriteLine("Среда");}
else if (dayOfWeek == 4) {Console.WriteLine("Четверг");}
else if (dayOfWeek == 5) {Console.WriteLine("Пятница");}
else if (dayOfWeek == 6) {Console.WriteLine("Суббота");}
else if (dayOfWeek == 7) {Console.WriteLine("Воскресенье");}
else {Console.WriteLine("Неверное число");}