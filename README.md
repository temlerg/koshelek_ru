Используя API с сайта https://dog.ceo/dog-api/documentation/breed
И шаблон дизайна сделать следующее:

1. На первой вкладке получить список всех пород собак. (Заголовок сверху: Породы) Вывести список в таблице. В случае если у породы есть подпороды отображать количество подпород в виде числа. При нажатии на ячейку открыть новый экран:

- если подпород нет, то должен открыться экран на котором надо отобразить все фотографии данной породы в горизонтальной коллекции, фотографии на весь размер экрана, также снизу должна быть кнопка что бы лайкнуть фотографию. Так же кнопка сверху, что бы поделиться данной фотографией c друзьями. (Заголовок сверху: Название выбранной породы)

- если подпороды есть, то открыть такой же список только с подпородами. При нажатии на ячейку открывается экран с фотографиями конкретной подпороды и кнопкой что бы лайкнуть снизу (Заголовок сверху: Название выбранной породы)

2. На второй вкладке отображать список понравившихся пород (породы и подпороды в списке на одном уровне, то есть все породы и подпороды сразу отображены) и количество понравившихся фотографий у конкретной породы в виде числа. При нажатии на ячейку открывается экран с фотографиями конкретной подпороды и кнопкой что бы лайкнуть снизу и кнопкой сверху поделиться с друзьями. Можно разлайкать фотографию. Что должно удалить ее из списка после ухода с экрана.

Состояние лайков должно сохранится после выхода из приложения. На время ожидания ответа от сервера добавить лоадер, а в случае ошибки от сервера выводить алерт с пояснением. Используем прикрепленный шаблон.
