package org.example.Animal;

import java.awt.*;

public class Animal {
    private int size;
    private Color color;

    public Animal (int size, Color color){
        this.size = size;
        this.color = color;
    }

    public int getSize (){
        return size;
    }

    public Color getColor (){
        return color;
    }

    public String move (){
        return "Animals move";
    }

    public String eat (){
        return "Animals eat";
    }

    public String reproduce (){
        return "Animals reproduce";
    }

    public String toString (){
        return "Animal has a color " + color + " with a size of " + size;
    }
}
