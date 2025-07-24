package oops_Inheritance;

import java.util.*;

public class Question_16 {

	public static String combineAlternately(String a, String b) {
		StringBuilder result = new StringBuilder();
		int maxLength = Math.max(a.length(), b.length());

		for (int i = 0; i < maxLength; i++) {
			if (i < a.length()) {
				result.append(a.charAt(i));
			}
			if (i < b.length()) {
				result.append(b.charAt(i));
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputLine = scanner.nextLine();

		String[] parts = inputLine.split(",");
		String stringA = parts[0];
		String stringB = parts.length > 1 ? parts[1] : "";

		String result = combineAlternately(stringA, stringB);
		System.out.println(result);

		scanner.close();
	}
}