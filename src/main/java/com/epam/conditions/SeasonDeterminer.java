package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 3 && monthNumber < 6)
            System.out.println("Spring");
        else if (monthNumber >= 6 && monthNumber < 9)
            System.out.println("Summer");
        else if (monthNumber >= 9 && monthNumber < 12)
            System.out.println("Autumn");
        else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2)
            System.out.println("Winter");
        else System.out.println("Wrong month number");
    }

}
