package com.company;

public class Comperator {

    public static boolean compare(long generatedA, long generatedB) {
        byte lastByteA = (byte)(generatedA & 0xFF);
        byte lastByteB = (byte)(generatedB & 0xFF);
        return (lastByteA ^ lastByteB) == 0;
    }
}
