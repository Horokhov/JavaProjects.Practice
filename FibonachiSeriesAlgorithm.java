package Test;

import java.util.Scanner;

public class FibonachiSeriesAlgorithm {

	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		fibonacciCache = new long[n+1];
		fibonacchi(n);
		System.out.println(fibonacchi(n));
	}

	private static long fibonacchi(int n) {
		// TODO Auto-generated method stub
		if(n <= 1) {
			return n;
		}
		if(fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		long nthFibonacciNumber = (fibonacchi(n - 1)+fibonacchi(n - 2));
		fibonacciCache[n] = nthFibonacciNumber;
		return nthFibonacciNumber;
	}

}
