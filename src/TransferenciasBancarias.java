public class TransferenciasBancarias implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagando $" + amount + " con transferencia bancaria.");
        // Procesamiento manual de transferencias
    }
}
