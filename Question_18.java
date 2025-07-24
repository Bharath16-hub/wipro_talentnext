package oops_Inheritance;

import java.util.*;

public class Question_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s1Input = scanner.nextLine();
		StringJoiner s1 = new StringJoiner("-");

		for (String city : s1Input.split("-")) {
			s1.add(city.trim());
		}

		String s2Input = scanner.nextLine();
		StringJoiner s2 = new StringJoiner("-");

		for (String city : s2Input.split("-")) {
			s2.add(city.trim());
		}

		StringJoiner s1CopyForMerge = new StringJoiner("-");
		StringJoiner s2CopyForMerge = new StringJoiner("-");
		s1CopyForMerge.merge(s1);
		s2CopyForMerge.merge(s2);

		s2CopyForMerge.merge(s1CopyForMerge);
		System.out.println("s1 merged to s2: " + s2CopyForMerge.toString());

		StringJoiner s1CopyForMerge2 = new StringJoiner("-");
		StringJoiner s2CopyForMerge2 = new StringJoiner("-");
		s1CopyForMerge2.merge(s1);
		s2CopyForMerge2.merge(s2);

		s1CopyForMerge2.merge(s2CopyForMerge2);
		System.out.println("s2 merged to s1: " + s1CopyForMerge2.toString());

		scanner.close();
	}
}