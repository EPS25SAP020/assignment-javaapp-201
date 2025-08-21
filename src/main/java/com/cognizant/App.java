package com.cognizant;

import com.cognizant.javaapp201.operation.DianaAddition;

public class App {
    public static void main(String[] args) {
		DianaAddition dianaAddition = new DianaAddition();
		
		System.out.println( "Bytes Addition(10,2):" + dianaAddition.add( (byte)10, (byte)2 ) );
		System.out.println( "Shorts Addition(10,2):" + dianaAddition.add( (short)10, (short)2 ) );
		System.out.println( "Int Addition(10,2):" + dianaAddition.add( 10, 2 ) );
		System.out.println( "Float Addition(10.01,2.03):" + dianaAddition.add( 10.01F, 2.03F ) );
		System.out.println( "Long Addition(10,2):" + dianaAddition.add( 10L, 2L ) );
		System.out.println( "Double Addition(10.01,2.03):" + dianaAddition.add( 10.01, 2.03 ) );
    }
}