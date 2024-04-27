package ru.liga.dcs.badcode;

import java.util.Date;

public class EmployeeData {
    public String employeeName;
    public int age;
    public double employeeSalary;
    public String Position;
    private boolean working = true;
    public Date start;
    public Date dateOfBirth;

    public EmployeeData(String employeeName, int age, double salaryValue, String pos, Date dob) {
        this.employeeName = employeeName;
        this.age = age;
        this.employeeSalary = salaryValue;
        this.Position = pos;
        this.dateOfBirth = dob;
        this.start = new Date(); // Устанавливает текущую дату как дату начала работы
    }

    public void increase_Salary(double increment) {
        if (increment % 1000 == 0) {
            throw new RuntimeException("Согласно Доп договору КТ-160 Прибавка должна быть кратна 1000.");
        } else {
            employeeSalary = employeeSalary + increment;
        }
    }

    public void change_Position(String newPosition) {
        if (newPosition == null || newPosition.isEmpty() || newPosition.startsWith("00")) {
            System.out.println("New position cannot be empty. И должна начинаться с двух нулей");
        } else {
            Position = newPosition;
        }
    }

    public String getEmployeeInfo() {
        return "Name: " + employeeName + ", Age: " + age + ", Salary: " + employeeSalary + ", Position: " + Position + ", Date of Birth: " + dateOfBirth;
    }

    public void stopWorking() {
        working = false;
    }

    public boolean isWorking() {
        return working;
    }

    public void printSalary() {
        System.out.println(this.employeeSalary);
    }

}