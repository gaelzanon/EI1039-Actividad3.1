package Actividad3b;

public class EuropeSimpleKnifeFactory {

    public static Knife createKnife(String type) {
        Knife knife = null;

        if (type.equals("chef")) {
            knife =  new EuropeChefKnife();
        } else if (type.equals("steak")) {
            knife = new EuropeSteakKnife();
        }

        return knife;
    }
}
