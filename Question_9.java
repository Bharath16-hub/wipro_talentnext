package oops_Inheritance;

import java.util.Scanner;

public class Question_9 {
    public static String repeatString(String s,int n) {
    	//int n=s.length();
    	s=s.substring(n-1,s.length());
    	String str=s.repeat(n);
    	return str;
    }
    public static void main(String[] args) {
  	  Scanner sc=new Scanner(System.in);
 	   String input=sc.nextLine();
 	  int N=sc.nextInt();
 	   System.out.println(repeatString(input,N));
    }
}