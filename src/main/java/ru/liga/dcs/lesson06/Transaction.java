package ru.liga.dcs.lesson06;

import java.util.Date;

public class Transaction {
    private double amount;
    private Date timestamp;
    private String country;
    private String clientCountry;

    // Конструкторы, геттеры и сеттеры

    public Transaction(double amount, Date timestamp, String country, String clientCountry) {
        this.amount = amount;
        this.timestamp = timestamp;
        this.country = country;
        this.clientCountry = clientCountry;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getCountry() {
        return country;
    }

    public String getClientCountry() {
        return clientCountry;
    }
}
