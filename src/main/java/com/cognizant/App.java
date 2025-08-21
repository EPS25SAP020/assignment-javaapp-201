package com.cognizant;
import com.cognizant.javaapp201.operation.MehathajSubtraction;

public class App {
    public static void main(String[] args) {
		MehathajSubtraction mehathajSubtraction = new MehathajSubtraction();
		
		int output1 = mehathajSubtraction.subtract((byte)10,(byte)8);
		System.out.println(output1);
		
		int output2 = mehathajSubtraction.subtract((short)10,(short)8);
		System.out.println(output2);
		
		int output3 = mehathajSubtraction.subtract(10,8);
		System.out.println(output3);
		
		long output4 = mehathajSubtraction.subtract(10L,8L);
		System.out.println(output4);
		
		double output5 = mehathajSubtraction.subtract(10.45f,8.12f);
		System.out.println(output5);
		
		double output6 = mehathajSubtraction.subtract(10.12,8.10);
		System.out.println(output6);
    }
}