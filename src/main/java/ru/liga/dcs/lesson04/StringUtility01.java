package ru.liga.dcs.lesson04;
//DONE
import java.util.Arrays;
import java.util.Objects;

public class StringUtility01 {

    /**
     * Подсчет количества слов в строке.
     * <p>
     * Слова разделены одним или несколькими пробелами. Подряд идущие пробелы считаются одним разделителем.
     * <p>
     *
     * @param str Строка для подсчета слов. Может быть {@code null} или пустой.
     * @return Количество слов в строке. Возвращает 0 для {@code null} или пустой строки.
     */
    public static int countWords(String str) {
        if(str == null || Objects.equals(str, "")) {
            return 0;
        }

        return (int) Arrays
                .stream(str.split(" "))
                .filter(i -> !Objects.equals(i, ""))
                .count();
    }
}
