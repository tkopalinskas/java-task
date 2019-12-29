package com.company;

public class Comperator {

    public static boolean compare(long generatedA, long generatedB) {
        byte lastbyteA = (byte)(generatedA & 0xFF);
        byte lastByteB = (byte)(generatedB & 0xFF);
        return (lastbyteA ^ lastByteB) == 0;
    }
}
