package java_fundamentals;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		if(a%4==0) {
			System.out.println(a+" is Even");
		}
		else {
			System.out.println(a+" is Odd");
		}
	}

}
