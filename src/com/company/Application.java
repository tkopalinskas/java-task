package com.company;

public class Application {
    
    public static final int divider = Integer.MAX_VALUE;

    private long valueA;

    private long valueB;

    private static final int  MILLION = 1000000;

    private int counter = 0;

    private int revolotions = 0;

    Application(long valueA, long valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public void startApplication() {
        generateAndCompare(valueA, valueB);
        System.out.println("count: " + counter);
    }

    private void generateAndCompare(long valueA, long valueB) {
        long remainderA = valueA;
        long remainderB = valueB;
        while (revolotions < MILLION) {
            remainderA = GeneratorA.generateValue(remainderA);
            remainderB = GeneratorB.generateValue(remainderB);
            if (Comperator.compare(remainderA, remainderB)) {
                counter++;
            }
            revolotions++;
        }
    }
}