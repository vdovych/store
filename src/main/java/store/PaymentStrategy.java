package store;

public interface PaymentStrategy {
    boolean pay(double price);
}
