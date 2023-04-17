package Test;

import java.util.Scanner;

public class FibonacciSeriesAlgorithm {

	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		fibonacciCache = new long[n+1];
		fibonacci(n);
		System.out.println(fibonacci(n));
	}

	private static long fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n <= 1) {
			return n;
		}
		if(fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		long nthFibonacciNumber = (fibonacci(n - 1)+fibonacci(n - 2));
		fibonacciCache[n] = nthFibonacciNumber;
		return nthFibonacciNumber;
	}

}
