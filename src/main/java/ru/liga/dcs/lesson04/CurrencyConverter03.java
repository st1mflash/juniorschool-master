package ru.liga.dcs.lesson04;
//DONE
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Класс для конвертации валют.
 */
public class CurrencyConverter03 {

    /**
     * Конвертирует сумму денег из одной валюты в другую.
     * <p>
     * Использует {@link BigDecimal} для высокой точности вычислений и предотвращения ошибок округления.
     * Результат округляется до двух десятичных знаков согласно стандартному методу округления {@link RoundingMode#HALF_UP}.
     * <p>
     * @param amount сумма для конвертации, не должна быть null и должна быть неотрицательной.
     * @param exchangeRate курс обмена, не должен быть null и должен быть больше 0.
     * @return Конвертированная сумма, округленная до двух десятичных знаков.
     * @throws IllegalArgumentException если amount или exchangeRate недействительны. Ошибка включает в себя информацию о недействительных значениях.
     */
    public static BigDecimal convertCurrency(BigDecimal amount, BigDecimal exchangeRate) {
        checkException(amount, exchangeRate);
        return amount.multiply(exchangeRate).divide(BigDecimal.ONE, 2, BigDecimal.ROUND_HALF_UP);
    }
    private static void checkException(BigDecimal amount, BigDecimal exchangeRate) {
        if(amount == null) {
            throw new IllegalArgumentException("Сумма не должна быть пустой");
        }
        if(amount.compareTo(BigDecimal.valueOf(0)) < 0) {
            throw new IllegalArgumentException("Сумма не должна быть отрицательной: " + amount);
        }

        if(exchangeRate == null) {
            throw new IllegalArgumentException("Курс обмена не должен быть пустой");
        }
        if(exchangeRate.compareTo(BigDecimal.valueOf(0)) <= 0) {
            throw new IllegalArgumentException("Курс обмена должен быть больше нуля: " + exchangeRate);
        }
    }
}
