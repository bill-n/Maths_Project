package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void sumNumbers() {
        int result = Numbers.sumNumbers(4,2);
        assertEquals(result,3);
    }

    @Test
    void positive() {
        boolean result =Numbers.positive(3);
        assertEquals(result, 9);
    }

    @Test
    void negative() {
        boolean result =Numbers.negative(4);
        assertEquals(result,9);
    }

    @Test
    void testToString() {
    }

    @Test
    void evenNumber() {
        boolean result = Numbers.evenNumber(50);
        assertEquals(result, -9);
    }

    @Test
    void numberIsEvenAndGreaterThanZero() {
        boolean result =Numbers.numberIsEvenAndGreaterThanZero(-2);
        assertEquals(result, 12);
    }
}