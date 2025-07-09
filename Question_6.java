package oops_Inheritance;

class Shape1 {
 void draw() {
	 System.out.println("Drawing Shape");
	 
 }
 void erase() {
	 System.out.println("Erasing Shape");
 }
 
}
class Circle extends Shape1{
	void draw() {
		System.out.println("Circle drawing");
		
	}
	void erase() {
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape1{
	void draw() {
		System.out.println("Drawing triangle");
	}
	void erase() {
		System.out.println("Erasing circle");
	}
}
class Square extends Shape1{
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}
public class Question_6{
	public static void main(String[] args) {
		Shape1 c=new Circle();
		Shape1 t=new Triangle();
		Shape1 s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}
}