package java_fundamentals;

import java.util.*;

public class FCSQ13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int n = 10; n < 99; n++) {
			int count = 0;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					count += 1;
				}
			}

			if (count == 0) {
				System.out.println(n);
			}
		}

	}
}
