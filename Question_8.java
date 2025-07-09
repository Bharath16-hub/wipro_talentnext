package oops_Inheritance;

import java.util.Scanner;

public class Question_8 {
      public static String concateString(String s,String d) {
    	  if(s.charAt(s.length()-1)==(d.charAt(0))) {
    		  d=d.substring(1);
    	  }
    	  String str=s.concat(d).toLowerCase();
    	  return str;
      }
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
   	   String input=sc.nextLine();
   	 String input1=sc.nextLine();
   	 System.out.println(concateString(input,input1));
      }
}