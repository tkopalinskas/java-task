package com.company;

public class GeneratorA {

    public static long generateValue(long initialValue) {
        long factor = 16807L;
        return (initialValue * factor) % Application.divider;
    }
}
