package org.thermoweb.review;

import java.util.*;

public class PrimeNumberGenerator {

    public static boolean isPrime(int number) {
        boolean bool = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                bool = false;
            } else {
                bool = true;
            }
        }

        return bool;
    }

    public static List<Integer> primerNumbers() {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public static void main(String[] args) {
        List<Integer> primeNumberList = primerNumbers();
        System.out.println(primeNumberList);
    }
}
