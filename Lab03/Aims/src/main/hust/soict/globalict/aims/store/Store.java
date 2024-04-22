package hust.soict.globalict.aims.store;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;




public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addDVD(Media media) {
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).equals(media)) {
                System.out.println("This media have been available in store!!!");
                return;
            }
        }

        itemsInStore.add(media);
        System.out.println("The disc have been added successfully!!!");
        return;
    }
    
    public void removeDVD(Media media) {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store have none media!!!");
            return;
        }
        if (itemsInStore.remove(media)) {
            System.out.println("The disc have been removed!!!");
            return;
        }
        System.out.println("There is no such disc!!!");
        return;
    }

    public void print() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println(String.valueOf(i + 1) + ". DVD - " + itemsInStore.get(i).getTitle());
        }
        System.out.println("********************************************");
    }
}
