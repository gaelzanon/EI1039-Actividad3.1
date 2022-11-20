package Actividad8a;

public class Back implements Movement {
    private Receiver receiver;

    public Back(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void move() {
        System.out.println("Me muevo 15cm hacia atras");
    }
}
