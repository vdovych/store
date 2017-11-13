package store;

public class PayPalStrategy implements PaymentStrategy {
    public boolean pay(){
        System.out.println("CardsDontWork\n");
        return true;
    }
}