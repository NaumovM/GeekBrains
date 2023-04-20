# 25'. Напишите программу, которая принимает на вход строку,
# и отслеживает, сколько раз каждый символ уже встречался.
# Количество повторов добавляется к символам с помощью постфикса формата _n.
# Порядок символов исходной строки не меняется.
# Input: a a a b c a a d c d d
# Output: a a_1 a_2 b c a_3 a_4 d c_1 d_1 d_2

string = input('Введите символы через пробел: ').split()
d = dict()
for i in string:
    if i in d:
        print(f'{i}_{d[i]}', end=' ')
    else:
        print(i, end=' ')
    d[i] = d.get(i, 0) + 1

sequence = ' a a b a c d'.split()
res = ''
for i in range(len(sequence)):
    if sequence[0:i:].count(sequence[i]) == 0:
        res += sequence[i]
    else:
        res += f'{sequence[i]}_{sequence[0:i:].count(sequence[i])}'
print(res)
