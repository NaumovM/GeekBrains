def show_data() -> None:
    """Выводит информацию из справочника"""
    with open('book.txt', 'r', encoding='utf-8') as file:
        print(file.read())


def add_data() -> None:
    """Добавляет информацию в справочник."""
    fio = input('Введиет ФИО: ')
    phone = input('Введите телефон: ')
    with open('book.txt', 'a', encoding='utf-8') as file:
        file.write(f'\n{fio} | {phone}')


def find_data() -> None:
    """Печатает результат поиска по справочнику."""
    with open('book.txt', 'r', encoding='utf=8') as file:
        data = file.read()
    # print(data)
    data_to_find = input('Введите данные для поиска: ')
    print(search(data, data_to_find))

    
def delete_data() -> None:                  # функция кривая и удаляет все совпадения + оставляет пробел, но я устал с ней воевать
    """Удаляет запись по ФИО или номеру"""
    with open('book.txt', 'r', encoding='utf-8') as file:
        data = file.readlines()             # не очень понятно как юзать все это питоновское разнообразие
    data_to_find = input('Введите данные для удаления: ')
    found = False
    with open('book.txt', 'w', encoding='utf-8') as file:
        for line in data:
            if data_to_find not in line:
                file.write(line)            # не совсем понятно, что делает эта строка(переписывает весь документ?), и зачем конструкция с  found = false, механика ясна, но не смысл
            else:
                found = True
    if found:
        print(f"Запись с данными '{data_to_find}' удалена из телефонного справочника.")
    else:
        print(f"Запись с данными '{data_to_find}' не найдена в телефонном справочнике.")


def search(book: str, info: str) -> str:
    """Находит в списке записи по определенному критерию поиска"""
    book = book.split('\n')
    all_contacts = list()
    for contact in book:
        if info in contact:
            all_contacts.append(contact)
    if len(all_contacts) == 1:          #Если один контакт, без коррекции
        return(all_contacts)
    if len(all_contacts) > 1:           #Если более, то коррекция
        print(all_contacts)
        print('Введите данные для уточнения: ')
        corr = input()
        corr_contact = list()
        for contact in all_contacts:
            if corr in contact:
                corr_contact.append(contact)
        return(corr_contact)            #Здесь коррекция доступна толька один раз и не вынесена в отдельную функцию
    else:
        return 'Совпадений не найдено'
    




