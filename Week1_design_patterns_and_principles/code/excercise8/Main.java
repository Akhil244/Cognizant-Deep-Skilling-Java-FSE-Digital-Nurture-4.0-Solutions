public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Akhil"));
        context.processPayment(1500.00);

        System.out.println();

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("akhil@example.com"));
        context.processPayment(2000.00);
    }
}
