package com.yguo.java;

import java.util.HashMap;

/**
 * @author yguo
 * @date 2020/5/1 8:36
 */
public class DebugerTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("name","Tom");
        hmap.put("age","thirty");
        hmap.put("school","Tsinghua");
        hmap.put("major","computer");

        String age = hmap.get("name");
        System.out.println("age = " + age);

        hmap.remove("major");
        System.out.println("hmap = " + hmap);

    }
}
