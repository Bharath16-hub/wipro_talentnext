package oops_Inheritance;

class Animal2 {
       void eat() {
    	   System.out.println("eat");
       }
       void sleep() {
    	   System.out.println("sleep");
       }
}
class Bird extends Animal2{
	void fly() {
		System.out.println("i can fly");
	}
	
}
public class Question_4{
	public static void main(String []args) {
		Bird ob=new Bird();
		
		ob.eat();
		ob.sleep();
		ob.fly();
	}
}