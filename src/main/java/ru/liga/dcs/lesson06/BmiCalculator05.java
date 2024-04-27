package ru.liga.dcs.lesson06;
//DONE
public class BmiCalculator05 {
    /**
     * Метод для расчета индекса массы тела (ИМТ) по данным пациента.
     *
     * @param patient объект пациента
     * @return значение ИМТ
     */
    public double calculateBMI(Patient patient) {
        return patient.getWeight() / Math.pow(patient.getHeight(), 2);
    }
}
