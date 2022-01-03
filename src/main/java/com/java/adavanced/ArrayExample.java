package com.java.adavanced;

public class ArrayExample {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4 };

        int b[] = new int[3];

        for (int i = 0; i <= 2; i++) {
            b[i] = i;
        }

        System.out.println(b[2]);

        for (int j = 0; j < b.length; j++) {
            System.out.println("The value of arrya B is " + b[j] * 2);
        }

        System.out.println(a.length);

        System.out.println(a[2]);
        // multi dimmension array

        String[][] stngarray = { { "ABC", "1" }, { "BCD", "2" }, { "DEF", "3" }, { "FGH", "5" } };
        System.out.println("The value of String Array is " + stngarray[1][0]);

        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 2; l++)
                System.out.println("The value of Row " + k + "The value of Column " + l + stngarray[k][l]);

        }

        // Multi dimmensional array example find the smallest number from 3 dimensional
        // array

        int[][] dimm = { { 7, 2, 3 }, { 8, 4, 5 }, { 6, 4, 9 } };
        int min = dimm[0][0];
        int mincolumn;
        int maxcolumn;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println("The value of row " + i + "Value of coulmn " + j +
                // dimm[i][j]);
                // int currentval = dimm[i][j];
                // System.out.println("outer current val " + currentval);

                if (dimm[i][j] < min) {
                    min = dimm[i][j];
                    mincolumn = j;
                }
            }

        }
        System.out.println("The smallest of matrix val is: " + min);

        while (int m < 3) {

        }

    }

}
