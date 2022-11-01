package Actividad6a;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    final List<Component> children = new ArrayList<>();

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public void play() {
        for (Component child : children) {
            child.play();
        }
    }
}
