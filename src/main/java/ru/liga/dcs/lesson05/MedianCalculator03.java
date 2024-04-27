package ru.liga.dcs.lesson05;

import java.util.Arrays;
import java.util.List;

/**
 * Класс для расчёта медианы массива чисел.
 */
public class MedianCalculator03 {

    /**
     * Вычисляет медиану данного массива чисел.
     *
     * @param numbers массив чисел, для которого нужно вычислить медиану.
     * @return медиана массива чисел.
     * @throws IllegalArgumentException если массив null или пуст.
     */
    public double calculateMedian(double[] numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException();
        }

        //numbers = Arrays.stream(numbers)

        return 0.0;
    }
}