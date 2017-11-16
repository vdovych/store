package store;

import java.util.List;

public interface DelivetyStrategy {
    boolean deliver(List<ComputerGame> games);
}
