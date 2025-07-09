package oops_Inheritance;

import java.util.Scanner;

class Calculator {

	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}

public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int intBase = sc.nextInt();

		int intExponent = sc.nextInt();

		int resultInt = Calculator.powerInt(intBase, intExponent);
		System.out.println("powerInt(" + intBase + ", " + intExponent + ") = " + resultInt);

		double doubleBase = sc.nextDouble();

		int doubleExponent = sc.nextInt();

		double resultDouble = Calculator.powerDouble(doubleBase, doubleExponent);
		System.out.println("powerDouble(" + doubleBase + ", " + doubleExponent + ") = " + resultDouble);

		sc.close();
	}
}
