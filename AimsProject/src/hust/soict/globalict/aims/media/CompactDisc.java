package hust.soict.globalict.aims.media;

import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
        super(title, category, cost, length, director);
        this.artist = artist;
    }
    public void addTrack(Track track) {
        if (!tracks.contains(track)) tracks.add(track);
    }
    public void removeTrack(Track track) {
        tracks.remove(track);
    }
    @Override
    public int getLength() {
        int total = 0;
        for (Track t : tracks) total += t.getLength();
        return total;
    }
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle() + " by " + artist);
        for (Track track : tracks) track.play();
    }
    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + artist + " - " + getLength() + ": " + getCost() + " $";
    }
}