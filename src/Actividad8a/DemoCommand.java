package Actividad8a;

public class DemoCommand {
    public static void main(String[] args) {
//        // Ejercicio 2
//        // Move Forward
//        new Forward(new Receiver()).move();
//
//        // Turn Left
//        new Left(new Receiver()).move();
//
//        // Move Forward
//        new Forward(new Receiver()).move();
//
//        // Move Forward
//        new Forward(new Receiver()).move();
//
//        // Turn Right
//        new Right(new Receiver()).move();


        // Ejercicio 6
        Invoker invoker = new Invoker();
        invoker.addCommand(new Forward(new Receiver()));
        invoker.addCommand(new Left(new Receiver()));
        invoker.addCommand(new Forward(new Receiver()));
        invoker.addCommand(new Forward(new Receiver()));
        invoker.addCommand(new Right(new Receiver()));
        invoker.executeMovement();

    }
}
