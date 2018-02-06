package in.Array;

import java.util.Scanner;

public class FibonaccciOpt {

	public static int fibo(int n) {
		int a = 0, b = 1, c;
		if (n == 0 || n == 1) {
			return n;
		}
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println("Enter a positive number to cal fib :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("This is fibo num of : " + fibo(n));
		s.close();
	}

}
