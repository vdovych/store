package store;

import java.util.LinkedList;
import java.util.List;

public class Cart extends Observable{
    protected List<ComputerGame> games;
    protected PaymentStrategy paymentStrategy;
    protected DelivetyStrategy delivetyStrategy;
    public Cart(){
        games = new LinkedList<ComputerGame>();
    }
    public void add(ComputerGame game){
        games.add(game);
    }
    public boolean ship() {
        return paymentStrategy.pay(computeTotalPrice())&&delivetyStrategy.deliver(games);
    }
    public double computeTotalPrice(){
        double totalPrice = 0;
        for (ComputerGame game:
             games) {
            totalPrice+= game.getPrice();
        }
        return totalPrice;
    }
    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public DelivetyStrategy getDelivetyStrategy() {
        return delivetyStrategy;
    }

    public void setDelivetyStrategy(DelivetyStrategy delivetyStrategy) {
        this.delivetyStrategy = delivetyStrategy;
    }
}
