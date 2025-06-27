public class Main {
    public static void main(String[] args) {
        // PayPal via Adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(1000.0);

        // Stripe via Adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(2000.0);
    }
}
