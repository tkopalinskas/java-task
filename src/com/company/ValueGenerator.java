package com.company;

import com.company.Generator;

public class ValueGenerator implements Generator {

    public long generate(long factor, long value) {
        return (value * factor) % Application.divider;
    }
}
