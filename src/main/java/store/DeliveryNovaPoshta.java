package store;

import java.util.List;

public class DeliveryNovaPoshta implements DelivetyStrategy {
    @Override
    public boolean deliver(List<ComputerGame> games) {
        System.out.println("Successfully delivered by NP\n");
        return true;
    }
}
