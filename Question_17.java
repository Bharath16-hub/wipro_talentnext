package oops_Inheritance;

import java.util.*;

public class Question_17 {

	public static String formatNames(ArrayList<String> names) {
		StringJoiner sj = new StringJoiner(",", "{", "}");
		for (String name : names) {
			sj.add(name);
		}
		return sj.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> nameList = new ArrayList<>();
		System.out.println("Enter names (type 'done' to finish):");
		String name;
		while (true) {
			name = scanner.nextLine();
			if (name.equalsIgnoreCase("done")) {
				break;
			}
			nameList.add(name);
		}

		String result = formatNames(nameList);
		System.out.println(result);

		scanner.close();
	}
}