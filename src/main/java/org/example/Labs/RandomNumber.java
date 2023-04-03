package org.example.Labs;

public class RandomNumber {
    public static void main (String[] args){
        for (int i = 0; i < 7; i++){
            int rand1 = (int) (Math.random()*10) + 1;
            System.out.println(rand1);
        }
    }
}
