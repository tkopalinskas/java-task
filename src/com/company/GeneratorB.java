package com.company;

public class GeneratorB {

    public static long generateValue(long initialValue) {
        long factor = 48271L;
        return (initialValue * factor) % Application.divider;
    }
}
