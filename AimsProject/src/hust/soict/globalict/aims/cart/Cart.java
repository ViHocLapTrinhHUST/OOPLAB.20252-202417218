package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;
public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) itemsOrdered.add(media);
    }
    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }
    public float totalCost() {
        float total = 0;
        for (Media m : itemsOrdered) total += m.getCost();
        return total;
    }
    public void printCart() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }
}