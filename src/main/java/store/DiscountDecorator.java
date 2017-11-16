package store;

public class DiscountDecorator extends CartDecorator {
    public DiscountDecorator(Cart cart) {
        super(cart);
    }
    @Override
    public double computeTotalPrice(){
        return cart.computeTotalPrice()*0.9;
    }
}
