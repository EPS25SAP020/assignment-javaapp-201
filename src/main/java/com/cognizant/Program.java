package com.cognizant.javaapp201.main;

import com.cognizant.javaapp201.operation.ShiyamalaaAddition;

public class Program {
    public static void main(String[] args) {
        ShiyamalaaAddition addition = new ShiyamalaaAddition();

        byte b1 = 10, b2 = 20;
        short s1 = 1000, s2 = 2000;
        int i1 = 5, i2 = 15;
        long l1 = 100000L, l2 = 200000L;
        float f1 = 1.5f, f2 = 2.5f;
        double d1 = 3.1415, d2 = 2.7182;

        System.out.println("Byte addition: " + addition.add(b1, b2));
        System.out.println("Short addition: " + addition.add(s1, s2));
        System.out.println("Int addition: " + addition.add(i1, i2));
        System.out.println("Long addition: " + addition.add(l1, l2));
        System.out.println("Float addition: " + addition.add(f1, f2));
        System.out.println("Double addition: " + addition.add(d1, d2));
    }
}
