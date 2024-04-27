package ru.liga.dcs.lesson06;
//DONE
import java.util.*;

public class StringUtility02 {
    /**
     * Проверяет, можно ли составить целевую строку (target) перестановкой символов исходной строки (original).
     * <p>
     * Эта функция учитывает количество вхождений каждого символа в обеих строках. Она возвращает true, если целевая строка
     * может быть составлена из символов исходной строки, и false в противном случае.
     * <p>
     * Обратите внимание, что сравнение символов регистрозависимо.
     *
     * @param original исходная строка, из символов которой может быть составлена целевая строка.
     * @param target   целевая строка, которую нужно попытаться составить.
     * @return true если целевая строка может быть составлена из исходной, иначе false.
     * @throws NullPointerException если одна из строк (или обе) равна null.
     */
    public static boolean canFormString(String original, String target) {
        if(original == null || target == null) {
            throw new NullPointerException();
        }

        if(original.isEmpty() && target.isEmpty()) {
            return true;
        }

        List<Character> listOriginal = new ArrayList<>(
                Arrays.stream(original.split(""))
                        .map(i -> i.charAt(0))
                        .sorted()
                        .toList()
        );
        List<Character> listTarget = new ArrayList<>(
                Arrays.stream(target.split(""))
                        .map(i -> i.charAt(0))
                        .sorted()
                        .toList()
        );

        return listOriginal.containsAll(listTarget);
    }
}
