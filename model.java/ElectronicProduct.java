package model;

public class ElectronicProduct extends product {
    private String imei;
    private String warrantyPeriod;

    public ElectronicProduct(String id, String name, double price, String imei, String warrantyPeriod) {
        super(id, name, price);
        this.imei = imei;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getInfo() {
        return name + " - " + price + "đ, IMEI: " + imei + ", Bảo hành: " + warrantyPeriod;
    }
}

    

