package hust.soict.globalict.test.disc;

import java.util.ArrayList;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class TestPassingParameter {
    public static void main(String[] args) {
        ArrayList<Media> media = new ArrayList<Media>();
        CompactDisc cd = new CompactDisc("alo", "adf", "Minh", 12, 4, "nam");
        DigitalVideoDisc dvd = new DigitalVideoDisc("alo", "adf", "Minh", 12, 4);
        media.add(dvd);
        media.add(cd);
        for (Media m : media) {
            System.out.println(m.toString());
        }
    }
    

}
