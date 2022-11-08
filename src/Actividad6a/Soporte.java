package Actividad6a;

public abstract class Soporte implements Song {
    protected Song song;

    public Soporte(Song song) {
        this.song = song;
    }

    @Override
    public void play() {
        song.play();
    }
}
