package org.example.Greeting;

public class Greeting {
    private String greeting;
    private String target;

    public void setGreeting (String greeting){
        this.greeting = greeting;
    }

    public void setTarget (String target){
        this.target = target;
    }

    public String greet (){
        return greeting + " " + target;
    }
//using method overloading
    public String greet (String whoToGreet){
        return greeting + " " + whoToGreet;
    }



    public static  void main (String[] args){
        Greeting greeting = new Greeting();
        greeting.setGreeting("Good evening");
        greeting.setTarget("Debbie");

        System.out.println(greeting.greet());
        System.out.println(greeting.greet("Aunty Florence"));
    }


}
