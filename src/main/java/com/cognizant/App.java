package com.cognizant;

import com.cognizant.javaapp201.operation.ArvindAddition;

public class App {
    public static void main(String[] args) {
		ArvindAddition arvindAddition = new ArvindAddition();
		
		System.out.println(arvindAddition.add((byte)10, (byte)2));
		System.out.println(arvindAddition.add((short)10, (short)2));
		System.out.println(arvindAddition.add(10, 2));
		System.out.println(arvindAddition.add(10L, 2L));
		System.out.println(arvindAddition.add(10.12F, 2.2F));
		System.out.println(arvindAddition.add(10.12, 2.2));
    }
}