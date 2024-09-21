public class CriptoMonedas implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagando $" + amount + " con Cripto-monedas.");
        // Validacion de transacciones en blockchain
    }
}

