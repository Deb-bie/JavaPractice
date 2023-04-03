package org.example.Trading;

public class Main {
    public static void main (String[] args){
//        Trade trade = new Trade("T1", "APPL", 100, 15.25);
//        System.out.println(trade);
//
//        Account account = new Account();
//        System.out.println(account.getTotalValueOfAllTrades());
//
//        Trader trader = new Trader();
//        trader.setName("Debbie");
//        trader.setAccount(account);
//        trader.addTrade(trade);
//
//        System.out.println("Printing out the total value of all trades " + account.getTotalValueOfAllTrades());


        /***
         * AFTER MAKING THE TRADE CLASS ABSTRACT
         */
//
//        Bond bond = new Bond("B1", "BMW", 100, 20.20);
//        System.out.println(bond.calcDividend());
//
//        Fund fund = new Fund("F1", "Ferrari", 100, 40.0, 20.20);
//        System.out.println(fund.calcDividend());


        Client client = new Client();
        client.setFirstName("Debbie");
        client.setLastName("Asamoah");
        client.setPoints(8);
        System.out.println(client);

        Client client1 = new Client();
        System.out.println(client1.getPoints());
        System.out.println(client1);
        client1.addPointsToUpgradeMembership();
        System.out.println(client1.getPoints());
        System.out.println(client1);

        System.out.println(client1.getMembershipType());





    }
}
