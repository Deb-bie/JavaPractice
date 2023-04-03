package org.example.Trading;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private LocalDate date;
    private LocalTime time;

    public Trade (String id, String symbol, int quantity, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade (String id, String symbol, int quantity){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(int newPrice){
        if (newPrice > 0) {
            this.price = newPrice;
        }
    }

    public double getPrice (){
        return price;
    }

    public double getValueOfTrade(){
        return this.price * this.quantity;
    }

    public LocalTime getTime (){
        return time;
    }

    public abstract double calcDividend();



    public String toString (){
        return "ID: " + id + ", Symbol: " + symbol + ", Quantity " + quantity + ", Price: " + price;
    }
}
