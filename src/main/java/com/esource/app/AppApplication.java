package com.esource.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.esource.app.service.NumberExtractorService;

@SpringBootApplication
public class AppApplication {

    private static final int MAX_NUMBER = 50;
	private static final int SIZE_OF_ARRAY = 15;

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class, args);
        
        NumberExtractorService numberExtractorService = context.getBean(NumberExtractorService.class);

        List<Integer> array1 = generateRandomArray();
        List<Integer> array2 = generateRandomArray();
        List<Integer> array3 = generateRandomArray();

        System.out.println("Generated arrays:");
        System.out.println("Array 1: " + array1);
        System.out.println("Array 2: " + array2);
        System.out.println("Array 3: " + array3);

        List<Integer> availableNumbers = numberExtractorService.extractAvailableNumbers(array1, array2, array3);
        System.out.println("Available numbers: " + availableNumbers);

        int largestPrime = numberExtractorService.findLargestPrime(availableNumbers);
        if (largestPrime != -1) {
            System.out.println("Largest prime: " + largestPrime);
        }
    }

    private static List<Integer> generateRandomArray() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            array.add((int) (Math.random() * MAX_NUMBER+1));
        }
        return array;
    }
}

