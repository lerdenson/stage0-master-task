package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int res = dividend / divider;
        if (divider != 0 && res * divider == dividend) System.out.println("can be divided completely");
        else if (divider != 0) System.out.println("cannot be divided completely");
        else System.out.println("division by zero");

    }

}
