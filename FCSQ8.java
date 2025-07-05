package java_fundamentals;

import java.util.*;

public class FCSQ8 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	char c=sc.next().toUpperCase().charAt(0);
    	switch(c) {
    	case 'R':
    		System.out.println("Red");
    		break;
    	case 'G':
    		System.out.println("Green");
    		break;
    		
    	case 'Y':
    		System.out.println("yellow");
    		break;
    	case 'B':
    		System.out.println("Blue");
    		break;
    		
    	case 'W':
    		System.out.println("White");
    		break;
    		
    	case 'O':
    		System.out.println("Orange");
    	break;
    	  default:
    		  System.out.println("Invalid Imput");
    	}
    }
}