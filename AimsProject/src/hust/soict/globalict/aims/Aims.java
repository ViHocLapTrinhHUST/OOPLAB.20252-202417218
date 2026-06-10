package hust.soict.globalict.aims;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.store.Store;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        System.out.println("Welcome to AIMS! System initialized.");
        showMenu();
        // Console app ready for next lab
    }
}