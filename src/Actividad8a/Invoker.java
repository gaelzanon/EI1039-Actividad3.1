package Actividad8a;

import java.util.ArrayList;

public class Invoker {
    private ArrayList<Movement> sequence;

    public Invoker() {
        this.sequence = new ArrayList<>();
    }

    public void addCommand(Movement movement) {
        this.sequence.add(movement);
    }

    public void executeMovement() {
        for (Movement movement : this.sequence) {
            movement.move();
        }
    }

    public void deleteCommand() {
        this.sequence.remove(sequence.size() - 1);
    }
}
