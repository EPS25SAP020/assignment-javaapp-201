package com.cognizant;

import com.cognizant.javaapp201.operation.kusumaSubtraction;

public class App {
    public static void main(String[] args) {
        kusumaSubtraction kusumaSubtraction = new kusumaSubtraction();

        byte b1 = 10, b2 = 5;
		short s1 = 1000, s2 = 500;
		int i1 = 10000, i2 = 5000;
		long l1 = 100000L, l2 = 50000L;
		float f1 = 5.5f, f2 = 2.2f;
		double d1 = 10.25, d2 = 4.75;


        System.out.println("Byte subtraction: " + kusumaSubtraction.subtractBytes(b1, b2));
        System.out.println("Short subtraction: " + kusumaSubtraction.subtractShorts(s1, s2));
        System.out.println("Int subtraction: " + kusumaSubtraction.subtractInts(i1, i2));
        System.out.println("Long subtraction: " + kusumaSubtraction.subtractLongs(l1, l2));
        System.out.println("Float subtraction: " + kusumaSubtraction.subtractFloats(f1, f2));
        System.out.println("Double subtraction: " + kusumaSubtraction.subtractDoubles(d1, d2));
    }
}
