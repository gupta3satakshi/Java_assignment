
package Assignment4;

public class Cart {
    double totalItems = 0;
    double totalBill = 0.0;

    public void addToCart(Desserts d, double quantity) {
        double price = d.calculatePrice(quantity);
        totalBill += price;
        totalItems += quantity;
        System.out.println(quantity + "Items added to cart. Cost: Rs." + price);
    }

   
}