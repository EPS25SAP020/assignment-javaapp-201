package com.cognizant;

import com.cognizant.javaapp01.operation.ArulkarthikMultiplication;

public class App {
    public static void main(String[] args) {
		ArulkarthikMultiplication arulkarthikMultiplication = new ArulkarthikMultiplication();
		
		int val1 = arulkarthikMultiplication.multiply((byte)1,(byte)1);
		System.out.println(val1);
		int val2 = arulkarthikMultiplication.multiply((short)1,(short)1);
		System.out.println(val2);
		int val3 = arulkarthikMultiplication.multiply(1,1);
		System.out.println(val3);
		long val4 = arulkarthikMultiplication.multiply(100000,1);
		System.out.println(val4);
		double val5 = arulkarthikMultiplication.multiply(1F,40F);
		System.out.println(val5);
		double val6 = arulkarthikMultiplication.multiply(111.22,1.34);
		System.out.println(val6);
		
		
		
    }
}