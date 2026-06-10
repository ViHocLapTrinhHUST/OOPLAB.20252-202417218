package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) itemsInStore.add(media);
    }
    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }
    public void printStore() {
        System.out.println("--- STORE INVENTORY ---");
        for (Media m : itemsInStore) System.out.println(m.toString());
    }
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}