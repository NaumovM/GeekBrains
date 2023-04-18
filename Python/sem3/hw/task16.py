# Требуется вычислить, сколько раз встречается некоторое число X в массиве A. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*

# 5
#     1 2 3 4 5
#     3
#     -> 1

a = list(map(int, input('Введите список чисел через пробел: ').split()))
x = int(input('Введите число для поиска: '))
count = 0 
for i in a:
    if i == x:
        count += 1 #я устал смотреть в питон
print(count)


# from random import randint
# len_nums = int(input('Enter list length: '))
# nums = [randint(1, 100) for i in range(len_nums)]
# print('List: ', *nums)
# x = int(input('Enter x: '))
# print(f'{x} find in list {nums.count(x)} times')
# print(f'{x} find in list {len([i for i in nums if i == x])} times')