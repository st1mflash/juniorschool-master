package ru.liga.dcs.lesson07.task;
//DONE
import java.util.List;

public class ProductAnalytics06 {

    /**
     * Вычисляет взвешенную сумму рейтингов продуктов. Взвешенная сумма рейтингов
     * представляет собой сумму произведений рейтингов на их весовые коэффициенты,
     * где в качестве весового коэффициента для каждого рейтинга используется количество
     * отзывов на продукт. Таким образом, рейтинги продуктов с большим количеством отзывов
     * имеют больший вклад в итоговую взвешенную сумму.
     *
     * <p>Этот метод особенно полезен, когда необходимо учесть не только сам рейтинг продукта,
     * но и степень его популярности или доверия, выраженную через количество отзывов.
     * Продукты с высоким рейтингом и большим количеством отзывов оказывают большее влияние
     * на итоговую взвешенную сумму по сравнению с продуктами с тем же рейтингом, но с меньшим
     * количеством отзывов.
     *
     * @param products список продуктов
     * @return взвешенная сумма рейтингов
     */
    public static double calculateWeightedRatingSum(List<Product> products) {
        return products
                .stream()
                .mapToInt(product -> (int) (product.getRating() * product.getReviewCount()))
                .sorted()
                .sum();
    }
}
