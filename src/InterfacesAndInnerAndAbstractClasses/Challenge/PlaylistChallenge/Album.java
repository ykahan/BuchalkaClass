package InterfacesAndInnerAndAbstractClasses.Challenge.PlaylistChallenge;

import java.util.ArrayList;

public class Album {

    private Songlist songlist = new Songlist();
    private String title;

    private class Songlist{
        private ArrayList<Song> songsArrayList = new ArrayList<>();

        private void addSong(Song song){
            songsArrayList.add(song);
        }

        private Song findSong(String title){
            for(Song song: songsArrayList){
                if(song.getTitle().contentEquals(title)) return song;
            }
            return null;
        }

        private int size(){
            return songsArrayList.size();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            if (songlist.size() > 0) {
                for (int i = 0; i < songsArrayList.size(); i++) {
                    sb.append((i + 1) + ")\t" + songsArrayList.get(i).getTitle() + "\n");
                }
            } else sb.append("No songs found");
            return sb.toString();
        }
    }

    public Album(String title) {
        this.title = title;
    }

    public void addSong(Song song) {
        songlist.addSong(song);
    }

    public String getTitle(){
        return this.title;
    }

    public Song getSong(String title) {
        return songlist.findSong(title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.title);
        sb.append(songlist.toString());
        return sb.toString();
    }
}
