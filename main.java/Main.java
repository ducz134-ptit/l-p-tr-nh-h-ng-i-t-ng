package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        
        Product p1 = new ElectronicProduct("E001", "Laptop Dell", 15000000, "123456789", "12 tháng");
        Product p2 = new FoodProduct("F001", "Bánh quy", 50000, "10-12-2025");
        Product p3 = new FoodProduct("F002", "Sữa tươi", 30000, "15-10-2025");

        Order order1 = new Order("Nguyễn Văn A", new CashPayment());
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.checkout();

        System.out.println();

        Order order2 = new Order("Nguyễn Văn B", new CreditCardPayment());
        order2.addProduct(p2);
        order2.addProduct(p3);
        order2.checkout();

        System.out.println();

        Order order3 = new Order("Trần Thị C", new MomoPayment());
        order3.addProduct(p1);
        order3.checkout();
    }
}
