package ru.liga.dcs.lesson04;
//DONE
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Валидатор номеров кредитных карт с использованием алгоритма Луна.
 */
public class CreditCardValidator04 {

    /**
     * Проверяет действительность номера кредитной карты с использованием алгоритма Луна.
     * <p>
     * Алгоритм Луна - это простой способ проверки валидности числовых последовательностей, особенно номеров кредитных карт.
     * Он предназначен для защиты от случайных ошибок ввода.
     * <p>
     * Реализация алгоритма:
     * 1. Начиная с последней цифры и двигаясь влево, удваивайте значение каждой второй цифры.
     *    Если результат удвоения больше 9, вычтите из него 9.
     * 2. Суммируйте все цифры полученной последовательности.
     * 3. Если сумма кратна 10, номер считается действительным согласно алгоритму Луна.
     * <p>
     * Пример:
     * Для номера карты "4539578763621486":
     *  - Реверсирование: "6842163786579354"
     *  - Удвоение каждой второй цифры: "6 16 4 2 1 12 3 14 7 10 5 18 9 6 5 8"
     *  - Коррекция цифр (>9): "6 7 4 2 1 3 3 5 7 1 5 9 9 6 5 8"
     *  - Сумма: 6+7+4+2+1+3+3+5+7+1+5+9+9+6+5+8 = 81
     *  - 81 не кратно 10, следовательно, номер недействителен.
     * <p>
     *  <a href="https://habr.com/ru/articles/745302/">Статья на хабре</a>
     * <p>
     * @param cardNumber Номер кредитной карты в виде строки. Должен содержать только цифры.
     * @return true, если номер карты действителен, иначе false.
     * @throws IllegalArgumentException если cardNumber null, пуст, или содержит не только цифры.
     */
    public static boolean isValidCreditCardNumber(String cardNumber) {
        isOnlyNumbers(cardNumber);

        List<Integer> listCardNumber = Arrays
                .stream(
                        new StringBuilder(cardNumber)
                                .reverse()
                                .toString()
                                .split("")
                )
                .map(Integer::valueOf)
                .toList();

        return (doubleEverySecondElement(listCardNumber)
                .stream()
                .mapToInt(i -> i > 9 ? i - 9 : i)
                .sum()
                % 10 == 0);
    }

    private static List<Integer> doubleEverySecondElement(List<Integer> listCardNumber) {
        return IntStream.range(0, listCardNumber.size())
                .map(i -> i % 2 == 1 ? listCardNumber.get(i) * 2 : listCardNumber.get(i))
                .boxed()
                .toList();
    }
    private static void isOnlyNumbers (String cardNumber) {
        if(cardNumber == null || cardNumber.isEmpty()) {
            throw new IllegalArgumentException("только цифры");
        }

        for(int i = 0; i < cardNumber.length(); i++) {
            if(!Character.isDigit(cardNumber.charAt(i))) {
                throw new IllegalArgumentException("только цифры");
            }
        }
    }
}
