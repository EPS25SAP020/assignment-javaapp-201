package com.cognizant;

import  com.cognizant.javaapp201.operation.*;

public class App {
    public static void main(String[] args) {
		KailashMultiplication kailashMultiplication = new KailashMultiplication();
		System.out.println(kailashMultiplication.multiply((byte) 10, (byte) 1));
		System.out.println(kailashMultiplication.multiply((short) 10, (short) 1));
		System.out.println(kailashMultiplication.multiply(10,1));
		System.out.println(kailashMultiplication.multiply(10L,1L));
		System.out.println(kailashMultiplication.multiply( 10.01,2.02));
		System.out.println(kailashMultiplication.multiply(10.01f,2.02f));
		
    }
}