package Aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED){
			System.out.println("The cart has been full, take out another item to place\n");
		}
		else {
			System.out.println("The disc has been added\n");
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
		}
	}
	public void remoreDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty\n");
			return;
		}
		for(int i = 0; i < qtyOrdered; i++) {
			if (this.itemsOrdered[i].equals(disc)) {
				for (int j = i + 1; j < qtyOrdered; j ++) {
					itemsOrdered[j-1] = itemsOrdered[j];
				}
				qtyOrdered -= 1;
				System.out.println("The disc has been removed\n");
				return;
			}
		}
		System.out.println("There\'s no such disc\n");
	}
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
}