package com.cognizant.javaapp201.main;

import com.cognizant.javaapp201.operation.JhansiAddition;

public class App{
    public static void main(String[] args){
	
	JhansiAddition addition=new JhansiAddition();
	
	System.out.println("byte sum = " + addition.add((byte)10, (byte)20));

    System.out.println("short sum = " + addition.add((short)1000, (short)2000));

    System.out.println("int sum = " + addition.add(100, 200));

    System.out.println("long sum = " + addition.add(100000L, 200000L));

    System.out.println("float sum = " + addition.add(12.5f, 7.3f));

    System.out.println("double sum = " + addition.add(12.5, 7.3));

    }

}


