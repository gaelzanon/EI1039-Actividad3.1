package Actividad8a;

public class Left implements Movement {
    private Receiver receiver;

    public Left(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void move() {
        System.out.println("Giro 90º a la izquierda");
    }
}
