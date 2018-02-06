package in.Array;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] agrs) {
		System.out.println("Enter a number to get Fibonacci seriese of :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (num == 0 || num == 1) {
			System.out.println("Fibonacci number : " + num);
			System.exit(0);
		}
		int[] arr = new int[num + 2];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < num; i++) {

			arr[i] = (arr[i - 1] + arr[i - 2]);
		}
		System.out.println("Fibonacci seriese of given number :");
		for (int j = 0; j < num; j++) {
			System.out.print(arr[j] + " ");
		}
		s.close();
	}
}
