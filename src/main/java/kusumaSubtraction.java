package com.cognizant.javaapp201.operation;

import com.cognizant.javaapp201.mathematics.Subtraction;

public class kusumaSubtraction extends Subtraction {

    public byte subtractBytes(byte a, byte b) {
        return (byte) (a - b);
    }

    public short subtractShorts(short a, short b) {
        return (short) (a - b);
    }

    public int subtractInts(int a, int b) {
        return a - b;
    }

    public long subtractLongs(long a, long b) {
        return a - b;
    }

    public float subtractFloats(float a, float b) {
        return a - b;
    }

    public double subtractDoubles(double a, double b) {
        return a - b;
    }
}
