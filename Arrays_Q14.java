package java_fundamentals;

import java.util.*;

public class Arrays_Q14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[3][3];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				while (!scanner.hasNextInt()) {
					
					scanner.next(); 
				}
				array[i][j] = scanner.nextInt();
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}

	
		System.out.println("\nThe given array is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nThe biggest number in the given array is " + max);
		scanner.close();
	}
}