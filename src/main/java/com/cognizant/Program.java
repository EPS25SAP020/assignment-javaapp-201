package com.cognizant.main;

import com.cognizant.javaapp201.operation.SinchanamrAddition;

public class Program extends SinchanamrAddition {
    public static void main(String[] args) {
        Program program = new Program();

        System.out.println("byte sum = " + program.add((byte)10, (byte)20));
        System.out.println("short sum = " + program.add((short)1000, (short)2000));
        System.out.println("int sum = " + program.add(100, 200));
        System.out.println("long sum = " + program.add(100000L, 200000L));
        System.out.println("float sum = " + program.add(12.5f, 7.3f));
        System.out.println("double sum = " + program.add(12.5, 7.3));
    }
}
