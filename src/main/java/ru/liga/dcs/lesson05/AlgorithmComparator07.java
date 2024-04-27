package ru.liga.dcs.lesson05;
//DONE
import java.util.*;

/**
 * Абстрактный класс, представляющий алгоритм. Класс реализует интерфейс Runnable,
 * что позволяет алгоритмам выполняться в потоках.
 */
abstract class Algorithm implements Runnable {
    private final String name;

    /**
     * Конструктор создает новый экземпляр Algorithm с указанным именем.
     *
     * @param name Имя алгоритма.
     */
    public Algorithm(String name) {
        this.name = name;
    }

    /**
     * Возвращает имя алгоритма.
     *
     * @return Имя алгоритма.
     */
    public String getName() {
        return name;
    }
}


/**
 * Класс, предоставляющий функционал для сравнения алгоритмов.
 */
public class AlgorithmComparator07 {

    /**
     * Сравнивает производительность списка алгоритмов.
     * Возвращаемый результат — это карта, связывающая имя алгоритма с его временем выполнения.
     *
     * @param algorithms Список алгоритмов для сравнения.
     * @return Карта с именами алгоритмов и их временами выполнения.
     */
    public static Map<String, Long> compare(List<Algorithm> algorithms) {
        Map<String, Long> mapResult = new HashMap<>();
        for (Algorithm algorithm: algorithms) {
            long startTime = System.currentTimeMillis();
            algorithm.run();
            mapResult.put(algorithm.getName(), System.currentTimeMillis() - startTime);
        }
        return mapResult;
    }
}
