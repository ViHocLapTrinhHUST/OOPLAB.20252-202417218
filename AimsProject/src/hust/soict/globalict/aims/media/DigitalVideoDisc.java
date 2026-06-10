package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost, 0, "");
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle() + " (Length: " + this.getLength() + ")");
    }
    
    @Override
    public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
    }
}