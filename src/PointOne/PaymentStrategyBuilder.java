package PointOne;

public class PaymentStrategyBuilder {
    public static PaymentStrategy buildStrategy(PaymentStyle style) {
        if(style.equals(PaymentStyle.CARD)) {
            return new CardPayment();
        } else if(style.equals(PaymentStyle.CASH)) {
            return new CashPayment();
        }

        throw new RuntimeException("Invalid payment style");
    }
}

