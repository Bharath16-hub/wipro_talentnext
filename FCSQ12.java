package java_fundamentals;

import java.util.*;

public class FCSQ12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}
		if (count > 0) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}
