package com.company;

import com.company.Comparator;

public class LastByteComparator implements Comparator {

    public boolean areEqual(long valueA, long valueB) {
        byte lastByteA = (byte)(valueA & 0xFF);
        byte lastByteB = (byte)(valueB & 0xFF);
        return lastByteA == lastByteB;
    }
}
