package Actividad6a;

public class Song extends Playlist {
    private final String nombre;
    private final String artista;

    public Song(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public void play() {
        System.out.println("Escuchando..." + this.nombre + " BY " + this.artista);
    }
}
