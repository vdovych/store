package store;

public class GameSpec {
    private Typ typ;
    private Developer developer;
    public GameSpec(Typ typ, Developer developer){
        this.typ = typ;
        this.developer = developer;
    }
    public Developer getDeveloper() {
        return developer;
    }

    public Typ getTyp() {
        return typ;
    }

    public boolean matches(GameSpec gameSpec){
        if (gameSpec == null)
            return false;
        return (gameSpec.getTyp() == null || gameSpec.getTyp() == typ) &&
                (gameSpec.getDeveloper() == null || gameSpec.getDeveloper() == developer);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() != this.getClass())
            return false;
        return (((GameSpec)obj).getTyp() == typ && ((GameSpec)obj).getDeveloper() == developer);
    }
}
