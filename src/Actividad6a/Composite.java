package Actividad6a;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String nombre;
    final List<Component> children = new ArrayList<>();

    public Composite(String nombre) {
        this.nombre = nombre;
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public void play() {
        for (Component child : children) {
            System.out.println("-----" + nombre + "-----");
            child.play();
        }
    }
}
