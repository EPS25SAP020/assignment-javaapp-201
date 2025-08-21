package com.cognizant;

import com.cognizant.javaapp201.operation.VinayMultiplication;
public class App {
    public static void main(String[] args) {
		
		VinayMultiplication multiplication = new VinayMultiplication();
		
		System.out.println(multiplication.multiply((byte) 10, (byte) 20));
		System.out.println(multiplication.multiply((short) 10, (short) 20));
		System.out.println(multiplication.multiply(10 , 20));
		System.out.println(multiplication.multiply(10L , 20L));
		System.out.println(multiplication.multiply(10.4f , 20.5f));
		System.out.println(multiplication.multiply(10.3 , 20));
		
		
    }
}