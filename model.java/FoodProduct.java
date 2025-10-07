package model;

public class FoodProduct extends roduct {
    private String expiryDate;

    public FoodProduct(String id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getInfo() {
        return name + " - " + price + "đ, HSD: " + expiryDate;
    }
}

