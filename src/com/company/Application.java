package com.company;

public class Application {
    
    public static final int divider = Integer.MAX_VALUE;

    private static final long factorA = 16807;

    private static final long factorB = 48271;

    private static final int  MILLION = 1000000;

    private long valueA;

    private long valueB;

    private Comparator comparator;

    private Generator generator;

    Application(long valueA, long valueB, Comparator comparator, Generator generator) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.comparator = comparator;
        this.generator = generator;
    }

    public void startApplication() {
        long counter = generateAndCompare(valueA, valueB);
        System.out.println("Count: " + counter);
    }

    private long generateAndCompare(long valueA, long valueB) {
        long remainderA = valueA;
        long remainderB = valueB;
        int iterations = 0;
        int counter = 0;
        while (iterations < MILLION) {
            remainderA = generator.generate(factorA, remainderA);
            remainderB = generator.generate(factorB, remainderB);
            if (comparator.areEqual(remainderA, remainderB)) {
                counter++;
            }
            iterations++;
        }
        return counter;
    }
}