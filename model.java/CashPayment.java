package model;

public class CashPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        return "Thanh toán tiền mặt thành công. Số tiền: " + amount + "đ.";
    }
}

