# 37. Дано натуральное число *N* и последовательность
# из *N* элементов. Требуется вывести эту последовательность
# в обратном порядке.

# ***Примечание.*** В программе запрещается объявлять
# массивы и использовать циклы (даже для ввода и вывода).
# 5 | 1 2 3 4 5 -> 5 4 3 2 1

def revers(num):
    n = input("Введите число: ")
    if num == 1:
        return n
    return revers(num - 1) + f" {n}"

print(revers(int(input("Введите длину: "))))