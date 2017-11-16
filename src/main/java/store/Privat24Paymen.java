package store;

public class Privat24Paymen implements PaymentStrategy{
    public boolean pay(double price) {
        System.out.println("Payment successful by Privat25\n");
        return true;
    }
}
