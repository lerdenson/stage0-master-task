package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j <= cathetusLength * 2; j++) {
                if (j >= cathetusLength - i && j <= cathetusLength + i) {
                    if (j < cathetusLength) line.append(cathetusLength - j);
                    else if (j > cathetusLength + 1) line.append(j - cathetusLength);
                }
                else line.append(" ");
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
