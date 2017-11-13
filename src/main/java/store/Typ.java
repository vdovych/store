package store;

public enum Typ {
    ACTION, STRATEGY, MMORPG, CASUAL, BATTLE_ROYALE;

    @Override
    public String toString() {
        switch (this){
            case ACTION:return "action";
            case CASUAL:return "casual";
            case MMORPG:return "mmorpg";
            case STRATEGY:return "strategy";
            case BATTLE_ROYALE:return "battleRoyale";
            default:return "rly, intelliJ, rly?";
        }
    }
}
