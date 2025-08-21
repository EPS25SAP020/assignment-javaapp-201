package com.cognizant.javaapp201.operation;

import com.cognizant.javaapp201.mathematics.Multiplication;

public class VinayMultiplication extends Multiplication{
	public int multiply(byte num1, byte num2) {
		
		return (short)(num1 * num2);
		
	}
	
	public int multiply(short num1, short num2) {
	
		return num1 * num2;
		
	}
	
	public long multiply(int num1, int num2) {
		
		return num1 * num2;
		 
	}
	
	public long multiply(long num1, long num2) {
		
		return num1 * num2;
		
	}
	
	public double multiply(float num1, float num2) {
		
		return num1 * num2;
		
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
		
	}
}