package store;

public class CartDecorator extends Cart{
    protected Cart cart;
    public CartDecorator(Cart cart){
        this.cart = cart;
    }
    @Override
    public boolean ship(){
        return cart.ship();
    }
    @Override
    public double computeTotalPrice(){
        return cart.computeTotalPrice();
    }
}
