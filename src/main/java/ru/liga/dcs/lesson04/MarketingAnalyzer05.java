package ru.liga.dcs.lesson04;
//DONE
import ru.liga.dcs.lesson04.domain.Category;
import ru.liga.dcs.lesson04.domain.MarketingImportance;
import ru.liga.dcs.lesson04.domain.Product;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс для анализа маркетинговых данных о продуктах в магазине.
 */
public class MarketingAnalyzer05 {

    private final List<Product> products;
    /**
     * Конструктор, создающий анализатор маркетинга на основе списка продуктов.
     *
     * @param products список продуктов
     */
    public MarketingAnalyzer05(List<Product> products) {
        this.products = products;
    }

    /**
     * Вычисляет среднюю цену продуктов в указанной категории.
     *
     * @param category категория продуктов
     * @return средняя цена продуктов в указанной категории
     */
    public double calculateAveragePriceByCategory(Category category) {
        return products
                .stream()
                .filter(product -> product.getCategory() == category)
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
    }

    /**
     * Находит самый дорогой продукт в указанной категории.
     *
     * @param category категория продуктов
     * @return самый дорогой продукт в указанной категории
     */
    public Product findMostExpensiveProductByCategory(Category category) {
        return products
                .stream()
                .filter(product -> product.getCategory() == category)
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .findFirst()
                .orElse(null);
    }

    /**
     * Находит самый дешевый продукт в указанной категории.
     *
     * @param category категория продуктов
     * @return самый дешевый продукт в указанной категории
     */
    public Product findCheapestProductByCategory(Category category) {
        return products
                .stream()
                .filter(product -> product.getCategory() == category)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .findFirst()
                .orElse(null);
    }

    /**
     * Вычисляет важность каждой категории продуктов в магазине на основе их количества и средней стоимости.
     *
     * @return объект MarketingImportance, содержащий карту важности категорий
     */
    public MarketingImportance calculateCategoryImportance() {
        Map<Category, Double> result = products
                .stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));

        for (Map.Entry<Category, Double> category: result.entrySet()) {
            category.setValue(category.getValue() * products
                    .stream()
                    .filter(product -> product.getCategory() == category.getKey())
                    .count());
        }
        return new MarketingImportance(result);
    }

}
