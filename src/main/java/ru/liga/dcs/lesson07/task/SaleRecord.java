package ru.liga.dcs.lesson07.task;

public class SaleRecord {
    private String product;
    private double amount;
    private String category; // Новое поле

    // Конструктор, геттеры и сеттеры
    public SaleRecord(String product, double amount, String category) {
        this.product = product;
        this.amount = amount;
        this.category = category;
    }

    // ... геттеры и сеттеры ...
    public String getCategory() {
        return category;
    }

    public String getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }
}
