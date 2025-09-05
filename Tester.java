package Assignment2;

public class Tester {
	

	public static void main(String[] args) {
			Product[]prodarr ={new Product (222, "chips", 20.0),
								 new Product (333, "biscuit", 50.0),
								 new Product (444, "lollipop", 30.0)};
			
			Store store = new Store (prodarr);
			store.displayProducts();
			int searchid = 222;
			int index=store.searchProduct(searchid);
			if(index!=-1) {
				System.out.println("Product with ID" + searchid +"Found at Index" + index);
			}
			else
				System.out.println("Product Not Found");
	}

}
