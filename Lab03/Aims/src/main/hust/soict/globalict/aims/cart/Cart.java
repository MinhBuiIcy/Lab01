package hust.soict.globalict.aims.cart;

import java.util.ArrayList;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public void addMedia(Media media) {
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED){
			System.out.println("The cart has been full, take out another item to place");
		}
		else {
			System.out.println("The item has been added");
            itemsOrdered.add(media);
		}
	}
	public void removeMedia(Media media) {
		if (itemsOrdered.isEmpty()) {
			System.out.println("The cart is empty");
			return;
		}
		if (itemsOrdered.remove(media)) {
            System.out.println("The item have been removed!!!");
            return;
        }
        System.out.println("There is no such item!!!");
        return;
	}

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(String.valueOf(i + 1) + ". Media - " + itemsOrdered.get(i).toString());
        }
        System.out.println("********************************************");
    }

    public ArrayList<Media> searchMediaByTitle(String title) {
        ArrayList<Media> temp = new ArrayList<Media>();

        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getTitle() == title) {
                System.out.println("Disc with given title found at index " + String.valueOf(i) + ".");
                temp.add(new DigitalVideoDisc(itemsOrdered.get(i).getTitle(), itemsOrdered.get(i).getCategory(),
                        itemsOrdered.get(i).getCost()));
            }
        }
        
        if (temp.isEmpty()) {
            System.out.println("Not found!!!");
            return null;
        }
        else {
            return temp;
        }
    }
}
