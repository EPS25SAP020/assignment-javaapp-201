package com.cognizant.javaapp201.main;
 
import com.cognizant.javaapp201.operation.SinchanauhegdeDivision;
 
public class Program{
  public static void main(String[] args) {
	    SinchanauhegdeDivision sd = new SinchanauhegdeDivision();

        System.out.println("Byte division: " + sd.divide((byte) 10, (byte) 2));
        System.out.println("Short division: " + sd.divide((short) 10, (short) 2));
        System.out.println("Int division: " + sd.divide(10, 100));
        System.out.println("Long division: " + sd.divide(10L, 1000L));
        System.out.println("Float division: " + sd.divide(10.5f, 2.5f));
        System.out.println("Double division: " + sd.divide(10.5, 2.5));
 
    }
}