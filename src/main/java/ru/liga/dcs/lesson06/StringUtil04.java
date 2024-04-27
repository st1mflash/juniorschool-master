package ru.liga.dcs.lesson06;
//DONE
import java.util.Arrays;
import java.util.Objects;

public class StringUtil04 {
    /**
     * Суммирует все числа, найденные в строке.
     * <p>
     * Этот метод ищет и суммирует все целые числа в предоставленной строке. Числа могут быть разделены любыми нецифровыми символами.
     * Поддерживаются только положительные числа без знака.
     * <p>
     * Например, в строке "he33llo 42 I'm a 32 string 30" сумма будет 137 (33 + 42 + 32 + 30).
     *
     * @param str строка, содержащая числа для суммирования.
     * @return сумма всех чисел, найденных в строке. Если в строке нет чисел, возвращает 0.
     * @throws NullPointerException если строка равна null.
     */
    public static int sumNumbersInString(String str) {
        return Arrays.stream(
                    str.replaceAll("[^\\d ]", " ").split(" ")
                )
                .filter(i -> !Objects.equals(i, ""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
