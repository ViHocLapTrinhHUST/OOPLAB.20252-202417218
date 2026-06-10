package hust.soict.dsai.aims.screen.manager;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.store.Store;
import javax.swing.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    public AddCompactDiscToStoreScreen(Store store) {
        super(store, "Add CD to Store");

        centerPanel.add(new JLabel("Title:"));
        JTextField tfTitle = new JTextField();
        centerPanel.add(tfTitle);

        centerPanel.add(new JLabel("Category:"));
        JTextField tfCategory = new JTextField();
        centerPanel.add(tfCategory);

        centerPanel.add(new JLabel("Director:"));
        JTextField tfDirector = new JTextField();
        centerPanel.add(tfDirector);

        centerPanel.add(new JLabel("Artist:"));
        JTextField tfArtist = new JTextField();
        centerPanel.add(tfArtist);

        centerPanel.add(new JLabel("Cost:"));
        JTextField tfCost = new JTextField();
        centerPanel.add(tfCost);

        JButton btnAdd = new JButton("Add CD");
        btnAdd.addActionListener(e -> {
            CompactDisc cd = new CompactDisc(
                tfTitle.getText(), tfCategory.getText(),
                Float.parseFloat(tfCost.getText()), 0,
                tfDirector.getText(), tfArtist.getText()
            );
            store.addMedia(cd);
            JOptionPane.showMessageDialog(this, "CD added successfully!");
            tfTitle.setText(""); tfCategory.setText("");
            tfDirector.setText(""); tfArtist.setText(""); tfCost.setText("");
        });
        centerPanel.add(btnAdd);
    }
}