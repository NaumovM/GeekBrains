# 31. Последовательностью Фибоначчи называется
# последовательность чисел a0, a1, ..., an, ..., где
# a0 = 0, a1 = 1, ak = ak-1 + ak-2 (k > 1).
# Требуется найти N-е число Фибоначчи

def fib(number):
    if number == 0 or number == 1:
        return 1
    return fib(number - 1) + fib(number - 2)
print(fib(int(input("Введите число: "))- 2))