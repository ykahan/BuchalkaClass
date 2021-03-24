package Arrays_Second_Time.PlaylistChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private ArrayList<Album> albums = new ArrayList<>();
    private LinkedList<Song> songs = new LinkedList<>();
    private Song currentSong;
    private boolean beganOperation = false;
    private Scanner scanner = new Scanner(System.in);

    public Playlist() {

    }

    private void printMenu() {
        System.out.println("Press:");
        System.out.println("\tQ to quit the application");
        System.out.println("\t0 to print the menu");
        System.out.println("\t1 to go to the next song");
        System.out.println("\t2 to go back to the previous song");
        System.out.println("\t3 to repeat the current song");
        System.out.println("\t4 to list all the songs in the playlist");
        System.out.println("\t5 to remove the current song from the playlist");
        System.out.println("\t6 to list the available albums");
        System.out.println("\t7 to add a song to the playlist");
        System.out.println("\t8 to go to the beginning of the playlist");
    }

    public void operate() {
        if (!beganOperation) {
            printMenu();
            beganOperation = true;
        }

        boolean continuing = true;
        ListIterator<Song> li = songs.listIterator();
        boolean forward = true;

        while (continuing) {

            String action = getAction();

            switch (action) {
                case "Q":
                    System.out.println("Bye kiddo");
                    continuing = false;
                    break;
                case "0":
                    printMenu();
                    break;
                case "1":
                    if (!forward) {
                        forward = true;
                        if (li.hasNext()) li.next();
                    }
                    if (li.hasNext()) {
                        currentSong = li.next();
                        playSong(currentSong);
                    } else {
                        System.out.println("Already at end of playlist");
                    }
                    break;
                case "2":
                    if (forward) {
                        forward = false;
                        if (li.hasPrevious()) li.previous();
                    }
                    if (li.hasPrevious()) {
                        currentSong = li.previous();
                        playSong(currentSong);
                    } else {
                        System.out.println("Already at beginning of playlist");
                    }
                    break;
                case "3":
                    if (currentSong != null) {
                        playSong(currentSong);
                    } else {
                        System.out.println("No song loaded");
                    }
                    break;
                case "4":
                    System.out.println(listSongsInPlaylist());
                    break;
                case "5":
                    if (currentSong != null) {
                        li.remove();
                        currentSong = null;
                    } else {
                        System.out.println("No song available for removal");
                        break;
                    }
                    if (li.hasNext()) currentSong = li.next();
                    else if (li.hasPrevious()) currentSong = li.previous();
                    describeCurrentSong();
                    break;
                case "6":
                    System.out.println(listAlbums());
                    break;
                case "7":
                    System.out.println("Enter album name:\n");
                    String albumName = scanner.nextLine();
                    Album album = getAlbum(albumName);
                    if (album == null) {
                        System.out.println("Album not found");
                        break;
                    }
                    System.out.println("Enter song name:\n");
                    String songName = scanner.nextLine();
                    Song song = getSong(album, songName);
                    if (song != null) {
                        li.add(song);
                        System.out.println("Song \"" + song.getTitle() + "\" added");
                    } else {
                        System.out.println("Song not found in album");
                        break;
                    }
                    break;
                case "8":
                    while (li.hasPrevious()) li.previous();
                    currentSong = li.next();
                    li.previous();
                    describeCurrentSong();
                    break;
            }
            System.out.println("Next action please (0 to print the menu)");
        }

    }

    private void describeCurrentSong() {
        if (currentSong != null) {
            System.out.println("New current song is\n" +
                    describeSong(currentSong));
        } else {
            System.out.println("No current song");
        }
    }

    private Song getSong(Album album, String songName) {
        return album.getSong(songName);
    }

    private String listAlbums() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < albums.size(); i++) {
            sb.append(albums.get(i).toString());
        }
        return sb.toString();
    }

    private void playSong(Song song) {
        System.out.println("Now playing:\n");
        System.out.println(song.toString());
    }

    private String getAction() {
        String action = scanner.nextLine();
        return action;
    }

    public void addSongToPlaylist(String albumTitle, String songTitle) {
        Album album = getAlbum(albumTitle);
        if (album != null) {
            Song song = album.getSong(songTitle);
            if (song != null) songs.add(song);
        }
    }

    private void removeSong(Song song) {
        if (songs.contains(song)) songs.remove(song);
    }

    private Album getAlbum() {
        System.out.println("Which album do you want?");
        String title = scanner.nextLine();
        return getAlbum(title);
    }

    private Album getAlbum(String albumTitle) {
        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).getTitle().equals(albumTitle)) return albums.get(i);
        }
        return null;
    }

    private String listSongsInPlaylist() {
        StringBuilder sb = new StringBuilder();
        if (songs.size() > 0) {
            sb.append("This playlist has the following songs:\n");
            for (int i = 0; i < songs.size(); i++) {
                sb.append(songs.get(i).toString());
            }
        } else {
            sb.append("No songs found in this playlist.");
        }
        return sb.toString();
    }

    private String describeSong(Song song) {
        return song.toString();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }
}
