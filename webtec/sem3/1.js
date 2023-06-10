const celsius = +prompt('Введите градусы Цельсия');
let fahrenheit = (9 / 5) * celsius + 32;
fahrenheit = Math.round(fahrenheit * 10) / 10;
alert("Цельсий: " + celsius + ", Фаренгейт: " + fahrenheit);
