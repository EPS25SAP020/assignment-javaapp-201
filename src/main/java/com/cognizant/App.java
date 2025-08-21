package com.cognizant;

import com.cognizant.javaapp201.operation.KanmaniAddition;

public class App {
    public static void main(String[] args) {
        KanmaniAddition adder = new KanmaniAddition();
		
		System.out.println("Byte sum : " + adder.add((byte)10, (byte)2));
        System.out.println("Int sum : "  + adder.add(10, 2));
        System.out.println("long sum : "  + adder.add(10L, 2L));
        System.out.println("short sum : "  + adder.add((byte)10, (byte)2));
        System.out.println("float sum : "  + adder.add(10.2F,2.2F));
        System.out.println("double sum : "  + adder.add((double)10.2, (double)2.2));
    }
}
