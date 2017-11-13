package store;

public enum Developer {
    ACTIVISION, BLIZZARD, EA, VALVE;

    @Override
    public String toString() {
        switch (this){
            case EA:return "EA";
            case VALVE:return "Valve";
            case BLIZZARD:return "Blizzard";
            case ACTIVISION:return "Activision";
            default:return "String";
        }
    }
}
