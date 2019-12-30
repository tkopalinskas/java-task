package com.company;

public class Application {
    
    public static final int divider = Integer.MAX_VALUE;

    private long valueA;

    private long valueB;

    private static final int  MILLION = 1000000;

    private int counter = 0;

    private int iterations = 0;

    Application(long valueA, long valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public void startApplication() {
        generateAndCompare(valueA, valueB);
        System.out.println("Count: " + counter);
    }

    private void generateAndCompare(long valueA, long valueB) {
        long remainderA = valueA;
        long remainderB = valueB;
        while (iterations < MILLION) {
            remainderA = Generator.generateA(remainderA);
            remainderB = Generator.generateB(remainderB);
            if (Comperator.compare(remainderA, remainderB)) {
                counter++;
            }
            iterations++;
        }
    }
}