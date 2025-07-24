package oops_Inheritance;

import java.util.*;

public class Question_13 {

	public static String combineStrings(String a, String b) {
		String shorterString;
		String longerString;

		if (a.length() < b.length()) {
			shorterString = a;
			longerString = b;
		} else {

			shorterString = b;
			longerString = a;
		}

		return shorterString + longerString + shorterString;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String stringA = scanner.nextLine();

		String stringB = scanner.nextLine();

		String result = combineStrings(stringA, stringB);
		System.out.println(result);

		scanner.close();
	}
}