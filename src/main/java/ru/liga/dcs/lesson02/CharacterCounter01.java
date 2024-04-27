package ru.liga.dcs.lesson02;
//DONE
public class CharacterCounter01 {

    /**
     * Подсчитывает количество вхождений заданного символа в строку.
     *
     * @param str строка, в которой осуществляется поиск.
     * @param ch символ, количество вхождений которого нужно подсчитать.
     * @return количество вхождений символа в строку.
     */
    public int countCharacterOccurrences(String str, char ch) {
        // Реализация метода
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
}
