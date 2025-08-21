package com.cognizant;
import com.cognizant.javaapp201.mathematics.AbishuaMultiplication;
public class App {
    public static void main(String[] args) {
		AbishuaMultiplication obj = new AbishuaMultiplication();
		
		System.out.println(obj.multiply((byte)2,(byte)2));
		System.out.println(obj.multiply((short)2,(short)2));
		System.out.println(obj.multiply(200,600));
		System.out.println(obj.multiply(1234L,2345L));
		System.out.println(obj.multiply(23.0F,234.3F));
		System.out.println(obj.multiply(234.33,4532.11));
    }
}