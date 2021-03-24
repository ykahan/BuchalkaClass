package Arrays_Second_Time.PlaylistChallenge;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    String getTitle() {
        return title;
    }

    private double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: " + this.getTitle() + "\n");
        sb.append("Duration: " + this.getDuration() + "\n");
        for (int i = 0; i < 50; i++) {
            sb.append("=");
        }
        sb.append("\n");
        return sb.toString();
    }
}
