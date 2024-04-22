package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc {
	
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title,category,cost);
    }
    
	public DigitalVideoDisc(String title) {
		super(title);
		
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,director,length,cost);
	}

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category,director,cost);
    }
    
    public String toString() {
        String temp = "";
        temp = temp + super.getTitle() + " - ";
        temp = temp + super.getCategory()+ " - ";
        temp = temp + super.getDirector() + " - ";
        temp = temp + String.valueOf(getLength()) + ": ";
        temp = temp + String.valueOf(getCost()) + "$";
        return temp;
    }
}
