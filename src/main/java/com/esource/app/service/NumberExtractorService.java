package com.esource.app.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class NumberExtractorService {

	private static final int MAX_NUMBER = 50;

	public List<Integer> extractAvailableNumbers(List<Integer> array1, List<Integer> array2, List<Integer> array3) {
		List<Integer> availableNumbers = new ArrayList<>();

		for (int num = 0; num <= MAX_NUMBER; num++) {
			if (!array1.contains(num) && !array2.contains(num) && !array3.contains(num)) {
				availableNumbers.add(num);
			}
		}

		return availableNumbers;
	}

	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int findLargestPrime(List<Integer> numbers) {
		for (int i = numbers.size() - 1; i >= 0; i--) {
			if (isPrime(numbers.get(i))) {
				return numbers.get(i);
			}
		}
		return -1;
	}
}
