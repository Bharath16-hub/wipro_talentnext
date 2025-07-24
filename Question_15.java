package oops_Inheritance;

import java.util.*;

public class Question_15 {

	public static String removeStarAndNeighbors(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*') {

				if (i > 0) {
					if (result.length() > 0) {
						result.setLength(result.length() - 1);
					}
				}

				if (i < str.length() - 1) {
					i++;
				}
			} else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}

	public static String removeStarAndNeighborsOptimized(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*') {

				if (i < str.length() - 1) {
					i++;
				}

				if (result.length() > 0) {
					result.setLength(result.length() - 1);
				}
			} else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		String result = removeStarAndNeighborsOptimized(inputString);
		System.out.println(result);

		scanner.close();
	}
}