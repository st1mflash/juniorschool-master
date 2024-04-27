package ru.liga.dcs.lesson03;
//DONE
/**
 * Класс для выполнения различных операций со строками.
 */
public class StringUtilities02 {

    /**
     * Подсчитывает количество латинских гласных букв (aeiou) в строке.
     *
     * @param str Строка для анализа.
     * @return Количество гласных букв в строке.
     */
    public static int countVowels(String str) {
        if(str == null || str.isEmpty()) {
            return 0;
        }
        int resultCount = 0;

        for(String ch: str.split("")) {
            if("aeiou".contains(ch.toLowerCase())) {
                resultCount++;
            }
        }
        return resultCount;
    }
}
