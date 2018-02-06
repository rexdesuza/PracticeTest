package in.Array;

import java.util.Scanner;

public class FibonacciNumber {

	public static int fibNum(int n) {

		if (n == 0 || n == 1)
			return n;
		return fibNum(n - 1) + fibNum(n - 2);

	}

	public static void main(String[] args) {
		System.out.println("Enter a number to get Fibonacci number of : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Fibonacci number of given number : " + fibNum(n));
		s.close();
	}
}
