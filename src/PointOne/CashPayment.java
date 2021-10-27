package PointOne;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payed with cash");
    }
}
