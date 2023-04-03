package org.example.Trading;

import java.time.LocalTime;

public class Client {
    private String firstName;
    private String lastName;

    private MembershipType membershipType;
    private int points;

    private int numberOfTradesMade;

    private boolean type;

    private double totalValueOfTrades;

    public void setFirstName (String newFirstName){
        this.firstName = newFirstName;
    }

    public void setLastName (String newLastName){
        this.lastName = newLastName;
    }

    public void setPoints (int newPoints){
        this.points = newPoints;
    }

    public void addPointsToUpgradeMembership (){
        this.points++;
    }

    public int getPoints (){
        return points;
    }

    public MembershipType getMembershipType (){
        return this.membershipType;
    }

    public MembershipType progressMembershipType (){
        if (this.points >=1 && this.points < 10) {
            upgradeMembershipStatus(new Bronze());
        } else if (this.points >= 10 && this.points <= 19) {
            upgradeMembershipStatus(new Silver());
        } else if (this.points >= 20) {
            upgradeMembershipStatus(new Gold());
        }
        return membershipType;
    }

    public void upgradeMembershipStatus (MembershipType newMembershipType) {
        this.membershipType = newMembershipType;
    }

    public void addTrade (Trade trade){
        if (membershipType == new Bronze() && numberOfTradesMade < 5 && (trade.getTime().isAfter(LocalTime.of(10, 0)) ) ) {

        }

        if (canTrade()) {
        }
    }


    public boolean canTrade (){
        if (membershipType == new Silver() && numberOfTradesMade < 10 && totalValueOfTrades < 10000) {
            type = true;
        } else if (membershipType == new Gold() && numberOfTradesMade < 20) {
            type = true;
        } else {
            type = false;
        }
        return type;
    }









    public String toString (){
        return "The membership status for " + firstName + " " + lastName + " is " + progressMembershipType();
    }

}
