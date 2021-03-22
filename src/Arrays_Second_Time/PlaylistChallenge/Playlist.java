package Arrays_Second_Time.PlaylistChallenge;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Playlist {
    private ArrayList<Album> albums = new ArrayList<>();
    private LinkedList<Song> songs = new LinkedList<>();
    private Song currentSong;
    private boolean beganOperation = false;
    private Scanner scanner = new Scanner(System.in);


    private void printMenu() {
        System.out.println("Press:");
        System.out.println("\t0 to quit the application");
        System.out.println("\t1 to go to the next song");
        System.out.println("\t2 to go back to the previous song");
        System.out.println("\t3 to repeat \"" + this.currentSong);
        System.out.println("\t4 to list all the songs in the playlist");
        System.out.println("\t5 to remove \"" + this.currentSong + "\" from the playlist");
    }

    public void operate() {
        if (!beganOperation) {
            printMenu();
            beganOperation = true;
        }
        int action = scanner.nextInt();
        boolean continuing = true;
        scanner.nextLine();
        while (continuing) {
            switch (action) {
                case 0:
                    System.out.println("Bye kiddo");
                    continuing = false;
                    break;
                    
            }
        }

    }

    public void addSongToPlaylist(String albumTitle, String songTitle) {
        Album album = getAlbum(albumTitle);
        if (album != null) {
            Song song = album.getSong(songTitle);
            if (song != null) songs.add(song);
        }
    }

    private Album getAlbum(String albumTitle) {
        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).getTitle().equals(albumTitle)) return albums.get(i);
        }
        return null;
    }

}
