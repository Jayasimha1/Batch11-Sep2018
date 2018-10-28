package com.bell.b11.day18;

import java.util.Scanner;

public class EnumDemo {

    enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}


    Day day;

    public EnumDemo(Day day) {
        this.day = day;
        System.out.println("Day is "+day.name() );
        System.out.println("Day is "+day.ordinal());
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        EnumDemo firstDay = new EnumDemo(Day.MONDAY);
        //firstDay.tellItLikeItIs();
        EnumDemo thirdDay = new EnumDemo(Day.WEDNESDAY);
        //thirdDay.tellItLikeItIs();
        EnumDemo fifthDay = new EnumDemo(Day.FRIDAY);
        //fifthDay.tellItLikeItIs();
        EnumDemo sixthDay = new EnumDemo(Day.SATURDAY);
        //sixthDay.tellItLikeItIs();
        EnumDemo seventhDay = new EnumDemo(Day.SUNDAY);
        //seventhDay.tellItLikeItIs();
    }



}
