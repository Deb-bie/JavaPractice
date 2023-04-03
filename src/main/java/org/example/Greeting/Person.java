package org.example.Greeting;

public class Person {
    private String name;
    private int age;

    private static int numOfPeople;

    public Person (String myName, int myAge){
        this.name = myName;
        this.age = myAge;
        numOfPeople++;
    }

//    creating a constructor to enable us copy bruce as an object
    public Person (Person a){
        this.name = a.name;
        this.age = a.age;
        numOfPeople++;
    }

    private static int getNumOfPeople (){
        return numOfPeople;
    }


    public String getName (){
        return this.name;
    }

    public void setName (String myName){
        this.name = myName;
    }

    public int getAge (){
        return this.age;
    }

    public void setAge (int myAge){
        this.age = myAge;
    }

    public String toString (){
        return "My name is " + name + " and I'm " + age + " years old";
    }



    public static void main (String[] args){
        Person brian =  new Person("Brian", 23);
        System.out.println(brian);

//        references the object brian to bruce. That means when we view bruce,
//        we will et the methods and attributes associated to brian
        Person bruce = brian;
        bruce.setAge(34);
        bruce.setName("Bruce");
        System.out.println(bruce);

        System.out.println("Printing brian again : " + brian );


//        copying the object Brian to bruce
        Person bryan = new Person(bruce);
        bryan.setName("Bryan");
        bryan.setAge(44);
        System.out.println(bryan);

        System.out.println("Printing brian again : " + brian );


//        === tests whether objects point to the same reference
        if (brian == bryan){
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        if (bryan.equals(brian)) {
            System.out.println("Bryan equals brian is true ");
        } else {
            System.out.println("Bryan equals brian is false ");
        }

        System.out.println("The total number of people we have is " + numOfPeople);

        String hw = "hello";
        hw = hw + " World";

        System.out.println(hw);
        System.out.println(hw.length());
        System.out.println(hw.indexOf('l'));

        Integer iObj = 10;
        int i = iObj;
        System.out.println(i);


    }
}
