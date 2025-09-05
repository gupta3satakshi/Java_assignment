package Assignment2;

public class Store {
	Product[] products;
	
	public Store(Product[] products){
		this.products = products;
	}
	public void displayProducts() {
		System.out.println("Product list ");
		for(Product p: products) {
			p.display();
		}
	}
	
	public int searchProduct(int prodid) {
		for(int i =0; i < products.length; i++) {
			if(products[i].prodid == prodid) {
				return i;
			}
		}
		return -1;
	}
}
