package hust.soict.dsai.aims.screen.manager;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;
public class StoreManagerScreenTest {
    public static void main(String[] args) {
        Store store = new Store();
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f));
        store.addMedia(new DigitalVideoDisc("Aladin", "Animation", 18.99f));
        new StoreManagerScreen(store);
    }
}