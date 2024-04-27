package ru.liga.dcs.lesson06;

public class Patient {
    private String name;
    private int age;
    private double weight;
    private double height;

    // Конструктор, геттеры и сеттеры опущены для краткости

    public Patient(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
