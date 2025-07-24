package oops_Inheritance;

import java.util.*;

public class Question_14 {

	public static String removeXEnds(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		int start = 0;
		int end = str.length();

		if (str.charAt(0) == 'x') {
			start = 1;
		}

		if (end > 0 && str.charAt(end - 1) == 'x') {
			end = end - 1;
		}

		return str.substring(start, end);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		String result = removeXEnds(inputString);
		System.out.println(result);

		scanner.close();
	}
}