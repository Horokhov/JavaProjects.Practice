package Test;

import java.util.*;

public class SortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] numbers = new int[10];

	for (int i = 0; i < numbers.length; i++) {
		numbers[i] = rand.nextInt(100);
	}
	System.out.println("\nBefore:");
		printArray(numbers);
		
		insertionSort(numbers);
		System.out.println("\nAfter:");
		printArray(numbers);
	}

	public static void insertionSort(int[] inputArray) {
		// TODO Auto-generated method stub
		for (int i = 1; i < inputArray.length; i++) {
			int currentValue = inputArray[i];

			int j = i-1;

			while (j >= 0 && inputArray[j] > currentValue) {
				inputArray[j + 1] = inputArray[j];
				j--;
			}
			inputArray[j+1] = currentValue;
		}

	}

	public static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
