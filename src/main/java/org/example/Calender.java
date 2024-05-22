package org.example;

public class Calender {
    public static void main(String[] args) {
        printCalendarForMonth("Januar");
        printCalendarForMonth("Februar");
        printCalendarForMonth("März");
        printCalendarForMonth("April");
        printCalendarForMonth("Mai");
        printCalendarForMonth("Juni");
        printCalendarForMonth("Juli");
        printCalendarForMonth("August");
        printCalendarForMonth("September");
        printCalendarForMonth("Oktober");
        printCalendarForMonth("November");
        printCalendarForMonth("Dezember");
    }

    public static void printCalendarForMonth(String monthName) {

        System.out.println(monthName);
        System.out.println("Mo Di Mi Do Fr Sa So");
        System.out.println(" 1  2  3  4  5  6  7");

        System.out.println();
    }

}
