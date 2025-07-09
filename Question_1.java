package oops_Inheritance;

import java.util.Scanner;

class Box {
	int w, h, d;

	public Box(int w, int h, int d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}

	public int volume() {
		return w * h * d;
	}
}

public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int width = sc.nextInt();

		int height = sc.nextInt();

		int depth = sc.nextInt();

		Box b = new Box(width, height, depth);

		System.out.println("Volume of the box: " + b.volume());

		sc.close();
	}
}
