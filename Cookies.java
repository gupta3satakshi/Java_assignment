
package Assignment4;

public class Cookies extends Desserts {
	public Cookies(String flavor) {
        super(flavor);
    }
    private double pricePerDozen = 120.0;

    @Override
    public double calculatePrice(double quantity) {
        double total_price = (quantity * pricePerDozen) / 12; 
        System.out.println("Total price of " + quantity + " cookies: Rs." + total_price);
        return total_price;
    }
}