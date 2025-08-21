package com.cognizant.javaapp201.mathematics;
import com.cognizant.javaapp201.mathematics.Multiplication;

public class AkashMultiplication extends Multiplication{
	public int multiply(byte num1, byte num2) {
		short result = (short) (num1 * num2);
		return result;
	}
	
	public int multiply(short num1, short num2) {
		int result = (short) num1 * (short) num2;
		return (int) result;
	}
	
	public int multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	public long multiply(long num1, long num2) {
		long result = num1 * num2;
		return result;
	}
	
	public double multiply(float num1, float num2) {
		double result = num1 * num2;
		return result;
	}
	
	public double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
}