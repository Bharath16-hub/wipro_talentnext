package oops_Inheritance;

import java.util.*;

public class Question_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String addressInput = scanner.nextLine();

		String address = addressInput.isEmpty() ? null : addressInput;

		String finalAddress = Optional.ofNullable(address).orElse("India");

		System.out.println(finalAddress);

		scanner.close();
	}
}