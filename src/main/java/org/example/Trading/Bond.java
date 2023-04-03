package org.example.Trading;

public class Bond extends Trade{
    private double dividend;

    public Bond (String id, String symbol, int quantity, double price, double dividend){
        super(id, symbol, quantity, price);
        this.dividend = dividend;
    }

    public Bond (String id, String symbol, int quantity, double dividend){
        super(id, symbol, quantity);
        this.dividend = dividend;
    }
    @Override
    public double calcDividend (){
        return this.dividend;
    }

    public String toString(){
        return "The dividend for the bond trade is " + calcDividend();
    }
}
