package Actividad3b;

public class SimpleKnifeFactory {

    public static Knife createKnife(String type) {
        Knife knife = null;

        if (type.equals("chef")) {
            knife =  new ChefKnife();
        } else if (type.equals("steak")) {
            knife = new SteakKnife();
        }

        return knife;
    }
}
