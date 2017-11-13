package store;

import java.util.List;

public class Cart {
    private DeliveryStrategy ds;
    private PaymentStrategy ps;
    private List<ComputerGame> games;
    public Cart(){
        ps = new CashStrategy();
    }
    public void addgame(ComputerGame game){
        games.add(game);
    }
    public void Ship(){
        if(ps.pay())
            ds.deliver();
    }

    public PaymentStrategy getPs() {
        return ps;
    }

    public void setPs(PaymentStrategy ps) {
        this.ps = ps;
    }

    public DeliveryStrategy getDs() {
        return ds;
    }

    public void setDs(DeliveryStrategy ds) {
        this.ds = ds;
    }

}