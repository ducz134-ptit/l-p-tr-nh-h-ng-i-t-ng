package model;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public String pay(double amount) {
        return "Thanh toán bằng thẻ tín dụng thành công. Số tiền: " + amount + "đ.";
    }
}
