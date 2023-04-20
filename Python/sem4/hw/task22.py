# Задача 22: Даны два неупорядоченных набора целых чисел (может быть, с повторениями).
# Выдать без повторений в порядке возрастания все те числа, которые встречаются в обоих наборах.
# Пользователь вводит в строку первый список затем на следующией строке второй список.

string = input('Введите символы через пробел: ').split()
string2 = input('Введите символы через пробел: ').split()
new_set = set()
new_set2= set()
for i in string:
    new_set.add(i)
for i in string2:
    new_set2.add(i)
main_set = new_set & new_set2
list = list(main_set)
list.sort()
print(*list)