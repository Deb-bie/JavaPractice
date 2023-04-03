package org.example.Greeting;

public class Switch {
    private int dayNumber;
    private String dayName;

    private String day;
    private String dayMessage;

    public void setDayNumber (int number){
        this.dayNumber = number;
    }

    public void setDay (String myDay){
        this.day = myDay;
    }

    public String getDay (){
        switch (dayNumber){
            case 0:
                dayName = "Sunday";
                break;

            case 1:
                dayName = "Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;

            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;
        }
        return dayName;
    }


    public String getDayWithString (){
        switch (day) {
            case "Sunday":
                dayMessage = "This marks the first day of the week. It is usually used for resting";
                break;

            case "Monday":
                dayMessage = "This is the second day of the week. And almost everyone doesn't like it";
                break;

            case "Tuesday":
                dayMessage = "Early week - boo";
                break;

            case "Wednesday":
                dayMessage = "Sigh..... it's wednesday";
                break;

            case "Thursday":
                dayMessage = "It's getting betterrrrrrrrrr";
                break;

            case "Friday":
                dayMessage = "The day almost everyone loves....purrr";
                break;

            case "Saturday":
                dayMessage = "That's my day guyssss";
                break;
        }

        return dayMessage;
    }



    public String getDayWithYield (){
        var result = switch (day) {
            case "Sunday" -> "This marks the first day of the week. It is usually used for resting";
            case "Monday" -> "This is the second day of the week. And almost everyone doesn't like it";
            case "Tuesday" -> "Early week - boo";
            case "Wednesday" -> "Sigh..... it's wednesday";
            case "Thursday" -> "It's getting betterrrrrrrrrr";
            case "Friday" -> "The day almost everyone loves....purrr";
            case "Saturday" -> "That's my day guyssss";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        return result;
    }








    public static void main (String[] args){
        Switch mySwitch = new Switch();
        mySwitch.setDayNumber(4);
        System.out.println("Today is " + mySwitch.getDay());

        mySwitch.setDay("Friday");
//        System.out.println(mySwitch.getDayWithString());
        System.out.println(mySwitch.getDayWithYield());

    }
}
