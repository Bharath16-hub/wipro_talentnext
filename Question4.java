package java_fundamentals;

import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 0) {
			System.out.println(a + " is Positive");
		} else if (a < 0) {
			System.out.println(a + " is Negative");
		} else {
			System.out.println("It is Zero");
		}
	}

}
