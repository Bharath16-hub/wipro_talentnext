package java_fundamentals;

import java.util.*;

public class FCSQ17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=n;
		int rev = 0;
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		if (a == rev) {
			System.out.println(a + " is a Palindrome");
		} else {
			System.out.println(a + " is not a palindrome");
		}
		sc.close();
	}

}
