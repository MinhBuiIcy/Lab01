package hust.soict.globalict.aims.media;

import java.util.Comparator;
public abstract class Media {
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    private String title;
    private String category;
    private float cost;
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title) {
        this.title = title;
    }

    
    public String getTitle() {
		return title;
	}

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Media temp = (Media) o;
        return temp.getTitle() == this.getTitle();
    }
    
    public void print() {
        System.out.println("********************Media*******************");
        System.out.println("Media - " + title + " - " + category + " - " + cost);
        System.out.println("********************************************");
    }
}