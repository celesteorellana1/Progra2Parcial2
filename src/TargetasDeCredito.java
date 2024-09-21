public class TargetasDeCredito implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagando $" + amount + " con tarjeta de crédito.");
        // validar targeta de credito
    }
}
