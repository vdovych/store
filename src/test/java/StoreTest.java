import org.junit.Test;
import store.*;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StoreTest {
    @Test
    public void TestCreatingSpec(){
        for (int i = 0; i < 100; i++) {
            Typ typ=Typ.ACTION;
            Developer developer=Developer.ACTIVISION;
            switch (new Random().nextInt(5)){
                case 0: typ = Typ.ACTION; break;
                case 1: typ = Typ.BATTLE_ROYALE; break;
                case 2: typ = Typ.CASUAL;break;
                case 3: typ = Typ.MMORPG;break;
                case 4: typ = Typ.STRATEGY;break;
            }
            switch (new Random().nextInt(4)){
                case 0: developer = Developer.ACTIVISION;break;
                case 1: developer = Developer.BLIZZARD;break;
                case 2: developer = Developer.EA;break;
                case 3: developer = Developer.VALVE;break;
            }
            GameSpec gameSpec = new GameSpec(typ, developer);
            assertEquals(typ,gameSpec.getTyp());
            assertEquals(developer, gameSpec.getDeveloper());
        }
    }
    @Test
    public void TestCreatingGame(){
        for (int i = 0;i < 100; i++) {
            String name = String.valueOf(new Random().nextInt());
            String releaseDate = String.valueOf(new Random().nextInt());
            GameSpec spec = new GameSpec(Typ.ACTION,Developer.ACTIVISION);//specs r already tested, so no need for random values
            double price = new Random().nextDouble();
            ComputerGame game = new ComputerGame(name, releaseDate, spec, price);
            assertEquals(name, game.getName());
            assertEquals(releaseDate, game.getReleaseDate());
            assertEquals(spec, game.getGameSpec());
            assertEquals(price, game.getPrice(), 0.1);
        }
    }
    @Test
    public void TestCreatingStore(){
        GameStore store = new GameStore();
        String name = String.valueOf(new Random().nextInt());
        String releaseDate = String.valueOf(new Random().nextInt());
        GameSpec spec = new GameSpec(Typ.ACTION,Developer.ACTIVISION);//specs r already tested, so no need for random values
        double price = new Random().nextDouble();
        ComputerGame game = new ComputerGame(name, releaseDate, spec, price);
        store.addGame(game);
        assertEquals(game, store.getGame(name));
        assertEquals(null, store.getGame("name"));
    }
    @Test
    public void TestSearchingStore(){
        GameStore store = new GameStore();
        String name = String.valueOf(new Random().nextInt());
        String releaseDate = String.valueOf(new Random().nextInt());
        GameSpec spec = new GameSpec(Typ.ACTION,Developer.ACTIVISION);//specs r already tested, so no need for random values
        double price = new Random().nextDouble();
        ComputerGame game = new ComputerGame(name, releaseDate, spec, price);
        store.addGame(game);
        assertEquals(game, store.search(spec).get(0));
        store.addGame(game);
        store.addGame(game);
        assertEquals(3, store.search(spec).size());
        assertEquals(0, store.search(null).size());
    }



}
