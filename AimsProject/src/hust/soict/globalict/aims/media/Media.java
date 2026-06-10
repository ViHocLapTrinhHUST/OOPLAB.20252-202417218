package hust.soict.globalict.aims.media;
import java.util.Comparator;
public abstract class Media implements Comparable<Media> {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(String title, String category, float cost) {
        nbMedia++;
        this.id = nbMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public float getCost() { return cost; }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        try {
            Media media = (Media) obj;
            return this.title != null && this.title.equals(media.getTitle()) && this.cost == media.getCost();
        } catch (ClassCastException e) {
            return false;
        }
    }
    
    @Override
    public int compareTo(Media other) {
        if (other == null) throw new NullPointerException("Cannot compare to null");
        int titleCompare = this.title.compareTo(other.getTitle());
        if (titleCompare != 0) return titleCompare;
        return Float.compare(this.cost, other.getCost());
    }

    @Override
    public String toString() {
        return "Media - " + title + " - " + category + " - " + cost + " $";
    }
}