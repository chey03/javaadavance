package com.java.adavanced;

public class WhileDemo {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        while (i < 20) {
            System.out.println(i);
            i++;
        }

        do {
            j++;
            System.out.println(j);
        } while (j < 5);

    }
}
