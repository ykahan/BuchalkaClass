package Arrays_Second_Time.PlaylistChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Playlist pl = new Playlist();
        Album firstAlbum = new Album("first");
        Album secondAlbum = new Album("second");

        firstAlbum.addSong(new Song("a", 1.2));
        firstAlbum.addSong(new Song("b", 2.3));
        firstAlbum.addSong(new Song("c", 3.4));
        firstAlbum.addSong(new Song("d", 4.5));

        secondAlbum.addSong(new Song("z", 9.8));
        secondAlbum.addSong(new Song("y", 8.7));
        secondAlbum.addSong(new Song("x", 7.6));
        secondAlbum.addSong(new Song("w", 6.5));

        pl.addAlbum(firstAlbum);
        pl.addAlbum(secondAlbum);

        pl.operate();
    }
}
