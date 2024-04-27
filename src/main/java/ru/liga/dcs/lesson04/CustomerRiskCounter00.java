package ru.liga.dcs.lesson04;
//DONE
import ru.liga.dcs.lesson04.domain.Customer00;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс для подсчета количества клиентов по категориям риска.
 */
public class CustomerRiskCounter00 {

    /**
     * Подсчитывает количество клиентов в каждой категории риска.
     * 
     * @param customers Список клиентов.
     * @return Map, где ключ - это категория риска, а значение - количество клиентов в этой категории.
     */
    public static Map<String, Integer> countCustomersByRiskCategory(List<Customer00> customers) {
        Map<String, Integer> listCategory = new HashMap<>();

        for (Customer00 customer: customers) {
            listCategory.put(customer.getRiskCategory(), 0);
        }

        customers.stream()
                .map(Customer00::getRiskCategory)
                .map(category -> listCategory.put(category, listCategory.get(category) + 1))
                .collect(Collectors.toList());

        return listCategory;
    }
}
