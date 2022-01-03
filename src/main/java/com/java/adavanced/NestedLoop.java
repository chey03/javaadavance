package com.java.adavanced;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                // System.out.println("The value of I : " + i + "The value of J :" + j + "=" + i
                // * j);
                // System.out.println(+i + "*" + j + "=" + i * j);
                System.out.printf("%d * %d = %d ", i, j, i * j);
                System.out.println("\t");

            }
            // System.out.println("\t");

        }
        int p = 1;
        int l = 1;
        for (int k = 0; k <= 4; k++) {
            for (int m = 1; m < k + 1; m++) {
                System.out.print(p++ + " ");
                // p++;

            }
            System.out.println();
        }
        for (int d = 0; d < 4; d++) {
            for (int e = 1; e <= 4 - d; e++) {
                System.out.print(l++ + " ");
                // p++;

            }

            System.out.println();
        }

        int num = 1;

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num * 3 + "\t");
                num++;

                // System.out.print(3 * j + "\t");

            }
            System.out.println(" ");
        }
    }

}
