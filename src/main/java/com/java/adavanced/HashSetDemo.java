package com.java.adavanced;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    // Hashset. treeset and linkedhash set implements set interface
    // set does not accept duplicate values where as list accepts them
    // In set there is no gaurantee that elements are stored in sequence flow

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("Test1");
        hs.add("Test1");// to prove duplicate values is ignoreed
        hs.add("Test2");
        hs.add("Test3");
        hs.add("Test4");
        System.out.println(hs.size());
        System.out.println(hs.contains("Test1"));
        System.out.println(hs.isEmpty());
        System.out.println(hs);
        Iterator<String> it = hs.iterator();
        // to print individual items
        System.out.println(it.next());
        // System.out.println(it.next());
        // to print all the items in the set
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
