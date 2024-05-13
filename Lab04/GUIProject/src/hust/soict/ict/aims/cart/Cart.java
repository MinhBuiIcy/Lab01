package hust.soict.ict.aims.cart;

import java.util.ArrayList;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;
import java.util.Collections;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    
    public int getNumberOfMedia() {
        return itemsOrdered.size();
    }
	public void addMedia(Media media) {
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED){
			System.out.println("The cart has been full, take out another item to place");
		}
		else {
			for (int i = 0; i < itemsOrdered.size(); i++) {
                if (itemsOrdered.get(i).equals(media)) {
                    System.out.println("This media have been available in cart!!!");
                    return;
                }
            }

            itemsOrdered.add(media);
            System.out.println("The disc have been added successfully!!!");
            return;
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
    
    public void placeOrder() {
        itemsOrdered.clear();
    }
    public void print() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(String.valueOf(i + 1) + ". Media - " + itemsOrdered.get(i).toString());
        }
        System.out.println("********************************************");
    }
    
    public Media searchMediaByTitle(String title) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getTitle().equals(title)) {
                return itemsOrdered.get(i);
            }
        }
        return null;
    }
    
    public void displaySortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("The cart ordered by Title and Cost:");
        this.print();
    }

    public void displaySortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("The cart ordered by Cost and Title:");
        this.print();
    }
}
