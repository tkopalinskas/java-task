package com.company;

import static com.company.Generator.divider;

public class Main {

    private static final long valueA = 65L;
    private static final long valueB = 8921L;
    private static final int  MILLION = 1000000;

    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        generateAndCompare(valueA, valueB, i, x);
        System.out.println("counter:" + i);
    }

    private static void generateAndCompare(long valueA, long valueB, int i, int x) {
        long remainderA = GeneratorA.generateValue(valueA);
        System.out.println(remainderA);
        long remainderB = GeneratorB.generateValue(valueB);
        System.out.println(remainderB);
        if (Comperator.compare(remainderA, remainderB)) {
            i++;
            System.out.println("II: " + i);
        }
        x++;
        if (x < 4) {
            long l = remainderA & Math.floorDiv(remainderA, divider);
            generateAndCompare(Math.floorDiv(remainderA, divider), Math.floorDiv(remainderB, divider), i, x);
        }
    }
}
