//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        PaymentProcessor processor = new PaymentProcessor();

        // Simulando seleccion de metodo de pago por el cliente
        processor.setPaymentStrategy(new TargetasDeCredito());
        processor.processPayment(250.0);

        processor.setPaymentStrategy(new PayPal());
        processor.processPayment(300.0);

        processor.setPaymentStrategy(new CriptoMonedas());
        processor.processPayment(540.0);

        processor.setPaymentStrategy(new TransferenciasBancarias());
        processor.processPayment(150.0);
    }
}