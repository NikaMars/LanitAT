#language: ru
@Lanit
Функционал: Функционирование Lanit education

  Предыстория:
    Зарегестрировать пользователя на сайте https://dev.n7lanit.ru/
    Дано заведен новый пользователь

@Test
  Сценарий: тестирования функционала сайта
    Пусть открыт браузер и введен адрес "https://dev.n7lanit.ru/"
    И страница загрузилась
    И выбрана вкладка "Категории"
    И выбрана вкладка "Пользователи"
    И выбрана иконка поиска
    И появилось выпадающее поле поиска
    И пользователь вводит "Nika"
    Тогда появились результаты поиска
    Тогда тест завершен
