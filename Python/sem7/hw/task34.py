# Задача 34:  Винни-Пух попросил Вас посмотреть, есть ли в его стихах ритм.
# Поскольку разобраться в его кричалках не настолько просто, насколько легко он их придумывает,
# Вам стоит написать программу. Винни-Пух считает, что ритм есть,
# если число слогов (т.е. число гласных букв) в каждой фразе стихотворения одинаковое.
# Фраза может состоять из одного слова, если во фразе несколько слов, то они разделяются дефисами.
# Фразы отделяются друг от друга пробелами. Стихотворение  Винни-Пух вбивает в программу с клавиатуры.
# В ответе напишите “Парам пам-пам”, если с ритмом все в порядке и “Пам парам”, если с ритмом все не в порядке

# *Пример:*

# **Ввод:** пара-ра-рам рам-пам-папам па-ра-па-да
#     **Вывод:** Парам пам-пам

poem = input("Введите стих: ").split()
vowels = ['а', 'я', 'у', 'ю', 'о', 'е', 'ё', 'э', 'и', 'ы']
list_1 = []
for phrase in poem:
    count = 0
    for letter in phrase:
        if letter.lower() in vowels:
            count += 1
    list_1.append(count)    #считаем гласные в каждом слове и добавляем их в список
if len(set(list_1)) == 1:   #проверяем длинну уникальных значений
    print("Парам пам-пам")
else:
    print("Пам Парам")


# а это для составителей программы Java-разработчик, на которую я записывался.
# vowels = ['а', 'я', 'у', 'ю', 'о', 'е', 'ё', 'э', 'и', 'ы']
# poem = input('Введите стихотворение: ')
# phrases = poem.split()
# syllable_count = len([letter for letter in poem.lower() if letter in vowels])
# filtered_phrases = filter(lambda phrase: len([letter for letter in phrase.lower() if letter in vowels]) == syllable_count, phrases)
# if len(list(filtered_phrases)) == len(phrases):
#     print('Парам пам-пам')
# else:
#     print('Пам парам')