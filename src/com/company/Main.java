package com.company;

public class Main {

    private static final long valueA = 65;
    private static final long valueB = 8921;

    public static void main(String[] args) {
        long initialValueA = 0;
        long initialValueB = 0;
        if (args.length == 2) {
            try {
                Long argValueA = Long.valueOf(args[0]);
                Long argValueB = Long.valueOf(args[1]);
                initialValueA = argValueA;
                initialValueB = argValueB;
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Using default numbers");
                initialValueA = valueA;
                initialValueB = valueB;
            }
        } else {
            initialValueA = valueA;
            initialValueB = valueB;
        }
        Application application = new Application(
            initialValueA, 
            initialValueB, 
            new LastByteComparator(),
            new ValueGenerator());

        application.startApplication();
    }
}
