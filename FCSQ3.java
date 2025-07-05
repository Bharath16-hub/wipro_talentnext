package java_fundamentals;

import java.util.Scanner;

public class FCSQ3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if (input.isEmpty()) {
			System.out.println("No values");
		} else {
			System.out.println(input.trim().replaceAll("\\s+", ","));
		}
	}
}
