package Assignment4;

import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Dessert Store Menu ---");
            System.out.println("1. Buy Candies");
            System.out.println("2. Buy Cookies");
            System.out.println("3. Buy IceCreams");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Candies Flavors ---");
                    System.out.println("1. Vanilla");
                    System.out.println("2. Strawberry");
                    System.out.println("3. Chocolate");
                    System.out.print("Enter flavor choice: ");
                    int candyFlavorChoice = sc.nextInt();
                    sc.nextLine(); 
                    String candyFlavor = "";
                    if (candyFlavorChoice == 1) {
                        candyFlavor = "Vanilla";
                    } else if (candyFlavorChoice == 2) {
                        candyFlavor = "Strawberry";
                    } else if (candyFlavorChoice == 3) {
                        candyFlavor = "Chocolate";
                    } else {
                        System.out.println("Invalid flavor choice, defaulting to Vanilla.");
                        candyFlavor = "Vanilla";
                    }
                    
                    System.out.print("Enter quantity (in grams): ");
                    double candyQty = sc.nextDouble();
                    cart.addToCart(new Candies(candyFlavor), candyQty);
                    break;

                case 2:
                    System.out.println("\n--- Cookies Flavors ---");
                    System.out.println("1. Vanilla");
                    System.out.println("2. Strawberry");
                    System.out.println("3. Chocolate");
                    System.out.print("Enter flavor choice: ");
                    int cookieFlavorChoice = sc.nextInt();
                    sc.nextLine(); 
                    String cookieFlavor = "";
                    if (cookieFlavorChoice == 1) {
                        cookieFlavor = "Vanilla";
                    } else if (cookieFlavorChoice == 2) {
                        cookieFlavor = "Strawberry";
                    } else if (cookieFlavorChoice == 3) {
                        cookieFlavor = "Chocolate";
                    } else {
                        System.out.println("Invalid flavor choice, defaulting to Chocolate.");
                        cookieFlavor = "Chocolate";
                    }

                    System.out.print("Enter quantity (in pieces): ");
                    double cookieQty = sc.nextDouble();
                    cart.addToCart(new Cookies(cookieFlavor), cookieQty);
                    break;

                case 3:
                    System.out.println("\n--- Ice Cream Flavors ---");
                    System.out.println("1. Vanilla");
                    System.out.println("2. Strawberry");
                    System.out.println("3. Chocolate");
                    System.out.print("Enter flavor choice: ");
                    int iceCreamFlavorChoice = sc.nextInt();
                    sc.nextLine(); 
                    String iceCreamFlavor = "";
                    if (iceCreamFlavorChoice == 1) {
                        iceCreamFlavor = "Vanilla";
                    } else if (iceCreamFlavorChoice == 2) {
                        iceCreamFlavor = "Strawberry";
                    } else if (iceCreamFlavorChoice == 3) {
                        iceCreamFlavor = "Chocolate";
                    } else {
                        System.out.println("Invalid flavor choice, defaulting to Vanilla.");
                        iceCreamFlavor = "Vanilla";
                    }

                    System.out.print("Enter quantity (in pieces): ");
                    double iceQty = sc.nextDouble();
                    cart.addToCart(new IceCream(iceCreamFlavor), iceQty);
                    break;

                case 4:
                    // Prints the bill directly without a dedicated method call
                    System.out.println("\n==============================");
                    System.out.println("Total items: " + cart.totalItems);
                    System.out.println("Total bill: Rs. " + cart.totalBill);
                    System.out.println("==============================");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
        sc.close();
    }
}