package model;

public abstract class product {
    protected String id;
    protected String name;
    protected double price;

    public product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getInfo();
}
