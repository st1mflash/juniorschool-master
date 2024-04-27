package ru.liga.dcs.lesson03;
//DONE
/**
 * Класс для работы с форматированием времени.
 */
public class TimeFormatter03 {

    /**
     * Конвертирует секунды в форматированное время (чч:мм:сс).
     *
     * @param seconds Количество секунд.
     * @return Строка времени в формате чч:мм:сс.
     */
    public static String convertSecondsToTime(int seconds) {
        if(seconds < 0) {
            throw new IllegalArgumentException();
        }
        int resultSeconds = seconds % 60;
        int resultMinutes = ((seconds - resultSeconds) / 60) % 60;
        int resultHours = (seconds - (resultMinutes * 60) - resultSeconds) / 3600;
        return convertIntToTime(resultHours)
                 + ":" + convertIntToTime(resultMinutes)
                 + ":" + convertIntToTime(resultSeconds);
    }

    private static String convertIntToTime(int intTime) {
        if(intTime / 10 < 1) {
            return "0" + intTime;
        } else {
            return String.valueOf(intTime);
        }
    }
}
