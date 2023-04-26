# 35. Напишите функцию, которая принимает
# одно число и проверяет, является ли оно простым

# *Напоминание: Простое число - это число,
# которое имеет 2 делителя: 1  и n(само число)*
# 5 -> Yes (имеет делители: 5, 1)
# 4 -> No (имеет делители: 2, 1, 4)
# 9 -> No (имеет делители: 1, 3, 9)

def prime(num):
    for i in range(2, num - 1):
        if num % i == 0:
            return('No')
    return('Yes')

n = int(input("Введите число: "))
print(prime(n))

print(prime(11))
for i in range(100):
    if prime(i) == 'yes':
        print(i, end=' ')