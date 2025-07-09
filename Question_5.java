package oops_Inheritance;

class Person{
	private String name;
	Person(String name){
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	} public String toString() {
        return "Name: " + name;
	}
}
class Employee extends Person{
	private double annualsalary;
	private int year;
	private String insurancenumber;
	
	Employee(String name,double annualsalary,int year,String insurancenumber){
super(name);
		this.annualsalary=annualsalary;
		this.year=year;
		this.insurancenumber=insurancenumber;
	}
	public double getsalary() {
		return annualsalary;
	}
	public void setsalary(double annualsalary) {
		this.annualsalary=annualsalary;
	}public int getyear() {
		return year;
	}public void setyear(int year) {
		this.year=year;
	}public String getinsurancenumber() {
		return insurancenumber;
	}public void setinsurancenumber(String insurancenumber) {
		this.insurancenumber=insurancenumber;
	}
	 public String toString() {
	        return super.toString() + "\n" +
	               "Annual Salary: " + annualsalary + "\n" +
	               "Start Year: " + year + "\n" +
	               "Insurance Number: " + insurancenumber;
	    }
}
public class Question_5{
	public static void main(String[] args) {
		Employee ob=new Employee("john",25000.0,2015,"gbtrhbt");
	
System.out.println(ob);	}
}

















