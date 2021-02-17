package org.thermoweb.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void testFizzBuzz() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        assertEquals("13", FizzBuzz.fizzbuzz(13));
    }

}