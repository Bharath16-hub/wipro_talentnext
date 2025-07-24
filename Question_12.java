package oops_Inheritance;

import java.util.*;

public class Question_12 {

	public static String removeFirstAndLastChar(String str) {

		if (str == null || str.length() < 2) {
			return "";
		}

		return str.substring(1, str.length() - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		String result = removeFirstAndLastChar(inputString);
		System.out.println(inputString);
		System.out.println(result);

		scanner.close();
	}
}