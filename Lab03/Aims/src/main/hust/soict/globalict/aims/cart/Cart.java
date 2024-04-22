package hust.soict.globalict.aims.cart;

import java.util.ArrayList;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED){
			System.out.println("The cart has been full, take out another item to place");
		}
		else {
			System.out.println("The disc has been added");
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
		}
	}
	public void remoreDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty");
			return;
		}
		for(int i = 0; i < qtyOrdered; i++) {
			if (this.itemsOrdered[i].equals(disc)) {
				for (int j = i + 1; j < qtyOrdered; j ++) {
					itemsOrdered[j-1] = itemsOrdered[j];
				}
				qtyOrdered -= 1;
				System.out.println("The disc has been removed");
				return;
			}
		}
		System.out.println("There\'s no such disc");
	}

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("********************CART********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(String.valueOf(i + 1) + ". DVD - " + itemsOrdered[i].toString());
        }
        System.out.println("********************************************");
    }

    public ArrayList<DigitalVideoDisc> searchDVDByTitle(String title) {
        ArrayList<DigitalVideoDisc> temp = new ArrayList<DigitalVideoDisc>();

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle() == title) {
                System.out.println("Disc with given title found at index " + String.valueOf(i) + ".");
                temp.add(new DigitalVideoDisc(itemsOrdered[i].getTitle(), itemsOrdered[i].getCategory(),
                        itemsOrdered[i].getDirector(), itemsOrdered[i].getLength(), itemsOrdered[i].getCost()));
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
