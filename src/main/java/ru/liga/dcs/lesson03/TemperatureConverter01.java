package ru.liga.dcs.lesson03;
//DONE
/**
 * Класс для конвертации температурных единиц.
 */
public class TemperatureConverter01 {

    /**
     * Конвертирует температуру из Цельсия в Фаренгейт.
     *
     * @param celsius Температура в Цельсиях.
     * @return Температура в Фаренгейтах.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * ((double) 9 / 5)) + 32;
    }
}
