package model;

public class MomoPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        return "Thanh toán qua ví Momo thành công. Số tiền: " + amount + "đ.";
    }
}
