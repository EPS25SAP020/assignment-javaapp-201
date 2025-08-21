package com.cognizant;
import  com.cognizant.javaapp201.operation.SreelakshmiSubtraction;
import com.cognizant.javaapp201.mathematics.Subtraction;
public class App {
    public static void main(String[] args) {
		
		 SreelakshmiSubtraction  sreelakshmiSubtraction=new SreelakshmiSubtraction();
		int bytesubresult= sreelakshmiSubtraction.subtract((byte)10,(byte)2);
				System.out.println("Subtraction=" +bytesubresult);

		
		int shortsubresult= sreelakshmiSubtraction.subtract((short)10,(short)2);
				System.out.println("Subtraction=" +shortsubresult);

		
		int intsubresult= sreelakshmiSubtraction.subtract(10,2);
				System.out.println("Subtraction=" +intsubresult);

		
		
		long longsubresult= sreelakshmiSubtraction.subtract(10L,2L);
		System.out.println("Subtraction=" +longsubresult);
		
		
		double floatsubresult= sreelakshmiSubtraction.subtract(10.2f,2.2f);
				System.out.println("Subtraction=" +floatsubresult);

		
		
		double doublesubresult= sreelakshmiSubtraction.subtract(10.33d,2.23d);
				System.out.println("Subtraction=" +doublesubresult);

		
    }
}
