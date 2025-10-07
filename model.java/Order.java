package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<Product> products;
    private PaymentMethod paymentMethod;

    public Order(String customerName, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void checkout() {
        double total = getTotal();
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + total + "đ.");
        System.out.println(paymentMethod.pay(total));
    }
}
