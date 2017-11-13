package store;

public class CashStrategy implements PaymentStrategy{
    public boolean pay(){
        System.out.println("PaidByCash\n");
        return true;
    }
}