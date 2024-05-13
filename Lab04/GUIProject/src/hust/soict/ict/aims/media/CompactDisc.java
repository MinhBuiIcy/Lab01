package hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }
    public CompactDisc(String title, String category, String director, int length, float cost, String artist, ArrayList<Track> tracks ) {
        super(title, category, director, length, cost);
        this.artist = artist;
        this.tracks = tracks;
    }
    
    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        for (int i = 0; i < tracks.size(); i++) {
            if (tracks.get(i).equals(track)) {
                System.out.println("The track have already exists!!!");
                return;
            }
        }
        tracks.add(track);
        System.out.println("The track have been added sucessfully!!!");
        return;
    }

    public void removeTrack(Track track) {
        if (tracks.isEmpty()) {
            System.out.println("There\'s none!!!");
            return;
        }
        if (tracks.remove(track)) {
            System.out.println("The track have been removed!!!");
            return;
        }
        System.out.println("There is no such track!!!");
        return;
    }

    public int getLength() {
        int temp = 0;
        for (int i = 0; i < tracks.size(); i++) {
            temp += tracks.get(i).getLength();
        }
        return temp;
    }
    public void play() {
        for (int i = 0; i < tracks.size(); i++) {
            tracks.get(i).play();
        }
    }
}
