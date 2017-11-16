package store;

public class BonusDecorator extends CartDecorator{
    public BonusDecorator(Cart cart) {
        super(cart);
    }
    @Override
    public boolean ship(){
        games.add(new ComputerGame("BonusGame","16/11/2017",new GameSpec(Typ.MMORPG, Developer.EA),0));
        return cart.ship();
    }
}
