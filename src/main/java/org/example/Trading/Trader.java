package org.example.Trading;

public class Trader {
    private String name;
    private Account account;

    public void setName (String myName){
        this.name = myName;
    }

    public String getName (){
        return name;
    }

    public void setAccount (Account newAccount) {
        this.account = newAccount;
    }

    public Account getAccount (){
        return account;
    }






    public void addTrade (Trade trade){
        account.setTotalValueOfAllTrades(trade.getValueOfTrade());
    }







}
