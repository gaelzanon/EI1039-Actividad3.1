package Actividad3b;

public class EuropeKnifeStore extends KnifeStore {

    public EuropeKnifeStore(SimpleKnifeFactory factory) {
        super(factory);
    }

    @Override
    public Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new EuropeChefKnife();
        } else if (type.equals("steak")) {
            return new EuropeSteakKnife();
        } else return null;
    }
}
