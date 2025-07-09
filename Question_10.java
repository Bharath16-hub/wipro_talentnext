package oops_Inheritance;

import java.util.Scanner;

public class Question_10 {
    public static String halfprint(String s) {
    	int n=s.length();
    	if(n%2==0) {
    		return s.substring(0,(n/2));
    	}else {
    		return null;
    	}
    	
    }
    public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
   	   String input=sc.nextLine();
   	   System.out.println(halfprint(input));
    }
}