def show_data() -> None:
    """Выводит информацию из справочника"""
    with open('book.txt', 'r', encoding='utf-8') as file:
        print(file.readlines())                             #add lines, еще бы понять как выводить в консоль без \n


def add_data() -> None:                                     #вроде без ошибок работает. Единственное после удаления, добавляет не в последнюю пустую строку
    """Добавляет информацию в справочник."""
    fio = input('Введиет ФИО: ')
    phone = input('Введите телефон: ')
    with open('book.txt', 'a', encoding='utf-8') as file:
        file.write(f'\n{fio} | {phone}') 


def find_data() -> None:                                    #вроде норм
    """Печатает результат поиска по справочнику."""
    with open('book.txt', 'r', encoding='utf=8') as file:
        data = file.readlines()                              #add lines
    data_to_find = input('Введите данные для поиска: ')
    print(search(data, data_to_find))

    
def delete_data() -> None:                  # оставляет пустую строку в файле
    """Удаляет запись по ФИО или номеру"""
    with open('book.txt', 'r', encoding='utf-8') as file:
        data = file.readlines()             # тут я начал юзать ридлайнс и перегорбачивать весь функционал
    data_to_find = input('Введите данные для обратботки: ')
    data_correct = ' '.join(map(str, search(data, data_to_find)))  #благодарим опенэйай за эту строчку
    found = False
    with open('book.txt', 'w', encoding='utf-8') as file:
        for line in data:
            if data_correct not in line:
                file.write(line)            # а как без переписывания всего документа?
            else:
                found = True
    if found:
        print(f"Запись с данными '{data_correct}' обработана.")
    else:
        print(f"Запись с данными '{data_correct}' не найдена в телефонном справочнике.")

def change_data() -> None:                      #оставляет пустую строку в файле тоже, последующая запись идет не построчно не красиво
    """Изменяет запись по ФИО или номеру"""
    delete_data()
    add_data()
    print("Запись с данными изменена.")


def search(book: str, info: str) -> str:
    """Находит в списке записи по определенному критерию поиска"""
    # book = book.split('\n') удалено для перехода на ридлайнс
    # all_contacts = list()
    all_contacts = []
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
    




