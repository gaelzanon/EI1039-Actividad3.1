package Actividad8a;

public class Forward implements Movement {
    private Receiver receiver;

    public Forward(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void move() {
        System.out.println("Me muevo 15cm hacia delante");
    }
}
