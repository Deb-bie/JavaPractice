package org.example.Trading;

public class Account {
    private double totalValueOfAllTrades;

    public void setTotalValueOfAllTrades (double newValue){
        this.totalValueOfAllTrades = newValue;
    }

    public double getTotalValueOfAllTrades (){
        return totalValueOfAllTrades;
    }

    public String toString(){
        return "The total value of trades is " + getTotalValueOfAllTrades();
    }
}
