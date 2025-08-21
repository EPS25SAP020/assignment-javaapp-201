package com.cognizant.javaapp201.operation;

import com.cognizant.javaapp201.mathematics.Subtraction;

public class NivedhaSubtraction extends Subtraction {

    @Override
    public int subtract(byte num1, byte num2) {
        return num1 - num2;
    }

    @Override
    public int subtract(short num1, short num2) {
        return num1 - num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public long subtract(long num1, long num2) {
        return num1 - num2;
    }

    @Override
    public double subtract(float num1, float num2) {
        return num1 - num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
}
