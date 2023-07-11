package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (year % 100 == 0 && year % 400 != 0) days = 28;
                else days = ((year % 4 == 0) ? 29 : 28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        if ((days != 0)) {
            System.out.println(days);
        } else {
            System.out.println("invalid date");
        }
    }

}
