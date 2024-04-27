package ru.liga.dcs.lesson03;
//DONE
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Класс представляет собой реализацию кэша, который удаляет наименее недавно использованные элементы,
 * когда достигнута его максимальная ёмкость.
 * The Least Recently Used (LRU)
 */
public class LruCache05 {
    private final Map<String, Object> cache = new LinkedHashMap<>();
    private final int capacity;
    /**
     * Конструктор для создания кэша с определённой ёмкостью.
     *
     * @param capacity Максимальная ёмкость кэша.
     */

    public LruCache05(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Получает значение по ключу из кэша.
     *
     * @param key Ключ, по которому нужно получить значение.
     * @return Значение, соответствующее ключу, или {@code null}, если ключ не найден.
     */
    public Object get(String key) {
        Object value = cache.get(key);

        cache.remove(key);
        cache.put(key, value);

        return cache.get(key);
    }

    /**
     * Добавляет пару ключ-значение в кэш. Если кэш достигает своей максимальной ёмкости,
     * наименее недавно использованный элемент удаляется.
     *
     * @param key   Ключ для добавляемого значения.
     * @param value Значение, которое нужно добавить.
     */
    public void put(String key, Object value) {
        if (capacity <= cache.size()) {
            deleteLastCacheElement();
        }
        cache.put(key, value);
    }

    private void deleteLastCacheElement() {
        cache.remove(cache.entrySet().iterator().next().getKey());
    }
}
