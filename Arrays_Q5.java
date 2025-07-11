package java_fundamentals;

import java.util.*;

public class Arrays_Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println("Smallest two numbers: " + arr[0] + ", " + arr[1]);

		System.out.println("Largest two numbers: " + arr[size - 2] + ", " + arr[size - 1]);

		sc.close();
	}
}