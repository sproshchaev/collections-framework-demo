package com.prosoft;

import java.lang.reflect.Field;
import java.util.Map;

public class InsideMap {

    public static void scan(Map map) throws NoSuchFieldException, IllegalAccessException {
        Field table = map.getClass().getDeclaredField("table");
        table.setAccessible(true);
        Object[] obj = (Object[]) table.get(map);
        table.setAccessible(false);
        if (obj != null) {
            System.out.println("Число bucket (размер массива)=" + obj.length);
            System.out.println("");
            for (int i = 0; i < obj.length; i++) {
                System.out.println(i + ": " + obj[i]);
            }
        } else {
            System.out.println("Массив с бакетами не создан");
        }
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }


}
