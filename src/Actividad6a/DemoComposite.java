package Actividad6a;

public class DemoComposite {
    public static void main(String[] args) {

        // Make "Sabina's hits" playlist and add 2 songs to it
        Composite sabinaPlaylist = new Composite("Sabina's hits");
        sabinaPlaylist.add(new Vynil(new SongImpl("Princesa", "Joaquín Sabina")));
        sabinaPlaylist.add(new SongImpl("Calle melancolía", "Joaquín Sabina"));

        // Make "Manolo García's hits" playlist and add 3 song to it
        Composite garciaPlaylist = new Composite("Manolo Garcia's hits");
        garciaPlaylist.add(new MP4(new SongImpl("Pájaros de barro", "Manolo García")));
        garciaPlaylist.add(new SongImpl("Zapatero", "Manolo García"));
        garciaPlaylist.add(new SongImpl("A San Fernando, un ratito a pie y otro caminando", "Manolo García"));

        // Make "my songs" playlist; add the two playlists and one single song
        Composite mySongs = new Composite("My Songs");
        mySongs.add(sabinaPlaylist);
        mySongs.add(garciaPlaylist);
        mySongs.add(new SongImpl("Penso positivo", "Lorenzo Jovanotti"));

        // Play all songs of each playlist
        mySongs.play();
    }
}
