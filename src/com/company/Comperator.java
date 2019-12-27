package com.company;

public class Comperator {

    public static boolean compare(long generatedA, long generatedB) {
        String aString = Long.toBinaryString(generatedA);
        String bString = Long.toBinaryString(generatedB);
        System.out.println(aString);
        System.out.println(bString);
        return getLastEightBits(aString).equals(getLastEightBits(bString));
    }

    public static String getLastEightBits(String string) {
        return string.substring(string.length() - 8);
    }
}
