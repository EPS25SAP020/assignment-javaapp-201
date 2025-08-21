package com.cognizant;
import  com.cognizant.javaapp201.operation.KrishnendhuSubtraction;
import com.cognizant.javaapp201.mathematics.Subtraction;


public class App {
    public static void main(String[] args) {
		
		KrishnendhuSubtraction krishnendhuSubtraction=new KrishnendhuSubtraction();
		int bytesubresult=krishnendhuSubtraction.subtract((byte)10,(byte)2);
				System.out.println("Subtraction=" +bytesubresult);

		
		int shortsubresult=krishnendhuSubtraction.subtract((short)10,(short)2);
				System.out.println("Subtraction=" +shortsubresult);

		
		int intsubresult=krishnendhuSubtraction.subtract(10,2);
				System.out.println("Subtraction=" +intsubresult);

		
		
		long longsubresult=krishnendhuSubtraction.subtract(10L,2L);
		System.out.println("Subtraction=" +longsubresult);
		
		
		double floatsubresult=krishnendhuSubtraction.subtract(10.2f,2.2f);
				System.out.println("Subtraction=" +floatsubresult);

		
		
		double doublesubresult=krishnendhuSubtraction.subtract(10.33d,2.23d);
				System.out.println("Subtraction=" +doublesubresult);

		
    }
}
