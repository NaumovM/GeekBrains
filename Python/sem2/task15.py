# Иван Васильевич пришел на рынок и решил купить два арбуза:
# один для себя, а другой для тещи. Понятно, что для себя
# нужно выбрать арбуз потяжелей, а для тещи полегче. Но вот незадача:
# арбузов слишком много и он не знает как же выбрать
# самый легкий и самый тяжелый арбуз? Помогите ему!
# Пользователь вводит одно число N – количество арбузов.
# Вторая строка содержит N чисел, записанных на новой строчке каждое.
# Здесь каждое число – это масса соответствующего арбуза.
# Все числа натуральные и не превышают 30000.

# length = int(input('Веедите количество арбузов: '))
# massa1 = int(input('Введите массу арбуза: '))
# min_massa = massa1
# max_massa = massa1
# i = 2
# while i < length:
#     temp = int(input('Введите массу арбуза: '))
#     if temp < min_massa:
#         min_massa = temp
#     if temp > max_massa:
#         max_massa = temp
#     i += 1
# print ('Арбуз с минимальной массой - ', min_massa)
# print ('Арбуз с максимальной массой - ', max_massa)

length = int(input('Введите количество арбузов: '))
lst = []
for i in range(length):
    lst.append(int(input('Введите вес арубза: ')))
print(min(lst), max(lst))