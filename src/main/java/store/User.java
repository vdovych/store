package store;

public class User implements Observer{
    @Override
    public void update() {
        System.out.println("Updated\n");
    }
}
