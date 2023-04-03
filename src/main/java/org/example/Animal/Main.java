package org.example.Animal;

import java.awt.*;

public class Main {
    public static void main (String[] args){
        Animal animal =  new Animal(22, Color.BLACK);
        System.out.println(animal.eat());

        Lion lion = new Lion(32, Color.cyan, Color.yellow);
        System.out.println(lion);
        System.out.println(lion.eat());
//        System.out.println(lion.super.e);



        Zoo zoo = new Zoo ();
        System.out.println("My zoo feed method returns " + zoo.feed(lion));
    }
}
