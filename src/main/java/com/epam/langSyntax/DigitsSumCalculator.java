package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        while (number != 0) {
            int a = number % 10;
            sum += a;
            number /= 10;
        }
        System.out.println(sum);
    }

}
