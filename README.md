ru text

#  **Spring**

> Условия домашкидомашнее задание к уроку Spring.
Ваше задание на сегодня — нужно написать сервис, который собирает корзину для интернет-магазина.




Алгоритм действий:

-  Разработайте контроллер, сервис и некую сущность корзины с покупками.
- У контроллера должно быть два метода: /store/order/add и /store/order/get.
- При обращении к методу add можно в качестве параметров запроса передавать один или несколько чисел, которые являются ID некоего товара.
- При get мы должны получить все добавленные ID в виде списка в JSON-формате.
- Для каждого подключения нового клиента должен создаваться новый объект — корзина.
- Никаких хранилищ всех корзин быть не должно.
- В качестве теста можно зайти со своего браузера и добавить итемы (item), далее — получить список.
- Этот же тест нужно проделать через браузер в режиме инкогнито и получить другой список.

Алгоритм действий теста в браузере в режиме инкогнито:

1. Обращаемся к методу add из браузера, добавляем первые ID.
2. Обращаемся к методу add из инкогнито, добавляем первые ID.
3. Повторяем шаг 1 и 2.
4. Обращаемся к методу get сначала из браузера, потом из инкогнито. Списки должны быть разными и заполнены тем, что было в шагах 1–3 .

eng text

#  **Spring**

> Homework conditions home assignment for the Spring lesson.
Your task for today is to write a service that collects a shopping cart for an online store.




The algorithm of actions:

- Develop a controller, a service, and some kind of shopping cart entity.
- The controller should have two methods: /store/order/add and /store/order/get.
- When accessing the add method, you can pass one or more numbers as request parameters, which are the ID of a certain product.
- When getting, we need to get all the added IDs as a list in JSON format.
- A new shopping cart object must be created for each connection of a new client.
- There should be no storage of all baskets.
- As a test, you can log in from your browser and add items, then get a list.
- You need to do the same test through the browser in incognito mode and get another list.

The algorithm of the test actions in the browser in incognito mode:

1. Access the add method from the browser, add the first IDs.
2. We turn to the add method from incognito, add the first IDs.
3. Repeat steps 1 and 2.
4. We turn to the get method first from the browser, then from incognito. The lists should be different and filled with what was in steps 1-3.
