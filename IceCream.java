
package Assignment4;

public class IceCream extends Desserts {
	public IceCream(String flavor) {
        super(flavor);
    }
	public String flavour;
    private double pricePerPiece = 50.0;

    @Override
    public double calculatePrice(double quantity) {
        double total_price = quantity * pricePerPiece;
        System.out.println("Total price of " + quantity + " ice creams: Rs." + total_price);
        return total_price;
    }
}