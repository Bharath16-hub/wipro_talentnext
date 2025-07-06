package java_fundamentals;

import java.util.*;

public class Arrays_Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		Set<Integer> uniqueSet = new LinkedHashSet<>();
		for (int num : arr) {
			uniqueSet.add(num);
		}

		System.out.println("Array after removing duplicates:");
		for (int num : uniqueSet) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}