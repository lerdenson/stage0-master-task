package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int days;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 2:
                if (year % 100 == 0 && year % 400 != 0) days = 28;
                else days = ((year % 4 == 0) ? 29 : 28);
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            default:
                days = 0;
                break;
        }
        if ((days != 0)) {
            System.out.println(days);
        } else {
            System.out.println("invalid date");
        }
    }

}
