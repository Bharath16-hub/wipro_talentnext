package oops_Inheritance;

class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String toString() {
		return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	// Getters
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public String toString() {
		return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
	}
}

public class Question_3 {
	public static void main(String[] args) {
		Author a = new Author("John", "john5@gmail.com", 'M');
		Book b = new Book("baba", a, 25.0, 34);
		System.out.println(b);
	}
}