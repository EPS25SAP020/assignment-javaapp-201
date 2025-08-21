package com.cognizant.javaapp201.main;

import com.cognizant.javaapp201.operation.VaishnaviAddition;

public class Program  {
    public static void main(String[] args) {

      VaishnaviAddition vaishnaviAddition = new VaishnaviAddition();
       

        System.out.println("byte sum = " + vaishnaviAddition.add((byte)10, (byte)30));
        System.out.println("short sum = " + vaishnaviAddition .add((short)1000, (short)3000));
        System.out.println("int sum = " + vaishnaviAddition .add(100, 300));
        System.out.println("long sum = " + vaishnaviAddition.add(100000L, 300000L));
        System.out.println("float sum = " + vaishnaviAddition.add(12.5f, 8.3f));
        System.out.println("double sum = " + vaishnaviAddition .add(12.5, 8.3));
  }

}