package com.java.adavanced;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Test1");
        al.add("Test2");
        al.add("Test3");
        al.add("Test6");
        al.add("Test5");
        al.add("Test5");
        al.add(0, "Test4");
        System.out.println(al);

        al.remove(2);
        al.remove("Test4");

        System.out.println(al);
        System.out.println(al.get(1));
        System.out.println(al.contains("Test1"));
        System.out.println(al.indexOf("Test6"));
        System.out.println(al.size());
    }

}
