package store;

public class CashPayment implements PaymentStrategy{

    public boolean pay(double price) {
        System.out.println("You will pay the price for dis in cash\n");
        return true;
    }
}
