package Actividad3b;

public abstract class Knife {
    String name;

    public Knife createKnife(String type) {
        name = "knife";
        return this;
    }

    public void sharpen() {
        System.out.println("sharpen");
    }

    public void polish() {
        System.out.println("polish");
    }

    public void wrapp() {
        System.out.println("wrapp");
    }

    public String getName() {
        return name;
    }
}
