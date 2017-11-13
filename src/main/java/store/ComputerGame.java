package store;

public class ComputerGame {
    private String name, releaseDate;
    private double price;
    private GameSpec gameSpec;
    ComputerGame(String name, String releaseDate, GameSpec gameSpec, double price){
        this.name = name;
        this.releaseDate = releaseDate;
        this.gameSpec = gameSpec;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GameSpec getGameSpec() {
        return gameSpec;
    }
}
