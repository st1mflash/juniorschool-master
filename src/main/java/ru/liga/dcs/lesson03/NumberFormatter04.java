package ru.liga.dcs.lesson03;
//DONE
/**
 * Класс для форматирования чисел.
 */
public class NumberFormatter04 {

    /**
     * Форматирует число, дополняя его лидирующими нулями.
     * Для отрицательных чисел считает - тоже символом входящим в totalLength
     *
     * @param number      Число для форматирования.
     * @param totalLength Желаемая длина результата.
     * @return Строковое представление числа, дополненное лидирующими нулями.
     */
    public static String padNumberWithLeadingZeros(int number, int totalLength) {
        int currentLength = String.valueOf(number).length();
        String result = String.valueOf(number);

        for (int i = currentLength; i < totalLength; i++) {
            result = "0" + result;
        }
        if (number < 0) {
            result = "-" + result.replace("-", "");
        }
        return result;
    }
}
