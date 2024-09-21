public class PayPal implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagando $" + amount + " con PayPal.");
        // Autenticación y procesamiento de PayPal
    }
}
