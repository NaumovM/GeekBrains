# 9. По данному целому неотрицательному n
# вычислите значение n!. N! = 1 * 2 * 3 * … * N
# (произведение всех чисел от 1 до N) 0! = 1
# Решить задачу используя цикл while

n = int(input('Введите число: '))
faktorial = n
if n == 0:
    print(1)
    #break
while n > 1:
    n = n - 1
    faktorial = faktorial * n
print (faktorial)