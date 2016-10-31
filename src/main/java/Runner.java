/*
 * Copyright (c) 2016 by VIF (Vignon Informatique France)
 * Project : zz
 * File : $RCSfile$
 * Created on 31 oct. 2016 by yv
 */
package main.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Runner {

    public static void main(String[] args) {
        System.out.println("RUNNER START");

        List<String> testEmpty = new ArrayList<String>();
        int testEmptyResult = computeItemNb(testEmpty);
        System.out.println("testEmptyResult = " + testEmptyResult);

        List<String> test10 = new ArrayList<String>();
        test10.add("0467123456");
        int test10Result = computeItemNb(test10);
        System.out.println("test10Result = " + test10Result);

        List<String> test20 = new ArrayList<String>();
        test20.add("0123456789");
        test20.add("1123456789");
        int test20Result = computeItemNb(test20);
        System.out.println("test20Result = " + test20Result);

        List<String> test10_2 = new ArrayList<String>();
        test10_2.add("0123456789");
        test10_2.add("0123");
        int test10_2Result = computeItemNb(test10_2);
        System.out.println("test10_2Result = " + test10_2Result);

        List<String> test28 = new ArrayList<String>();
        test28.add("0412578440");
        test28.add("0412199803");
        test28.add("0468892011");
        test28.add("112");
        test28.add("15");
        int test28Result = computeItemNb(test28);
        System.out.println("test28Result = " + test28Result);

        System.out.println("RUNNER END");
    }

    private static int computeItemNb(List<String> phoneNumbers) {
        int itemNb = 0;
        if (phoneNumbers != null && !phoneNumbers.isEmpty()) {
            Map<Integer, List<String>> storage = new HashMap<Integer, List<String>>();
            Collections.sort(phoneNumbers);
            for (String number : phoneNumbers) {
                if (number.length() > 0) {
                    int item = number.charAt(0);
                    if (storage.keySet().contains(item)) {
                        storage.get(item).add(number.substring(1));
                    } else {
                        List<String> sublist = new ArrayList<String>();
                        sublist.add(number.substring(1));
                        storage.put(item, sublist);
                    }
                }
            }
            for (List<String> entry : storage.values()) {
                itemNb = itemNb + 1 + computeItemNb(entry);
            }
        }
        return itemNb;
    }

}
