package hust.soict.globalict.aims.store;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.DigitalVideoDisc;




public class Store {
    private ArrayList<DigitalVideoDisc> itemStore = new ArrayList<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < itemStore.size(); i++) {
            if (itemStore.get(i).equals(disc)) {
                System.out.println("This disc have been available in store!!!");
                return;
            }
        }

        itemStore.add(disc);
        System.out.println("The disc have been added successfully!!!");
        return;
    }
    
    public void removeDVD(DigitalVideoDisc disc) {
        if (itemStore.remove(disc)) {
            System.out.println("The disc have been removed!!!");
            return;
        }
        System.out.println("There is no such disc!!!");
        return;
    }

    public void print() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemStore.size(); i++) {
            System.out.println(String.valueOf(i + 1) + ". DVD - " + itemStore.get(i).getTitle());
        }
        System.out.println("********************************************");
    }
}
