package Arrays_Second_Time.PlaylistChallenge;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs = new ArrayList<>();
    private String title;

    public Album(ArrayList<Song> songs, String title) {
        this.songs = songs;
        this.title = title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String getTitle(){
        return this.title;
    }

    public Song getSong(String name) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(name)) return songs.get(i);
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.title);
        sb.append("\n");
        if (songs.size() > 0) {
            for (int i = 0; i < songs.size(); i++) {
                sb.append((i + 1) + ")\t" + songs.get(i).getTitle() + "\n");
            }
        } else sb.append("No songs found");
        return sb.toString();
    }
}
