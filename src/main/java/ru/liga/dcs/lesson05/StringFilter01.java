package ru.liga.dcs.lesson05;
//DONE
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter01 {

    /**
     * Фильтрует список строк, оставляя только те, которые удовлетворяют заданному условию.
     *
     * @param strings   список строк
     * @param condition условие для фильтрации
     * @return отфильтрованный список
     */
    public List<String> filterStrings(List<String> strings, Predicate<String> condition) {
        if(strings == null || condition == null) {
            throw new IllegalArgumentException();
        }
        return strings.stream().filter(condition::test).collect(Collectors.toList());
    }
}
