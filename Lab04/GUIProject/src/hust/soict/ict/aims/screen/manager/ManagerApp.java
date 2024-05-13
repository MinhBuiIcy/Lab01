package hust.soict.ict.aims.screen.manager;

import java.util.ArrayList;

import hust.soict.ict.aims.media.Book;
import hust.soict.ict.aims.media.CompactDisc;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Track;
import hust.soict.ict.aims.store.Store;

public class ManagerApp {
    public static void main(String[] args) {
        Store store = new Store();
        ArrayList<String> authors = new ArrayList<>();
        authors.add("Author 1");
        store.addMedia(new Book("Motivation", "Inspiration", 10.0f, authors));
        store.addMedia(new Book("My little kitty", "Cute", 15.0f, authors));
        store.addMedia(new Book("Dune", "Adventure", 20.0f, authors));

        // Create and add 3 compact discs
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Track 1", 100));
        tracks.add(new Track("Track 2", 150));
        tracks.add(new Track("Track 3", 120));
        store.addMedia(new CompactDisc("Brave Shine", "Sound Track", "Aimer", 370, 25.0f, "Aimer", tracks));
        store.addMedia(new CompactDisc("Star Dust", "Sound Track", "Aimer", 420, 30.0f, "Aimer"));
        store.addMedia(new CompactDisc("Somebody's pressure", "Pop", "Lewis", 300, 20.0f, "Hedra"));

        // Create and add 3 digital video discs
        store.addMedia(new DigitalVideoDisc("DVD 1", "Category 7", "Director 1", 90, 10.0f));
        store.addMedia(new DigitalVideoDisc("DVD 2", "Category 8", "Director 2", 120, 15.0f));
        store.addMedia(new DigitalVideoDisc("DVD 3", "Category 9", "Director 3", 150, 20.0f));
        new StoreMangagerScreen(store);
    }
}
