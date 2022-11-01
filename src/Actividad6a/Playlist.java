package Actividad6a;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Component{
    private final String nombre_playlist;
    private final List<Song> songs;

    public Playlist(String nombre) {
        this.nombre_playlist = nombre;
        this.songs = new ArrayList<>();
    }

    public void play() {
        System.out.println("-----" + nombre_playlist + "-----");
    }

}
