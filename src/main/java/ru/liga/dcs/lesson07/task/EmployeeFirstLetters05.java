package ru.liga.dcs.lesson07.task;
//DONE
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFirstLetters05 {

    /**
     * Stream#sorted, Stream#distinct, Stream#limit and Stream#flatMap Stream#map
     *
     * Получает список уникальных первых букв имён сотрудников из всех отделов,
     * отсортированных в алфавитном порядке, и возвращает первые 5 букв.
     *
     * @param departments список отделов
     * @return список первых букв имён
     */
    public static List<Character> getFirstLettersOfEmployeeNames(List<Department> departments) {
        return departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .map(employee -> employee.getName().charAt(0))
                .distinct()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());
    }
}
