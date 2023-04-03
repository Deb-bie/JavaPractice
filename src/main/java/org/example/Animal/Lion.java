package org.example.Animal;
import java.awt.*;

public class Lion extends Animal{
    private Color maneColor;

    public Lion (int size, Color color, Color maneColor){
        super(size, color);
        this.maneColor = maneColor;
    }

    public String eat (){
        return "Lions eat other animals";
    }

    public String roar (){
        return "Lions;roar";
    }

    public String hunt (){
        return "Lions hunt for food";
    }

    public String toString (){
        return "Lions have a color " + getColor() + " and a size of " + getSize() + " with a mane color of " + maneColor;
    }


}
