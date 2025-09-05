
package Assignment4;

public class Candies extends Desserts {
	public Candies(String flavor) {
        super(flavor);
    }
    private double pricePerKg = 300.0;
    
    @Override
    public double calculatePrice(double quantity) {
        double total_price = (quantity * pricePerKg) / 1000; 
        System.out.println("Total price of " + quantity + "g of candies: Rs." + total_price);
        return total_price;
    }
}
