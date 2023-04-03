package org.example.Labs;

public class GenerateRandomInteger {
    private int randomInteger;
    public int randomInteger (){
        randomInteger = (int) (0 + Math.random() * 100);
        return randomInteger;
    }

    public String evenOdd (){
        if (randomInteger % 2 == 0) {
            return "The random integer is even";
        } else {
            return "The random integer is odd";
        }
    }

    public String toString(){
        return evenOdd();
    }

    public static void main (String[] args){
        GenerateRandomInteger gri = new GenerateRandomInteger();

        System.out.println(gri.randomInteger());
        System.out.println(gri.evenOdd());
    }
}
