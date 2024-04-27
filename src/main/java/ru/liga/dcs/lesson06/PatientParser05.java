package ru.liga.dcs.lesson06;
//DONE
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PatientParser05 {
    /**
     * Метод для парсинга строки и создания объекта пациента.
     * @param data строка с данными о пациенте в формате "Имя:Иван;Возраст:35;Вес:80;Рост:1.75"
     * @return объект пациента
     */
    public Patient parsePatientData(String data) {
        Map<String, String> mapParams = new HashMap<>();

        Arrays.stream(data.split(";"))
                .toList()
                .stream()
                .map(i -> i.split(":"))
                .map(i -> mapParams.put(i[0], i[1]))
                .collect(Collectors.toList());

        return new Patient(
                mapParams.get("Имя"),
                Integer.parseInt(mapParams.get("Возраст")),
                Double.parseDouble(mapParams.get("Вес")),
                Double.parseDouble(mapParams.get("Рост"))
        );
    }
}
