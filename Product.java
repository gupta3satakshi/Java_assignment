package Assignment2;

public class Product {
	int prodid;
	String name;
	double price;
	public Product(int prodid, String name, double price) {
		this.prodid =prodid;
		this.name = name;
		this.price = price;
	}
	public void display() {
		System.out.println("Product ID: " +prodid + ",Product Name:" +name+ ", Price: " +price);
		
	}
}
