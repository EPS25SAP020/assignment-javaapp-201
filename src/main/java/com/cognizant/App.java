package com.cognizant;

import com.cognizant.javaapp201.operation.TejasreeSubraction;

public class App {
    public static void main(String[] args) {
		TejasreeSubraction tejasreeSubraction = new TejasreeSubraction();
		int subByte = tejasreeSubraction.subtract((byte)10, (byte)2);
		System.out.println(subByte);
		
		int subShort = tejasreeSubraction.subtract((short)10, (short)2);
		System.out.println(subShort);
		
		int subInt = tejasreeSubraction.subtract(10, 2);
		System.out.println(subInt);
		
		long subLong = tejasreeSubraction.subtract(10L, 2L);
		System.out.println(subLong);
		
		double subFloat = tejasreeSubraction.subtract(10f, 2f);
		System.out.println(subFloat);
		
		double subDouble = tejasreeSubraction.subtract(10, 2);
		System.out.println(subDouble);
    }
}