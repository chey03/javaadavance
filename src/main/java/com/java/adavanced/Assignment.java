package com.java.adavanced;

public class Assignment {
    public static void main(String[] args) {

        int operand = 1;
        int depand = 1;
        depand++;
        ++operand;
        System.out.println(operand);
        int number = ++operand;
        System.out.println(depand);
        System.out.println(number);

        int predec = 3;
        --predec;
        System.out.println(predec);
        int decval = --predec;
        System.out.println(decval);

        /*
         * for (int i = 20; i < 10; i--) {
         * System.out.println(i);
         * }
         * 
         * System.out.println("------------------------------");
         * 
         * for (int j = 1; j <= 10; ++j) {
         * System.out.println(j);
         * }
         */

    }

}
