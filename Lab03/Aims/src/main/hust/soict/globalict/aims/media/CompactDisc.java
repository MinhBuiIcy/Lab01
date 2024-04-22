package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;
    ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
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
}
