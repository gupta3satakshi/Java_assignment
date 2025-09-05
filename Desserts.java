package Assignment4;

abstract class Desserts {
    protected String flavor;

    public Desserts(String flavor) {
        this.flavor = flavor;
    }

    public abstract double calculatePrice(double quantity);
}