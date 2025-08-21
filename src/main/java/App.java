package com.cognizant;

import com.cognizant.javaapp201.operation.NivedhaSubtraction;
import com.cognizant.javaapp201.mathematics.Subtraction;

public class App {
    public static void main(String[] args) {
        NivedhaSubtraction  nivedhaSubtraction = new NivedhaSubtraction();

        System.out.println("Byte subtraction: " + nivedhaSubtraction.subtract((byte)10, (byte)5));
        System.out.println("Short subtraction: " + nivedhaSubtraction.subtract((short)10, (short)5));
        System.out.println("Int subtraction: " + nivedhaSubtraction.subtract(20, 15));
        System.out.println("Long subtraction: " + nivedhaSubtraction.subtract(100L, 50L));
        System.out.println("Float subtraction: " + nivedhaSubtraction.subtract(10.5f, 4.2f));
        System.out.println("Double subtraction: " + nivedhaSubtraction.subtract(99.99, 33.33));
    }
}
