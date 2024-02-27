package com.prosoft;
import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.*;

import static com.prosoft.InsideMap.hash;



/**
 * Java collections framework demo (Java 11)
 *
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        System.out.println(hashSet);

        // size
        System.out.println("size: " + hashSet.size());

        System.out.println("");

        // iterator
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("value: " + iterator.next());
        }

        System.out.println("");

        // for-each
        for (String string : hashSet) {
            System.out.println(string);
        }

        System.out.println();

        // remove
        System.out.println("remove: " + hashSet.remove("3"));
        System.out.println("hashSet: " + hashSet);

        // contains()
        System.out.println("contains: " + hashSet.contains("20"));

        // clear()
        hashSet.clear();
        System.out.println(hashSet);

        // isEmpty
        System.out.println(hashSet.isEmpty());

    }
}




















// InsideMap.scan(map);
// System.out.println("Индекс для " + str + "=" + (InsideMap.hash(str) & (16 - 1)));