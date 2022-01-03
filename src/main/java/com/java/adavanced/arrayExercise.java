package com.java.adavanced;

import java.util.ArrayList;
import java.util.Collections;

public class arrayExercise {

    public static void main(String[] args) {

        // {4,6,7,3,4,4,7,6,6,6,3,7} from this identify unique number and print out no
        // of occurances

        int[] arr = { 4, 6, 7, 3, 4, 4, 7, 6, 6, 6, 3, 7 };
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            int res = 0;
            if (!al.contains(arr[i])) {

                al.add(arr[i]);
                res++;

                for (int j = i + 1; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        res++;
                    }

                }
                System.out.println(al.get(i) + " " + res);

            }

        }

    }

}
