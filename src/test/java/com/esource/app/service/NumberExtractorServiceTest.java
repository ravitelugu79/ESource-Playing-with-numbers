package com.esource.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class NumberExtractorServiceTest {

    private final NumberExtractorService numberExtractorService = new NumberExtractorService();

    @Test
    void testExtractAvailableNumbers() {
        List<Integer> array1 = Arrays.asList(41, 22, 9, 28, 8, 23, 22, 23, 40, 16, 16, 36, 0, 43, 14);
        List<Integer> array2 = Arrays.asList(35, 31, 46, 17, 22, 42, 37, 11, 17, 16, 48, 29, 8, 44, 44);
        List<Integer> array3 = Arrays.asList(45, 23, 2, 1, 23, 42, 26, 3, 42, 10, 24, 7, 9, 49, 17);

        List<Integer> availableNumbers = numberExtractorService.extractAvailableNumbers(array1, array2, array3);
        
        assertTrue(availableNumbers.contains(4));
        assertTrue(availableNumbers.contains(5));
        assertTrue(availableNumbers.contains(12));
    }

    @Test
    void testFindLargestPrime() {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 12, 13, 15, 18, 19, 20, 21, 25, 27, 30, 32, 33, 34, 38, 39, 47, 50);

        int largestPrime = numberExtractorService.findLargestPrime(numbers);
        
        assertEquals(47, largestPrime);
    }

    @Test
    void testFindLargestPrimeNotFound() {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 9,12, 15, 18, 20, 21, 24, 30, 32, 34, 38, 42, 50);

        int largestPrime = numberExtractorService.findLargestPrime(numbers);

        assertEquals(-1, largestPrime);
    }
}
