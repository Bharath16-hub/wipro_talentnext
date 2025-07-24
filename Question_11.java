package oops_Inheritance;

import java.util.Scanner;

public class Question_11 {
	public static String repeatString(String s, int n) {

		String firstTwoChars;
		if (s.length() >= 2) {
			firstTwoChars = s.substring(0, 2);
		} else {

			firstTwoChars = s;
		}

		int actualRepeatCount = s.length();
		return firstTwoChars.repeat(actualRepeatCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int N = input.length();

		System.out.println(repeatString(input, N));
		sc.close();
	}
}