package com.java.adavanced;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        // difference between hashmap and hashtable
        // Hashmap is not syncronized and threadsafe where as table is always
        // sycnronized and threadsafe
        // Hashmap acceppts null/blank details where table does not
        // Hash map values are iterated using iterator where as table uses enumarator to
        // iterator through values

        hm.put(0, "London");
        hm.put(1, "NewYork");
        hm.put(2, "Tokyo");
        hm.put(3, "Mumbai");
        // hm.put(3, "Tokyo");
        // Duplicate values are ignored for HasMap
        System.out.println(hm);
        // System.out.println(hm.get(2));
        // System.out.println(hm.remove(3));

        Set st = hm.entrySet();
        Iterator it = st.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());

            Map.Entry mp = (Map.Entry) it.next();

            System.out.print(mp.getKey());
            System.out.print(mp.getValue());
            // System.out.println(" -------------");

        }

        // System.out.println( hm.entrySet());
    }

}
