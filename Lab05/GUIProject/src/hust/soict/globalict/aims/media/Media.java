package hust.soict.globalict.aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    
    private int id;
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

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Media media = (Media) o;
        return Float.compare(media.getCost(), getCost()) == 0 &&
               (title != null ? title.equals(media.getTitle()) : media.getTitle() == null);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (cost != +0.0f ? Float.floatToIntBits(cost) : 0);
        return result;
    }

    @Override
    public int compareTo(Media other) {
        if (other == null) {
            throw new NullPointerException("Comparing media object is null");
        }
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            return Float.compare(this.cost, other.cost);
        }
    }

    public void print() {
        System.out.println("********************Media*******************");
        System.out.println("Media - " + title + " - " + category + " - " + cost);
        System.out.println("********************************************");
    }
}
