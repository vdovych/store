package store;

import java.util.List;

public class DeliveryDHL implements DelivetyStrategy {
    @Override
    public boolean deliver(List<ComputerGame> games) {
        System.out.println("Successfully delivered by DHL\n");
        return true;
    }
}
