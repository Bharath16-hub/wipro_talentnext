package oops_Inheritance;

import java.util.Scanner;

public class Question_7{
	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}

   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String input=sc.nextLine();
	   
	   if(reverse(input).equals(input)) {
		   System.out.println("ispalindrome");
   }else {
	   System.out.println("is not palindrome");
   }
}
}