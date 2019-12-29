package com.company;

public class Main {

    private static final long valueA = 635;
    private static final long valueB = 12;

    public static void main(String[] args) {
        Application application = new Application(valueA, valueB);
        application.startApplication();
    }
}
