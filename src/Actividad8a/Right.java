package Actividad8a;

public class Right implements Movement {
    private Receiver receiver;

    public Right(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void move() {
        System.out.println("Giro 90º a la derecha");
    }
}
