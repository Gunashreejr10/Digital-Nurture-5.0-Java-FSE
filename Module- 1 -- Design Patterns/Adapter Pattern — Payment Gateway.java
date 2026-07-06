

interface PaymentProcessor {
    void processPayment(int amount);
}

class PayPalGateway { // incompatible interface
    void makePayment(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPal = new PayPalGateway();

    public void processPayment(int amount) {
        payPal.makePayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.processPayment(500);
    }
}
