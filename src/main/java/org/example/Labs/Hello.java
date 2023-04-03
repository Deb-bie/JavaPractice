package org.example.Labs;

public class Hello {
    private String greeting;
    private String target;

    public Hello (String g, String t){
        greeting = g;
        target = t;
    }

    public String toString (){
        return greeting + " " + target;
    }

    public static void main (String[] args){
        Hello hello = new Hello("Hello", "Debs");
        System.out.println(hello.toString());
    }
}
