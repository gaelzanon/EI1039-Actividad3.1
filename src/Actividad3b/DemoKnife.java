package Actividad3b;

public class DemoKnife {
    public static void main(String[] args) {
        System.out.println("Comprando en la tienda americana");
        Knife knife = SimpleKnifeFactory.createKnife("chef");
        System.out.println(knife.getName());
        Knife knife1 = SimpleKnifeFactory.createKnife("steak");
        System.out.println(knife1.getName());

        System.out.println("Comprando en una tienda europea");
        Knife knife3 = EuropeSimpleKnifeFactory.createKnife("chef");
        System.out.println(knife3.getName());
        Knife knife4 = EuropeSimpleKnifeFactory.createKnife("steak");
        System.out.println(knife4.getName());
    }
}
