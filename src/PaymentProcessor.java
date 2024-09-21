public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("Por favor, seleccione un metodo de pago.");
        }
    }
}
