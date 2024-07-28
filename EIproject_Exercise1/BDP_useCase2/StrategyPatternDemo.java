package BDP_useCase2;

// Test
public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        paymentContext.executePayment(100);

        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.executePayment(200);
    }
}
