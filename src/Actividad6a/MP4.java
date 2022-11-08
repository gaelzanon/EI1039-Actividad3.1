package Actividad6a;

public class MP4 extends Soporte {

    public MP4(Song song) {
        super(song);
    }

    @Override
    public void play() {
        song.play();
        decorateWithMP4();
    }

    public void decorateWithMP4() {
        System.out.println("ON MP4");
    }
}
