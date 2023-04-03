package org.example.Trading;

public class Fund extends Trade{

    private double percentage = 0.05;

    public Fund (String id, String symbol, int quantity, double price, double percentage ){
        super(id, symbol,quantity, price);
        this.percentage = percentage;
    }

    public Fund (String id, String symbol, int quantity, double percentage){
        super(id, symbol,quantity);
        this.percentage = percentage;
    }


    public double calcDividend (){
        return percentage * getPrice();
    }

    public String toString(){
        return "The dividend for the fund trade is " + calcDividend();
    }


}
