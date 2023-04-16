# Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*

# 5
#     1 2 3 4 5
#     6
#     -> 5

n = int(input('Введите размер списка: '))
a = list()
i = 1
while i <= n:
    a.append(i)
    i += 1
print(a)
x = int(input('Введите число для поиска: '))

min_dif = x
for i in range(len(a)):
    temp = x - a[i]
    if temp < min_dif and temp >= 0:
        min_dif = temp
        pos = a[i]
print(pos)

    
# Это написал чатгпт, потому что мой синтаксис не подходит к логике питона, хотя смысл программ одинаков.
#  у меня некорректно считало, пока в 24 строке не добавил >= 0 (уходило ниже нуля, хотя ноль минимальная разница)


# a = list(map(int, input().split()))
# x = int(input())

# # Assuming the first element to be the closest
# closest = a[0]

# # Loop through the array
# for i in range(len(a)):
#     # Check if the absolute difference of the current element with x is less than the difference between the closest and x
#     if abs(a[i] - x) < abs(closest - x):
#         closest = a[i]

# # Print the closest element
# print(closest)
