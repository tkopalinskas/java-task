package com.company;

public class Generator {

    public static long generateA(long initialValue) {
        long factor = 16807L;
        return (initialValue * factor) % Application.divider;
    }

    public static long generateB(long initialValue) {
        long factor = 48271L;
        return (initialValue * factor) % Application.divider;
    }
}
