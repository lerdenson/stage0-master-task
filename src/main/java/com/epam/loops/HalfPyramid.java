package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < cathetusLength; j++) {
                if (j >= cathetusLength - i) line.append("*");
                else line.append(" ");
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
