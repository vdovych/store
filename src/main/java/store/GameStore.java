package store;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GameStore {
    private List<ComputerGame> games;
    public GameStore(){
        games = new ArrayList<>();
    }
    public void addGame(ComputerGame game){
        games.add(game);
    }
    public ComputerGame getGame(String name){
        for (ComputerGame game:
             games) {
            if (game.getName().equals(name))
                return game;
        }
        return null;
    }
    public List<ComputerGame> search(GameSpec searchSpec){
        List<ComputerGame> matches = new LinkedList<>();
        for (ComputerGame game:
             games) {
            if (searchSpec.matches(game.getGameSpec()))
                matches.add(game);
        }
        return matches;
    }

}
