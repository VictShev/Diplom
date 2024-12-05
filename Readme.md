

## Запуск авто-тестов

1. Клонируем репозиторий `https://github.com/VictShev/Diplom` командой `git clone`
2. Открываем как проект папку тестируемого приложения `fmh_android` в Android Studio
3. Запускаем эмулятор `Pixel 4 API 29`. Устанавливаем системным языком русский
4. Открываем вкладку `Terminal` и прописываем в командной строке:`./gradlew clean connectedAndroidTest`

## Создание и просмотр отчетов AllureReport

1. Скачиваем Allure2 
2. Распаковываем архив, прописываем путь переменной среды PATH в Windows к папке `bin` из распакованного архива, проверяем, что все установилось (`win+r` пишем `cmd` пишем `allure --version`)
3. Чтобы сформировать отчет из логов прогона тестов, нужно скопировать в папку `allure-results` в папке проекта свежие логи с виртуального устройства через встроенный в Android Studio диспетчер файлов (вкладка Device Explorer, далее путь `/sdcard/googletest/test_outputfiles/allure-results`), после чего выполнить команду `allure serve`