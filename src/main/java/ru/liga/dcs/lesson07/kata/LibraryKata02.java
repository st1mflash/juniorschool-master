package ru.liga.dcs.lesson07.kata;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryKata02 {

    /**
     * Агрегирует информацию о первых пяти уникальных книгах, опубликованных после 2000 года,
     * отсортированных по году издания в порядке возрастания. Информация собирается из списка авторов,
     * каждый из которых имеет список своих книг.
     * <p>
     * Псевдокод:
     * <p>
     * Функция aggregateBooksInfo(список авторов):
     * 1. Создать поток (stream) из списка авторов.
     * 2. Преобразовать (flatMap) каждого автора в поток его книг.
     * 3. Применить фильтр (filter) для отбора книг, опубликованных после 2000 года.
     * 4. Удалить дубликаты книг (distinct), основываясь на уникальности названия.
     * 5. Отсортировать (sorted) книги по году издания в порядке возрастания.
     * 6. Ограничить (limit) результат первыми пятью книгами.
     * 7. Преобразовать (map) поток книг в поток названий книг.
     * 8. Собрать (collect) названия книг в список и вернуть его.
     * Конец Функции
     * <p>
     * ТАК КАК ИСПОЛЬЗУЕТСЯ "DISTINCT" ТО НУЖНО ПЕРЕОПРЕДЕЛИТЬ ".EQUALS()" ДЛЯ "BOOK"
     *
     * @param authors список авторов
     * @return список названий первых пяти уникальных книг, опубликованных после 2000 года
     */
    public static List<String> aggregateBooksInfo(List<Author> authors) {
        return authors
                .stream()
                .flatMap(author -> author.getBooks().stream())
                .filter(book -> book.getYearOfPublication() > 2000)
                .distinct()
                .sorted()
                .limit(5)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

}
