package Actividad6a;

public class SongImpl implements Song {
    private final String nombre;
    private final String artista;

    public SongImpl(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public void play() {
        System.out.println("Escuchando..." + this.nombre + " BY " + this.artista);
    }
}
