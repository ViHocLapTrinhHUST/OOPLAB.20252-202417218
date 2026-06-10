package hust.soict.dsai.aims.screen.manager;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;
import javax.swing.*;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store, "Add DVD to Store");

        centerPanel.add(new JLabel("Title:"));
        JTextField tfTitle = new JTextField();
        centerPanel.add(tfTitle);

        centerPanel.add(new JLabel("Category:"));
        JTextField tfCategory = new JTextField();
        centerPanel.add(tfCategory);

        centerPanel.add(new JLabel("Director:"));
        JTextField tfDirector = new JTextField();
        centerPanel.add(tfDirector);

        centerPanel.add(new JLabel("Length (mins):"));
        JTextField tfLength = new JTextField();
        centerPanel.add(tfLength);

        centerPanel.add(new JLabel("Cost:"));
        JTextField tfCost = new JTextField();
        centerPanel.add(tfCost);

        JButton btnAdd = new JButton("Add DVD");
        btnAdd.addActionListener(e -> {
            DigitalVideoDisc dvd = new DigitalVideoDisc(
                tfTitle.getText(), tfCategory.getText(),
                tfDirector.getText(), Integer.parseInt(tfLength.getText()),
                Float.parseFloat(tfCost.getText())
            );
            store.addMedia(dvd);
            JOptionPane.showMessageDialog(this, "DVD added successfully!");
            tfTitle.setText(""); tfCategory.setText("");
            tfDirector.setText(""); tfLength.setText(""); tfCost.setText("");
        });
        centerPanel.add(btnAdd);
    }
}