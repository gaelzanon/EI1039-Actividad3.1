package Actividad6a;

public class Vynil extends Soporte {

    public Vynil(Song song) {
        super(song);
    }

    @Override
    public void play() {
        song.play();
        decorateWithVynil();
    }


    public void decorateWithVynil() {
        System.out.println("ON Vynil");
    }

}
