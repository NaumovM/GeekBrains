**Задание 1.**

1. Юнит-тесты:

* Название: Тест добавления контакта
Описание: тест проверяет функциональность добавления нового контакта в записную книжку. Он проверяет, что приложение правильно обрабатывает вводимую информацию о контакте и сохраняет её в хранилище.

* Название: Тест редактирования контакта
Описание: Данный тест проверяет возможность редактирования существующего контакта в записной книжке. Он убеждается, что приложение корректно обновляет информацию о контакте в хранилище.

* Название: Тест удаления контакта
Описание: Этот тест проверяет способность приложения удалять существующие контакты из записной книжки. Он удостоверяется, что приложение удаляет выбранный контакт из хранилища контактов.

2. Интеграционные тесты:

* Название: Тест взаимодействия пользовательского интерфейса с функциональностью добавления контакта
Описание: Этот тест проверяет, что пользовательский интерфейс взаимодействует корректно с функциональностью добавления контакта, включая обработку вводимых данных и передачу их в соответствующие компоненты приложения.

* Название: Тест взаимодействия пользовательского интерфейса с функциональностью редактирования контакта
Описание: Данный тест убеждается, что пользовательский интерфейс правильно взаимодействует с функциональностью редактирования контакта, осуществляя передачу измененных данных и их корректное отображение.

3. Сквозные тесты:

* Название: Тест создания контакта через пользовательский интерфейс и проверка его наличия в хранилище
Описание: Этот тест проверяет процесс добавления нового контакта через пользовательский интерфейс и убеждается, что после успешного добавления контакт также появляется в хранилище контактов.

* Название: Тест редактирования контакта через пользовательский интерфейс и проверка обновления в хранилище
Описание: Данный тест проверяет процесс редактирования контакта через пользовательский интерфейс и убеждается, что после успешного обновления контакт также правильно изменяется в хранилище контактов.

* Название: Тест удаления контакта через пользовательский интерфейс и проверка его отсутствия в хранилище
Описание: Этот тест проверяет процесс удаления контакта через пользовательский интерфейс и убеждается, что после успешного удаления контакт также пропадает из хранилища контактов.


**Задание 2.**

* Тест: Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.
Тип: Юнит-тест
Этот тест проверяет конкретную функцию или модуль независимо от других компонентов программы.

* Тест: Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.
Тип: Интеграционный тест
Почему: Этот тест проверяет взаимодействие между модулями (между пользовательским интерфейсом и системой управления списком контактов).

* Тест: Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.
Тип: Сквозной тест
Этот тест проверяет работу системы от начала до конца, для обнаружения любых проблем, которые могли возникнуть в процессе взаимодействия компонентов приложения.